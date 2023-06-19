package com.myroj.coollok4.controllers;

import com.myroj.coollok4.services.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rates")
public class CurrencyRateController {

    private final CurrencyRateService currencyRateService;

    public CurrencyRateController(CurrencyRateService currencyRateService) {
        this.currencyRateService = currencyRateService;
    }

    @GetMapping
    public ResponseEntity<Map<String, Double>> getCurrencyRates() {
        Map<String, Double> rates = currencyRateService.getRates();
        return ResponseEntity.ok(rates);
    }
}
