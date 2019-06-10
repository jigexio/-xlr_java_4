package Demo1;

/**
 * 策略模式:定义了一系列的算法，分别封装起来，让他们之间可以互相替代，此模式让算法的变化不会影响到使用算法的客户。
 * 例子：商场收银软件，根据商场活动可以打折、满多少减多少等，用策略结合简单工厂实现。
 */
public class CashContext {
    private CashSuper cs;
    public CashContext(String type){
        switch(type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满400返260":
                cs = new CashReturn(400, 260);
                break;
            case "打85折":
                cs = new CashRebate(0.85);
                break;
        }
    }
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}

