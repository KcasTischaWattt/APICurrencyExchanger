package com.myroj.coollok4.services;

import com.myroj.coollok4.models.Currency;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {


    public CurrencyExchangeService() {
    }

    public double exchange(@NotNull Currency sourceCurrency, @NotNull Currency targetCurrency, double amount) {
        double sourceEvaluation = sourceCurrency.getEvaluation();
        double targetEvaluation = targetCurrency.getEvaluation();

        if (sourceEvaluation != 0 && targetEvaluation != 0) {
            double exchangeRate = targetEvaluation / sourceEvaluation;
            return amount * exchangeRate;
        } else {
            throw new IllegalArgumentException("Invalid evaluation for the currencies");
        }
    }

}
