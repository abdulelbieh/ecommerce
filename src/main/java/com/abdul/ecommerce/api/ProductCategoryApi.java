package com.abdul.ecommerce.api;

import com.abdul.ecommerce.api.dto.ProductCategoryDto;
import com.abdul.ecommerce.api.util.EcommerceRequest;
import com.abdul.ecommerce.api.util.EcommerceResponse;
import com.abdul.ecommerce.service.ProductCategoryService;
import com.abdul.ecommerce.service.validation.ProductCategoryValidator;
import com.abdul.ecommerce.util.Exceptions.GenericException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by abdul on 9/11/17.
 */

@Path("/productcategory")
public class ProductCategoryApi {
    @Autowired
    ProductCategoryService productCategoryService;

    ProductCategoryValidator productCategoryValidator = new ProductCategoryValidator();

    @GET
    public EcommerceResponse getAllProductCategories(){
        EcommerceResponse ecommerceResponse = new EcommerceResponse();
        List<ProductCategoryDto> productCategories = productCategoryService.getAllProductCategories();
        ecommerceResponse.setEntity(productCategories);
        return ecommerceResponse;
    }

    @POST
    public EcommerceResponse createProductCategory(EcommerceRequest request) throws GenericException {
        EcommerceResponse response = new EcommerceResponse();
        ProductCategoryDto productCategory = (ProductCategoryDto)request.getEntity();
        if(productCategoryValidator.isValid(productCategory)){
            productCategoryService.createProductCategory(productCategory);
            response.setMessage("Success");
            response.setResponseCode("200");
        }
        else{
            throw  new GenericException();
        }
    }
}
