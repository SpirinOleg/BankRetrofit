package com.example.a123.bankretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/rest/v2/currency/RUB")
    Call<Currency> getMyJSON();
}
