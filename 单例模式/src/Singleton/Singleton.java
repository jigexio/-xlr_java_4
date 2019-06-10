package Singleton;

/**
 * 单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * 多线程单例模式的实现
 */
public class Singleton {
    private static Singleton singleton;

    //默认构造方法
    private Singleton() {
    }

    synchronized public static Singleton GetStance() {
        try {
            if (singleton != null) {
            } else {
                Thread.sleep(3000);
                singleton = new Singleton();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}