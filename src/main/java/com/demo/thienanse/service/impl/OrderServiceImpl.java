package com.demo.thienanse.service.impl;

import com.demo.thienanse.config.Mapper;
import com.demo.thienanse.config.exception.ApiException;
import com.demo.thienanse.entity.Order;
import com.demo.thienanse.entity.request.OrderRequest;
import com.demo.thienanse.entity.response.OrderResponse;
import com.demo.thienanse.service.OrderService;
import com.demo.thienanse.util.convertUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OrderServiceImpl implements OrderService {
    @Value("${app.scala-pay.url.order.create}")
    private String URL;
    @Value("${app.scala-pay.authorization}")
    private String AUTHORIZATION;
    private final Mapper mapper;

    public OrderServiceImpl(Mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public OrderResponse createOrder(OrderRequest order) {
        String json;
        try {
            json = mapper.getObjectMapper().writeValueAsString(convertUtil.convertOrderRequestToOrder(order));
        }catch (JsonProcessingException e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR).withMessage("Đã có lỗi xảy ra");
        }
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder()
                .url(URL)
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("Authorization", AUTHORIZATION)
                .build();

        try(Response response = client.newCall(request).execute()){
            if(response.code() == 200){
                return mapper.getObjectMapper().readValue(response.body().string() , OrderResponse.class);
            }else {
                System.out.println(response.body().string());
                throw new ApiException(HttpStatus.BAD_REQUEST).withMessage("Khong thanh cong");
            }
        }catch (IOException e){
            e.printStackTrace();
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR).withMessage("Đã có lỗi xảy ra");
        }
    }
}
