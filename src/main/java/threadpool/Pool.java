package threadpool;

public interface Pool {

    Executor getExecutor();

    void destory();
}
