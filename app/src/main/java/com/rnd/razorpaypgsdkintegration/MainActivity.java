package com.rnd.razorpaypgsdkintegration;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import com.rnd.razorpaypgsdkintegration.razorpaysdk.InterceptorHTTPClientCreator;
import com.rnd.razorpaypgsdkintegration.razorpaysdk.RazorPaySdk;
import com.rnd.razorpaypgsdkintegration.razorpaysdk.Service;
import com.rnd.razorpaypgsdkintegration.responses.InsertOrderResponse;
import com.rnd.razorpaypgsdkintegration.responses.PaymentSuccessDetailsResponse;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//Card NO - 4111111111111111
//Expiry - 07/22
//Name - Gourav Kumar
//CVV - 123
//https://docs.razorpay.com/docs/checkout-form
public class MainActivity extends AppCompatActivity implements PaymentResultListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Preload payment resources
         */
        Checkout.preload(getApplicationContext());
    }

    public void onClickPay(View view) {
        InterceptorHTTPClientCreator.createInterceptorHTTPClient(getApplicationContext());
        Service service = new RazorPaySdk.Builder().build(this).getService();
        service.insertOrder("Rec_123456", "50000", "INR").enqueue(
                new Callback<InsertOrderResponse>() {
                    @Override
                    public void onResponse(Call<InsertOrderResponse> call, Response<InsertOrderResponse> response) {
                        startPayment(response.body().getOrder().getOrderId(),
                                response.body().getOrder().getAmount(),
                                response.body().getOrder().getCurrency(),
                                response.body().getOrder().getReceipt());
                    }

                    @Override
                    public void onFailure(Call<InsertOrderResponse> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void startPayment(String orderId, String amount, String currency, String receipt) {
        /**
         * Instantiate Checkout
         */
        Checkout checkout = new Checkout();

//        /**
//         * Set your logo here
//         */
//        checkout.setImage(R.drawable.ic_launcher_foreground);

        /**
         * Reference to current activity
         */
        final Activity activity = this;

        /**
         * Pass your payment options to the Razorpay Checkout as a JSONObject
         */
        try {
            JSONObject options = new JSONObject();

            /**
             * Merchant Name
             * eg: ACME Corp || HasGeek etc.
             */
            options.put("name", "Razor");

            /**
             * Description can be anything
             * eg: Order #123123
             *     Invoice Payment
             *     etc.
             */
            options.put("description", "Order: " + receipt);

            options.put("currency", currency);

            /**
             * Amount is always passed in PAISE
             * Eg: "500" = Rs 5.00
             */
            options.put("amount", amount);
            options.put("handler", "Yes");
            //https://docs.razorpay.com/v1/page/orders
//            Order ID generated via Orders API
            options.put("order_id", orderId);
//            Invoice ID generated via Payment link/Invoices API
//            options.put("invoice_id", "INV123456");
            checkout.setFullScreenDisable(true);
            JSONObject preFill = new JSONObject();
            preFill.put("email", "test@razorpay.com");
            preFill.put("contact", "9876543210");

            options.put("prefill", preFill);
            checkout.open(activity, options);
        } catch(Exception e) {
            e.printStackTrace();
//            Log.e(TAG, "Error in starting Razorpay Checkout", e);
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Result: " + s, Toast.LENGTH_SHORT).show();
        InterceptorHTTPClientCreator.createInterceptorHTTPClient(getApplicationContext());
        Service service = new RazorPaySdk.Builder().build(this).getService();
        service.getPaymentSuccessDetails(s).enqueue(
                new Callback<PaymentSuccessDetailsResponse>() {
                    @Override
                    public void onResponse(Call<PaymentSuccessDetailsResponse> call, Response<PaymentSuccessDetailsResponse> response) {
                        Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<PaymentSuccessDetailsResponse> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
        );
//        Checkout.clearUserData(this);
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "Result: " + s, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Result int: " + i, Toast.LENGTH_SHORT).show();
//        Checkout.clearUserData(this);
    }
}
