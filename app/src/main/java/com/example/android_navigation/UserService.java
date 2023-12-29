package com.example.android_navigation;
import retrofit2.http.Body;
import retrofit2.Call;
import retrofit2.http.POST;

public interface UserService {

    @POST("api/authentication/")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

}