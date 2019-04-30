package com.akhil.akhildixit.UpgradIntern;

import com.akhil.akhildixit.UpgradIntern.CustomDataTypes.QuestionItems;
import com.akhil.akhildixit.UpgradIntern.CustomDataTypes.TagItems;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StackExchangeAPI {
    @GET("tags")
    Call<TagItems> getTags(@Query("order") String order, @Query("sort") String sort, @Query("site") String site);

    @GET("questions")
    Call<QuestionItems> getQuestions(@Query("tagged") String tag, @Query("order") String order, @Query("sort") String sort, @Query("site") String site);
}
