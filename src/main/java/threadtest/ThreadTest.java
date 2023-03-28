package threadtest;


class MyThread extends Thread{
    public void run()
    {
        int count=1;

        while(true){
            System.out.println(count++ + "  My thread");
            }
        }
    }
public class ThreadTest
  {
    public static void main(String[] args) throws Exception

        {
        MyThread t = new MyThread();
         t.setDaemon(true);  //When main thread terminating, Daemon thread also terminate
        t.start();
                     //        try{Thread.sleep(100);} catch(Exception e){}
            int count=1;

            while(true){
             //   System.out.println(count++ + " Main");
                //Thread.yield();  //yield() make main method wait for other threads
            }

    }
}
