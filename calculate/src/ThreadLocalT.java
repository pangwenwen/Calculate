public class ThreadLocalT {

    private static ThreadLocal<String> mThreadLocal = new ThreadLocal<>();

    private static void print(String str){
        System.out.println(str+":"+mThreadLocal.get());
        // 清除当先线程本地内存中ThreadLoccal 变量的值
        mThreadLocal.remove();
    }

    public static void main(String[] args) {

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                mThreadLocal.set("I am One");
                print("threadOne");
                System.out.println(mThreadLocal.get());
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                mThreadLocal.set("I am Two");
                print("threadTwo");
                System.out.println(mThreadLocal.get());
            }
        });

        threadOne.start();
        threadTwo.start();
    }
}
