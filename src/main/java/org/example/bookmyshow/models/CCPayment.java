package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.PaymentType;

public class CCPayment extends Payment {
    private String ccNumber;

    public CCPayment(String ccNumber){
        super(PaymentType.CC);
        this.ccNumber = ccNumber;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
}
