package com.rnd.razorpaypgsdkintegration.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InsertOrderResponse {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("order")
    @Expose
    private Order order;

    /**
     * No args constructor for use in serialization
     *
     */
    public InsertOrderResponse() {
    }

    /**
     *
     * @param result
     * @param order
     */
    public InsertOrderResponse(String result, Order order) {
        super();
        this.result = result;
        this.order = order;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
