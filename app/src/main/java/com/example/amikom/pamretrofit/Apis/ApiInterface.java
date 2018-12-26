package com.example.amikom.pamretrofit.Apis;

import com.example.amikom.pamretrofit.Model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by amikom on 26/12/2018.
 */

@SuppressWarnings("unused")
public interface ApiInterface {
    @GET("bins/fp494")
    Call<List<ModelData>> getPemain();
}
