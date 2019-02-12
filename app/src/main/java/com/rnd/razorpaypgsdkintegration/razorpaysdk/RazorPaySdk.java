package com.rnd.razorpaypgsdkintegration.razorpaysdk;

import android.content.Context;

import com.rnd.razorpaypgsdkintegration.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RazorPaySdk {
    private final Retrofit retrofit;
    private Service service;

    private RazorPaySdk(Retrofit retrofit) {
        this.retrofit = retrofit;
        createService();
    }

    /**
     * Builder for {@link RazorPaySdk}
     */
    public static class Builder {
        public Builder() {
        }

        /**
         * Create the {@link RazorPaySdk} to be used.
         *
         * @return {@link RazorPaySdk}
         */
        public RazorPaySdk build(Context context) {
            Retrofit retrofit = null;
            String baseUrl = null;
            baseUrl = context.getResources().getString(R.string.base_url);
            if (InterceptorHTTPClientCreator.getOkHttpClient() != null) {
                retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(InterceptorHTTPClientCreator.getOkHttpClient())
                        .baseUrl(baseUrl)
                        .build();

                return new RazorPaySdk(retrofit);
            } else {
                retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
//                        .client(InterceptorHTTPClientCreator.getOkHttpClient())
                        .baseUrl(baseUrl)
                        .build();
            }
            return new RazorPaySdk(retrofit);
        }
    }

    private void createService() {
        service = retrofit.create(Service.class);
    }

    public Service getService(){
        return service;
    }
}
