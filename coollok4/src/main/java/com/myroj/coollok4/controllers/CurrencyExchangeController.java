package com.myroj.coollok4.controllers;

import com.myroj.coollok4.requests.CurrencyExchangeRequest;
import com.myroj.coollok4.services.CurrencyExchangeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class CurrencyExchangeController {

    private final CurrencyExchangeService currencyExchangeService;

    public CurrencyExchangeController(CurrencyExchangeService currencyExchangeService) {
        this.currencyExchangeService = currencyExchangeService;
    }

    @PostMapping
    public ResponseEntity<Double> exchangeCurrency(@RequestBody @NotNull CurrencyExchangeRequest request) {
        double exchangedAmount = currencyExchangeService.exchange(request.getSourceCurrency(), request.getTargetCurrency(), request.getAmount());
        return ResponseEntity.ok(exchangedAmount);
    }
}
