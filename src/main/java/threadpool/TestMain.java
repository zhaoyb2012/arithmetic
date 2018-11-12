package threadpool;

import com.google.common.collect.Lists;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        Pool pool = new ThreadPool(10);
        List<ResourceLoader> resourceLoaderList = Lists.newArrayList();
        for(int i=0;i<10;i++){
            ResourceLoader resourceLoader = new ResourceLoader();
            resourceLoaderList.add(resourceLoader);
        }
        for(int i=0;i<resourceLoaderList.size();i++){
            Executor executor = pool.getExecutor();
            Task task = resourceLoaderList.get(i);
            executor.setTask(task);
            executor.startTask();
        }
        pool.destory();
    }
}
