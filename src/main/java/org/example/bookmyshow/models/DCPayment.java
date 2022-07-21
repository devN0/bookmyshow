package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.PaymentType;

public class DCPayment extends Payment {
    private String dcNumber;

    public DCPayment(String dcNumber) {
        super(PaymentType.DC);
        this.dcNumber = dcNumber;
    }

    public String getDcNumber() {
        return dcNumber;
    }

    public void setDcNumber(String dcNumber) {
        this.dcNumber = dcNumber;
    }
}
