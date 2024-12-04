public class MySemaphore {

    private int permits;
    private final Object lock = new Object();

    public MySemaphore(int permits) {
        this.permits = permits;
    }



}
