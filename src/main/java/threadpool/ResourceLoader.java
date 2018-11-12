package threadpool;

public class ResourceLoader implements Task{
    @Override
    public void execute() {
        System.out.println("resourceLoader");
    }

    @Override
    public byte[] getResult() {
        return new byte[0];
    }
}
