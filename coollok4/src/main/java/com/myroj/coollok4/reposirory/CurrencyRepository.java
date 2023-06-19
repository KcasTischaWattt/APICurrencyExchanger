package com.myroj.coollok4.reposirory;

import com.myroj.coollok4.models.Currency;

import java.util.List;

@Repository
public interface CurrencyRepository {
    List<Currency> findAll();
    Currency findByCode(String code);
    void save(Currency currency);
    void update(Currency currency);
    void delete(Currency currency);
}
