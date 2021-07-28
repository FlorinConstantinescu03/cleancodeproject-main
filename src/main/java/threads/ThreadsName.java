package threads;
class MultiThreading extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + this.getName());
            sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}