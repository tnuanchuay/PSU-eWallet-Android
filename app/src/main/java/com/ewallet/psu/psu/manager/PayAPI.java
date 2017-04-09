package com.ewallet.psu.psu.manager;

import com.ewallet.psu.psu.pay.view.model.Pay;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PayAPI {

    @GET("productPay")
    Call<Pay> getPlayer();
}
