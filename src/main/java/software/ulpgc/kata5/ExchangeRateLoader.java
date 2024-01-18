package software.ulpgc.kata5;



public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to);
}
