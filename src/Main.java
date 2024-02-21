//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bắt đầu chạy Main");
//        Cách khởi tạo luồng
    // Cách 1 : Thread
        Thread thread = new MyThread("Luồng 1");
        System.out.println(thread.getName());
        // chạy luồng
        thread.start();
        // cách 2 : Runable
        Runnable runnable = ()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("100 số tự nhiên đầu tiên là");
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        };
        Thread thread1  = new Thread(runnable,"luồng 2");
        thread1.start();
        thread1.join(); // chờ đợi  luồng thực thi xong thì các luồng khác thc thi tiếp
        System.out.println(thread1.getName());

        System.out.println("Kết thúc chạy main");

    }

}