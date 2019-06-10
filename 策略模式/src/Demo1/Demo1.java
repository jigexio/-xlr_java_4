package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        //正常收费
        CashContext cc = new CashContext("正常收费");//讲对象实例化
        double totalPrices = cc.getResult(440);//原价
        System.out.println(totalPrices);
        //满400返260
        cc = new CashContext("满400返260");
        totalPrices = cc.getResult(440);//原价
        System.out.println(totalPrices);
    }
}
