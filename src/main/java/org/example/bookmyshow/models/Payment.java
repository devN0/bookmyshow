package org.example.bookmyshow.models;

import org.example.bookmyshow.models.enums.PaymentStatus;
import org.example.bookmyshow.models.enums.PaymentType;

public abstract class Payment extends BaseModel {
    private float amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;

    public Payment(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
