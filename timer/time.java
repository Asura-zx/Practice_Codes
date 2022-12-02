package timer;

import java.util.*;
public class time extends Thread{
    public static void main(String[] args) {
       

        Timer timer=new Timer();
        TimerTask task=new TimerTask() {
            public void run(){
                System.out.print("hello");
            }
        };
        timer.schedule(task, 1000);
        

    }


}
