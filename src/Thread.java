//just for me
public class Thread {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Thread thread1 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                int a = 2;
                int b = 2;
                System.out.println(a + b);
            }
        });
        thread1.start();
        thread1.join();

        java.lang.Thread thread2 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                int a = 57;
                int b = 43;
                System.out.println(a + b);
            }
        });
        thread2.start();
        thread2.join();

        java.lang.Thread thread3 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                int a = 123456789;
                int b = 673243342;
                System.out.println(a + b);
            }
        });
        thread3.start();
    }
}
