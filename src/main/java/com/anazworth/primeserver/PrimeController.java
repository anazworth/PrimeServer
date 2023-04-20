package com.anazworth.primeserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @GetMapping("/primes/{number}")
    public Boolean getPrimes(@PathVariable Integer number) {
        return isPrime(number);
    }

    private Boolean isPrime(Integer number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
