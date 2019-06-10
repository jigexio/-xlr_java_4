package Proxy;
/**
 * 代理模式:为其他对象提供一种代理以控制这个对象的访问
 * 应用场合：1.远程代理:为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实
 *          2.虚拟代理:根据需要来创建很大的对象。通过它来存放实例化需要很长时间的真实对象
 *          3.安全代理：用来控制真实对象访问时的权限
 *          4.智能引领：当调用实的对象时，代理处理另外一些事
 * 例子：代理者帮助追求者送东西给被追求者
 */
public class Client {
    public static void main(String[] args) {

        SchoolGirl jiaojiao = new SchoolGirl();

        jiaojiao.setName("李娇娇");



        Proxy proxy = new Proxy(jiaojiao);

        proxy.GiveDolls();

        proxy.GiveFlowers();

        proxy.GiveChocolate();

    }

}

