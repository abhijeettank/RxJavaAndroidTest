package com.creativeinfoway.rxjavaandroid;

import java.util.List;
import rx.Observable;

import retrofit2.http.GET;

/**
 * Created by Nitin on 08/08/17.
 */

public interface APIService {
    @GET("/json")
    Observable<List<ProductModel>> getproductdata();

}
