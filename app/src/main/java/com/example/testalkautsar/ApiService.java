package com.example.testalkautsar;

import com.example.testalkautsar.model.MovieResponse;
import com.loopj.android.http.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search/movie?api_key=b5a9de87a5ad62c82342ed3191caa55b")
    Call<MovieResponse> getItemSearch(@Query("query") String movie_name);

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlaying(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<MovieResponse> getUpcoming(@Query("api_key") String apiKey);
}
