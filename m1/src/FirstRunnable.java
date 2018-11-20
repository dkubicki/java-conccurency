public class FirstRunnable {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("I am running in " + Thread.currentThread().getName());

        Thread t = new Thread(runnable);
        t.setName("Thread 1");
        t.start();
    }
}
