package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    private CurrencyType type = CurrencyType.YEN;

    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / type.getRate();
    }

    @Override
    public CurrencyType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Yen";
    }
}
