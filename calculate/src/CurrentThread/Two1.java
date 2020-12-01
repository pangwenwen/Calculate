package CurrentThread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Two1 {
    static Thread thread1 = null;
    static Thread thread2 = null;
    static AtomicBoolean isOk = new AtomicBoolean(false);
    static AtomicBoolean isMM = new AtomicBoolean(false);

    public static void locksupport_op(){
        char[] charA = new char[]{'a','b','c','d','e','f','g','h'};
        char[] charN = new char[]{'1','2','3','4','5'};

        thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char c:charA){
                    System.out.print(c);
                    if (!isOk.get()){
                        isOk.set(true);
                        if (isMM.get()){
                            LockSupport.unpark(thread2);
                        }
                        isMM.set(true);
                        LockSupport.park();
                    }
                }
            }
        });

        thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char c:charN){
                    System.out.print(c);
                    if (isOk.get()){
                        isOk.set(false);
                        LockSupport.unpark(thread1);
                        LockSupport.park();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void op(){
        char[] charA = new char[]{'a','b','c','d','e','f','g','h'};
        char[] charN = new char[]{'1','2','3','4','5'};

        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    for (char c:charA){
                        System.out.print(c);
                        condition2.signal();
                        condition1.await();
                    }
//                    condition2.signal();
                    lock.unlock();
                }catch (Exception e){

                }

            }
        },"t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    for (char c:charN){
                        System.out.print(c);
                        condition1.signal();
                        condition2.await();
                    }
//                    condition1.signal();
                    lock.unlock();
                }catch (Exception e){

                }
            }
        },"t2").start();
    }

    public static void main(String[] args) {
        op();

//        locksupport_op();
//        LockSupport.unpark(Thread.currentThread());
//        System.out.println("test 1----");
//        LockSupport.park();
//        System.out.println("test 2----");
//        LockSupport.park();
//        System.out.println("test 3----");
    }
}
