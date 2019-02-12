package com.rnd.razorpaypgsdkintegration.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentSuccessDetailsResponse {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("paymentDetails")
    @Expose
    private PaymentDetails paymentDetails;

    /**
     * No args constructor for use in serialization
     *
     */
    public PaymentSuccessDetailsResponse() {
    }

    /**
     *
     * @param result
     * @param paymentDetails
     */
    public PaymentSuccessDetailsResponse(String result, PaymentDetails paymentDetails) {
        super();
        this.result = result;
        this.paymentDetails = paymentDetails;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}
