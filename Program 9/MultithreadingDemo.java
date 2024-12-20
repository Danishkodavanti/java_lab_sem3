class DisplayMessage extends Thread {
    private String message;
    private int interval;

    public DisplayMessage(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval * 1000); // Convert seconds to milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        Thread thread1 = new DisplayMessage("BMS College of Engineering", 10);
        Thread thread2 = new DisplayMessage("CSE", 2);
        System.out.println("NAME:Danish \nUSN:1BM23CS086");
        thread1.start();
        thread2.start();
    }
}