package com.salazar.munidenuncias.Service;

import com.salazar.munidenuncias.model.Denuncia;
import com.salazar.munidenuncias.model.User;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by linderhassinger on 11/13/17.
 */

public interface ApiService {

    String API_BASE_URL = "https://munidenuncias-mrpapita.c9users.io/";

    @GET("api/v1/loginUsers")
    Call<List<User>> getUsers();

    @FormUrlEncoded
    @POST("/api/v1/login")
    Call<ResponseMessage> loginUser
                (@Field("username")String nombre,
                 @Field("password") String password
    );

    @GET("api/v1/denuncias")
    Call<List<Denuncia>> getDenuncias();

    @FormUrlEncoded
    @POST("api/v1/register")
    Call<ResponseMessage> registrarUsuario(
            @Field("username") String username,
            @Field("correo") String correo,
            @Field("password") String password);





    @FormUrlEncoded
    @POST("/api/v1/denuncias")
    Call<ResponseMessage>
    createDenuncia(@Field("titulo")String titulo,
                   @Field("descripcion") String descripcion,
                   @Field("ubicacion") String ubicacion);
    @Multipart
    @POST("/api/v1/denuncias")
    Call<ResponseMessage> createDenunciaWithImage(
            @Part("titulo") RequestBody titulo,
            @Part("descripcion") RequestBody descripcion,
            @Part("ubicacion") RequestBody ubicacion,
            @Part MultipartBody.Part imagen
    );




}
