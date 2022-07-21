package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.PaymentType;

public class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String upiId){
        super(PaymentType.UPI);
        this.upiId = upiId;
    }
}
