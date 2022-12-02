package THREAD.threadtest2;

import THREAD.thread1;


public class subthread extends Thread{
    thread1 thread=new thread1();
    public void run(){
        if(this.isDaemon()){
        System.out.println("daemon running thread 1");
        }
        System.out.println("bye !");

    }
}
