package Multithreading;

public class ThreadIntro extends Thread{


    public static void main(String[] args) {

        ThreadIntro thread = new ThreadIntro();
        thread.setName("Thread01");
        thread.start();

    }
        @Override
        public void run() {
            System.out.println("thread is in running state now" + Thread.currentThread().getName());
            test();
            try {
                Thread.sleep(10);
                }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }

    void test(){
        System.out.println("call this from run()");
    }
}

