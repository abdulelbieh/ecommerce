package com.abdul.ecommerce.api;

import com.abdul.ecommerce.api.util.EcommerceRequest;
import com.abdul.ecommerce.api.util.EcommerceResponse;
import com.abdul.ecommerce.service.OrderService;
import com.abdul.ecommerce.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abdul on 9/3/17.
 */

@Path("/order")
public class OrderApi {
    @Autowired
    OrderService orderService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public EcommerceResponse createOrder(EcommerceRequest<OrderDetails> request){
        EcommerceResponse response = new EcommerceResponse();
        Map<String,String> responseMap = new HashMap<String, String>();

        OrderDetails orderDetails = request.getEntity();
        try {
            orderService.createOrder(orderDetails);
            responseMap.put("value",Double.toString(orderDetails.getValue()));
            response.setResponseCode("200");
            response.setMessage("Success");
        }
        catch(Exception e){
            response.setResponseCode("404");
            response.setMessage("Error");
        }

        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EcommerceResponse getAllOrders(){
        EcommerceResponse response = new EcommerceResponse();

        List<OrderDetails> orders = orderService.getAllOrders();

        response.setEntity(orders);

        return response;
    }
}
