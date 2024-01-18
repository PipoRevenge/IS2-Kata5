package software.ulpgc.kata5.fixerws;


import software.ulpgc.kata5.Currency;
import software.ulpgc.kata5.CurrencyLoader;
import software.ulpgc.kata5.fixerws.FixerCurrencyLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new FixerCurrencyLoader();
        List<Currency> currencies = currencyLoader.load();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}
