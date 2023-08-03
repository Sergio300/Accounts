package com.example.demo.Accounts;

import lombok.Getter;
import lombok.Setter;

public class Account {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Double amount;
    @Getter
    @Setter
    private Integer terms;
    @Getter
    @Setter
    private Double rate;
    public Account() {
    }

    public Account(Double amount, Integer terms, Double rate) {
        this.amount = amount;
        this.terms = terms;
        this.rate = rate;
    }

}


/*
public class Account {
    @Getter
    @Setter
    private Integer payment_number;
    @Getter
    @Setter
    private double amount;
    @Getter
    @Setter
    private Integer terms;
    @Getter
    @Setter
    private double rate;
    @Getter
    @Setter
    private Date payment_date;

    public Account(double amount, Integer terms, double rate){
        this.amount=amount;
        this.terms=terms;
        this.rate=rate;

    }
}
*/
