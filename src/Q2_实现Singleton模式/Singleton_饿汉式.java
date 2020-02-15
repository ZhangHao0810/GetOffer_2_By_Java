package Q2_实现Singleton模式;

/**
 * @author ZhangHao
 * @date 2020/2/15 21:21
 * @Description： 饿汉式单例模式 私有化构造函数.最简单的方式
 * 所谓饿汉,就是希望想用这个实例的时候,能立即拿到,无需等待.
 * 通过static静态初始化的方式,在类第一次加载的时候,就有一个实例被创建出来.
 *  保证第一次想使用对象时候,已经被初始化好了.
 *
 *  由于实例在类被加载的时候就创建出来了,避免了线程安全的问题.
 *
 *   缺点: 会造成不必要的消耗,可能实例不会被用到
 *      而且类被多次加载的话,也会多次实例化.
 *
 *   解决方式: 1. 使用静态内部类的形式
 *            2. 使用懒汉式
 *
 */
public class Singleton_饿汉式 {

//    //在类内部定义
//    private static Singleton_饿汉式 instance;
//    static {
//        //实例化该实例
//        instance = new Singleton_饿汉式();
//    }

    //    内部 实例化一个对象.
    private static Singleton_饿汉式 instance = new Singleton_饿汉式();

    //    私有的构造函数.
    private Singleton_饿汉式() {
    }

    //    对外提供的获取实例的静态方法
    public static Singleton_饿汉式 getInstance() {
        return instance;
    }

}
