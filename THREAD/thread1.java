package THREAD;

public class thread1 extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        thread1 thread=new thread1();
        thread.start();
        while(thread.isAlive()) {
            System.out.println("Waiting...");
          }
          // Update amount and print its value
          System.out.println("Main: " + amount);
          amount++;
          System.out.println("Main: " + amount);

    }
    public void run(){
        amount++;

    }
}
