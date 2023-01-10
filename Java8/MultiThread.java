package Java8;

public class MultiThread {

    public static void main(String[] args) {
        /*Thread thr = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread is Running");
            }
        });*/
        for(int i=0; i<5; i++) {
            String thrname = ""+(i+1);
            Thread thr = new Thread(() -> {
                for(int j=0; j<5; j++) {
                    System.out.println("Task " + (j+1) + " is Running using Lambdas" + " on " + thrname);
                    //To demonstrate that each thread has its own state
                    if (thrname.equals("2"))
                        throw new NullPointerException();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            });
            thr.start();
//            System.out.println(thr.isAlive());
        }
    }
}
