package com.example.quizpraktikum.networking;

import com.example.quizpraktikum.model.Kos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<Kos> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<Kos> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("recommended-spaces")
    Call<List<Kos>> getRecommendedSpace();
}