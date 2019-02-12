package com.rnd.razorpaypgsdkintegration.razorpaysdk;

import android.content.Context;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;


/**
 * Created by Admin on 08-11-2017.
 */

public class InterceptorHTTPClientCreator {

    private static OkHttpClient defaultHttpClient;
    private static String uniqueID = null;
    private static final String PREF_UNIQUE_ID = "EVE_PREF_UNIQUE_ID";

    public static void createInterceptorHTTPClient(final Context context){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            defaultHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(
                            new Interceptor() {
                                @Override
                                public Response intercept(Chain chain) throws IOException {
                                    Request request = chain.request().newBuilder()
                                            .build();
                                    return chain.proceed(request);
                                }
                            })
                    .readTimeout(2, TimeUnit.MINUTES)
                    .addInterceptor(interceptor)
                    .build();
    }

    public static boolean isHttpClientNull(){
        return defaultHttpClient == null;
    }

    static OkHttpClient getOkHttpClient(){
        if (defaultHttpClient != null){
            return defaultHttpClient;
        }
        return null;
    }
    public static void clearOkHttpClient(){
        defaultHttpClient = null;
    }

}
