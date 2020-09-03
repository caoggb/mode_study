package Singleton;

/**
 * 单例
 */
public class Singleton {

    public static void main(String[] args) {
    }

}

/**
 * 懒汉式-线程不安全
 */
class SingletonIdlerInsecurity {
    private static SingletonIdlerInsecurity singletonIdlerInsecurity;

    private SingletonIdlerInsecurity() {

    }

    public static SingletonIdlerInsecurity getSingletonIdlerInsecurity() {
        if (singletonIdlerInsecurity == null) {
            singletonIdlerInsecurity = new SingletonIdlerInsecurity();
        }
        return singletonIdlerInsecurity;
    }
}

/**
 * 懒汉式-线程安全
 * 对方法加锁，性能欠缺不推荐
 */
class SingletonIdlerSecurity {
    private static SingletonIdlerSecurity singletonIdlerSecurity;

    private SingletonIdlerSecurity() {

    }

    public static synchronized SingletonIdlerSecurity getSingletonIdlerInsecurity() {
        if (singletonIdlerSecurity == null) {
            singletonIdlerSecurity = new SingletonIdlerSecurity();
        }
        return singletonIdlerSecurity;
    }
}

/**
 * 双重校验锁-线程完全-性能更好
 */

class SingletonIdlerDoubleSecurity {

    private volatile static SingletonIdlerDoubleSecurity singletonIdlerDoubleSecurity;

    private SingletonIdlerDoubleSecurity() {

    }

    public static SingletonIdlerDoubleSecurity getSingletonIdlerDoubleSecurity() {
        if (singletonIdlerDoubleSecurity == null) {
            synchronized (SingletonIdlerDoubleSecurity.class) {
                if (singletonIdlerDoubleSecurity == null) {
                    singletonIdlerDoubleSecurity = new SingletonIdlerDoubleSecurity();
                }
            }
        }
        return singletonIdlerDoubleSecurity;
    }

}

class StaticSingleton {

    private StaticSingleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }


}


/**
 * 枚举实现
 */
enum ENUMSingleton {

    INSTANCE;

    private String objName;


    public String getObjName() {
        return objName;
    }


    public void setObjName(String objName) {
        this.objName = objName;
    }
}