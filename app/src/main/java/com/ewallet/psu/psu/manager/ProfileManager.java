package com.ewallet.psu.psu.manager;

public class ProfileManager {

    public static PayAPI getPayApi(){
        return HTTPManager.getInstance().getRetrofit().create(PayAPI.class);
    }
}
