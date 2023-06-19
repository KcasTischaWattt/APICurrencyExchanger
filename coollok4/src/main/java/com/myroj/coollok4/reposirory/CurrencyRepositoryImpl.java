package com.myroj.coollok4.reposirory;

import com.myroj.coollok4.models.Currency;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CurrencyRepositoryImpl implements CurrencyRepository {
    private final List<Currency> currencies;

    public CurrencyRepositoryImpl() {
        currencies = new ArrayList<>();
    }

    @Override
    public List<Currency> findAll() {
        return currencies;
    }

    @Override
    public Currency findByCode(String code) {
        for (Currency currency : currencies) {
            if (currency.getCode().equals(code)) {
                return currency;
            }
        }
        return null;
    }

    @Override
    public void save(Currency currency) {
        currencies.add(currency);
    }

    @Override
    public void update(@NotNull Currency currency) {
        Currency existingCurrency = findByCode(currency.getCode());
        if (existingCurrency != null) {
            existingCurrency.setCode(currency.getCode());
            existingCurrency.setEvaluation(currency.getEvaluation());
        }
    }

    @Override
    public void delete(Currency currency) {
        currencies.remove(currency);
    }
}
