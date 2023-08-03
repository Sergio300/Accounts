package com.example.demo.Accounts;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SimpleInterestCalculator {

    public List<Payment> calculatePayments(Account account) {
        List<Payment> payments = new ArrayList<>();

        double principal = account.getAmount();
        double rate = account.getRate() / 100.0;
        int terms = account.getTerms();

        double weeklyInterest = principal * rate / terms;
        double remainingAmount = principal;

        for (int i = 1; i <= terms; i++) {
            double paymentAmount = i == terms ? remainingAmount : weeklyInterest;
            remainingAmount -= paymentAmount;

            Payment payment = new Payment();
            payment.setPaymentNumber(i);
            payment.setAmount(paymentAmount);
            payment.setPaymentDate(calculatePaymentDate(i));

            payments.add(payment);
        }

        return payments;
    }

    private Date calculatePaymentDate(int paymentNumber) {
        return new Date();
    }
}
