package threadpool;

public interface Task {

    void execute();
    byte[] getResult();
}
