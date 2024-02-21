public class Test {
    public static void main(String[] args) {
        MyRunable run = new MyRunable();
        Thread thread1 = new Thread(run,"luông A");
        Thread thread2 = new Thread(run,"luông B");
        thread1.start();
        thread2.start();
    }
}
