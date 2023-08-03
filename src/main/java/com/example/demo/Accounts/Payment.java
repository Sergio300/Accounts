package com.example.demo.Accounts;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

public class Payment {
        @Getter
        @Setter
        private Long id;
        @Getter
        @Setter
        private Account account;
        @Getter
        @Setter
        private Integer paymentNumber;
        @Getter
        @Setter
        private Double amount;
        @Getter
        @Setter
        private Date paymentDate;

        public Payment() {
        }

        public Payment(Integer paymentNumber, Double amount, Date paymentDate) {
            this.paymentNumber = paymentNumber;
            this.amount = amount;
            this.paymentDate = paymentDate;
        }

        public Payment(Account account, Integer paymentNumber, Double amount, Date paymentDate) {
            this.account = account;
            this.paymentNumber = paymentNumber;
            this.amount = amount;
            this.paymentDate = paymentDate;
        }

    }

