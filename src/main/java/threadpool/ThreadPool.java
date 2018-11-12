package threadpool;

import com.google.common.collect.Lists;

import java.util.LinkedList;

public class ThreadPool implements Pool {

    private boolean isShut;
    private LinkedList pool;
    private int size;

    public ThreadPool(int size){
        this.size=size;
        isShut = false;
        pool = Lists.newLinkedList();
        for(int i=0;i<size;i++){
            Executor executor = new ExecutorImpl();
            pool.add(executor);
        }
    }

    @Override
    public Executor getExecutor() {
        Executor executor = null;
        if(pool.size()>0){
            executor = (Executor) pool.removeFirst();
        }else{
            try {
                pool.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executor = (Executor) pool.removeFirst();
        }
        return executor;
    }

    @Override
    public void destory() {
        synchronized (pool){
            isShut = true;
            pool.notifyAll();
            pool.clear();
        }

    }
    private class ExecutorImpl extends Thread implements Executor{

        private Task task;
        private Object lock = new Object();

        public ExecutorImpl(){}

        @Override
        public void setTask(Task task) {
            this.task = task;
        }

        @Override
        public Task getTask() {
            return this.task;
        }

        @Override
        public void startTask() {
            synchronized (lock) {
                lock.notify();
            }
        }

        public void run(){
            while (!isShut){
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                getTask().execute();
                synchronized (pool) {
                    pool.addFirst(ExecutorImpl.this);
                    pool.notify();
                }
            }
        }
    }
}


