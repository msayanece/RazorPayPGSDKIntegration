package com.rnd.razorpaypgsdkintegration.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("orderId")
    @Expose
    private String orderId;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("amountPaid")
    @Expose
    private String amountPaid;
    @SerializedName("amountDue")
    @Expose
    private String amountDue;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("receipt")
    @Expose
    private String receipt;
    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("attempts")
    @Expose
    private String attempts;

    /**
     * No args constructor for use in serialization
     *
     */
    public Order() {
    }

    /**
     *
     * @param amount
     * @param status
     * @param attempts
     * @param amountPaid
     * @param receipt
     * @param amountDue
     * @param offerId
     * @param orderId
     * @param currency
     */
    public Order(String orderId, String amount, String amountPaid, String amountDue, String currency, String receipt, String offerId, String status, String attempts) {
        super();
        this.orderId = orderId;
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountDue = amountDue;
        this.currency = currency;
        this.receipt = receipt;
        this.offerId = offerId;
        this.status = status;
        this.attempts = attempts;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(String amountDue) {
        this.amountDue = amountDue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttempts() {
        return attempts;
    }

    public void setAttempts(String attempts) {
        this.attempts = attempts;
    }
}
