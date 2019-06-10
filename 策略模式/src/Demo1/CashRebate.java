package Demo1;

/**
 * 打折收费
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;//将参数赋值给私有变量moneyRebate
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
