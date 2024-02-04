package com.solvd.carina.demo.api.products;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

import java.io.ObjectInputFilter;

@Endpoint(url = "${config.api_url}/products/${product_id}", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProduct extends AbstractApiMethodV2 {
    public GetProduct(int productId){
        replaceUrlPlaceholder("product_id", String.valueOf(productId));
    }
}
