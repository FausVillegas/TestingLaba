package com.solvd.carina.demo;

import com.solvd.carina.demo.api.products.DeleteProduct;
import com.solvd.carina.demo.api.products.GetProduct;
import com.solvd.carina.demo.api.products.PostProduct;
import com.solvd.carina.demo.api.products.PutProduct;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class APILabaTest implements IAbstractTest {
    @Test
    public void getProductTest(){
        GetProduct getProduct = new GetProduct(2);
        getProduct.callAPIExpectSuccess();
        getProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");
    }

    @Test
    public void postProductTest(){
        PostProduct postProduct = new PostProduct();
        postProduct.setProperties("api/products/product.properties");
        postProduct.callAPIExpectSuccess();
        postProduct.validateResponse();
    }

    @Test
    public void putProductTest(){
        PutProduct putProduct = new PutProduct(2);
        putProduct.callAPIExpectSuccess();
        putProduct.validateResponse();
    }

    @Test
    public void deleteProductTest(){
        DeleteProduct deleteProduct = new DeleteProduct(2);
        deleteProduct.callAPIExpectSuccess();
    }
}
