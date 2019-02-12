package com.rnd.razorpaypgsdkintegration.razorpaysdk;

import com.rnd.razorpaypgsdkintegration.responses.InsertOrderResponse;
import com.rnd.razorpaypgsdkintegration.responses.PaymentSuccessDetailsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;


/**
 * Created by Admin on 23-10-2017.
 */

public interface Service {

    @POST("/order.php")
    Call<InsertOrderResponse> insertOrder(@Field("receiptId") String receiptId, @Field("amount") String amount, @Field("currency") String currency);

    @POST("/payment.php")
    Call<PaymentSuccessDetailsResponse> getPaymentSuccessDetails(@Field("paymentId") String paymentId);
}

