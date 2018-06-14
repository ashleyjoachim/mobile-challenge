package com.ashleyjoachim.mobile_challenge.networking;

import com.ashleyjoachim.mobile_challenge.model.MovieWrapper;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieAPICall {

    @GET()
    Observable<MovieWrapper> getMovieDiscover(
            @Query("api_key") String api_key

    );

}
