package com.myroj.coollok4.services;

import com.myroj.coollok4.models.Currency;
import com.myroj.coollok4.reposirory.CurrencyRepository;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CurrencyRateService {

    private final CurrencyRepository currencyRepository;

    public CurrencyRateService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public Map<String, Double> getRates() {
        List<Currency> currencies = currencyRepository.findAll();
        Map<String, Double> rates = new HashMap<>();

        for (Currency sourceCurrency : currencies) {
            for (Currency targetCurrency : currencies) {
                if (!sourceCurrency.getCode().equals(targetCurrency.getCode())) {
                    double sourceEvaluation = sourceCurrency.getEvaluation();
                    double targetEvaluation = targetCurrency.getEvaluation();

                    if (sourceEvaluation != 0 && targetEvaluation != 0) {
                        double exchangeRate = targetEvaluation / sourceEvaluation;
                        String currencyPair = sourceCurrency.getCode() + "/" + targetCurrency.getCode();
                        rates.put(currencyPair, exchangeRate);
                    }
                }
            }
        }

        return rates;
    }
}

