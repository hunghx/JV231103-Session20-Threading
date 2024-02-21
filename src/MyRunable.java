public class MyRunable implements Runnable{
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public MyRunable(String name) {
//        this.name = name;
//    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("luông : %d \n",i);
        }
    }
}
