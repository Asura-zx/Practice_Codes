package THREAD.threadtest2;

import THREAD.thread1;

public class mainthread extends Thread{
    public static void main(String[] args) {
        subthread thread=new subthread();
        System.out.println(thread.isAlive()); //false because not yet initiated
        thread.setDaemon(true);

        thread.start();
        System.out.println(thread.isAlive()); //true because initiated
        //System.out.println(thread.getName());
        //System.out.println(thread.activeCount()); //2

        /*there are 2 kinds of threads: active thread and daemon thread. active thread works in the forground while daemon thread works in the background
         * daemon threads are low priority threads that performs activities like garbage collector
         * JVM terminates itself when all active threads terminates(not daemon threads)
         * 
         */
        System.out.println(thread.isDaemon());//false

    
}
}
