package THREAD.MULTITHREADING;

public class subthread implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        System.out.println("Bye !");
    }
}
