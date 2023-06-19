package com.myroj.coollok4.requests;

import com.myroj.coollok4.models.Currency;

public class CurrencyExchangeRequest {
    private Currency sourceCurrency;
    private Currency targetCurrency;
    private double amount;

    public CurrencyExchangeRequest() {
    }

    public CurrencyExchangeRequest(Currency sourceCurrency, Currency targetCurrency, double amount) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(Currency sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(Currency targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


