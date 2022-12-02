package THREAD;

public class threadtest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getState());//Runnable

        System.out.println(Thread.currentThread().getPriority());//0-10 least to most
        Thread.currentThread().setPriority(10);//highest priority
        System.out.println(Thread.currentThread().getPriority());//0-10 least to most


        System.out.println(Thread.currentThread().isAlive());//true or false

        for(int i=1; i<=3;i++){
            System.out.println(i);
            Thread.sleep(1000);//sleeps for 1sec after each iteration
        }
        System.out.println("hello !");


    }
    
}
