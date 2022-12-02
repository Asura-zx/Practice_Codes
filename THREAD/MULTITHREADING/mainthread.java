package THREAD.MULTITHREADING;

public class mainthread extends Thread{
    public static void main(String[] args) {
        mainthread Thread=new mainthread();
        subthread sbthrd=new subthread();//instance of a class
        Thread thread2=new Thread(sbthrd);//class as a thread
        thread2.start();
        for(int j=4;j>=1;j--){
            System.out.println(j);
            try {
                mainthread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        System.out.println("hello !");;
    }
    
}
