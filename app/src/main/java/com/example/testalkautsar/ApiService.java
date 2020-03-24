package com.example.testalkautsar;

import com.example.testalkautsar.model.MovieResponse;
import com.example.testalkautsar.BuildConfig;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("search/movie?api_key="+ BuildConfig.API_KEY)
    Call<MovieResponse> getItemSearch(@Query("query") String movie_name);

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlaying(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<MovieResponse> getUpcoming(@Query("api_key") String apiKey);
}
