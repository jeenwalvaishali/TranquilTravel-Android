package com.jeenwalv.tranquiltravels.server;

import com.jeenwalv.tranquiltravels.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/users/register")
    Call<User> registerUser(@Body User user);

    @POST("/api/users/login")
    Call<User> loginUser(@Body User user);
}
