package software.ulpgc.kata5.mocks;

import software.ulpgc.kata5.*;

public class MockMoneyDisplay implements MoneyDisplay {
    @Override
    public void show(Money money) {
        System.out.println(money);
    }
}
