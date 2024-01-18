package software.ulpgc.kata5.mocks;



import software.ulpgc.kata5.Currency;
import software.ulpgc.kata5.ExchangeRate;
import software.ulpgc.kata5.ExchangeRateLoader;

import java.time.LocalDate;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, LocalDate.now(), 1.218);
    }
}
