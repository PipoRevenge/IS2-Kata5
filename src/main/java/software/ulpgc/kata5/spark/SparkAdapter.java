package software.ulpgc.kata5.spark;

public interface SparkAdapter {
    String getExchangeRate(String fromCurrency, String toCurrency, double amount);
}
