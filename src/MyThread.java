import java.util.Scanner;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000); // ngủ 5 giây
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Nhập số cần kiểm tra");
        Integer num = new Scanner(System.in).nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        if (flag&&num>=2){
            System.out.printf("%d là số nguyên tố",num);
        }else {
            System.out.printf("%d ko là số nguyên tố",num);
        }
    }
}
