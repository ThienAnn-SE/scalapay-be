package com.demo.thienanse.util;

import com.demo.thienanse.entity.*;
import com.demo.thienanse.entity.request.OrderRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class convertUtil {
    private static final String redirectCancelUrl = "https://portal.integration.scalapay.com/failure-url";
    private static final String redirectConfirmUrl = "https://portal.integration.scalapay.com/success-url";
    private static final String currency = "EUR";
    public static Order convertOrderRequestToOrder(OrderRequest request){
        Order order = new Order();
        order.setTotalAmount(new Amount(currency, "500.00"));
        order.setConsumer(convertOrderInformationToConsumer(request));
        order.setShipping(convertOrderShippingToShipping(request));
        order.setMerchant(new Merchant(redirectCancelUrl, redirectConfirmUrl));
        order.setShippingAmount(new Amount(currency, "50.00"));
        order.setTaxAmount(new Amount(currency, "10.00"));
        order.setType("online");
        order.setProduct("pay-in-3");
        order.setFrequency(new Frequency(1, "monthly"));
        order.setMerchantReference("merchantOrder-1234");
        order.setOrderExpiryMilliseconds(100000);
        order.setItems(generateMockItems());
        return order;
    }

    private static Consumer convertOrderInformationToConsumer(OrderRequest request){
        Consumer consumer = new Consumer();
        consumer.setEmail(request.getOrderInformation().getEmail());
        consumer.setGivenNames(request.getOrderInformation().getGivenName());
        consumer.setSurname(request.getOrderInformation().getSurName());
        consumer.setPhoneNumber(request.getOrderInformation().getPhoneNumber());
        return consumer;
    }

    private static Shipping convertOrderShippingToShipping(OrderRequest request){
        Shipping shipping = new Shipping();
        shipping.setName(request.getOrderShipping().getName());
        shipping.setCountryCode(request.getOrderShipping().getCountryCode());
        shipping.setPostcode(request.getOrderShipping().getPostcode());
        shipping.setSuburb(request.getOrderShipping().getSuburb());
        shipping.setPhoneNumber(request.getOrderShipping().getShippingPhoneNumber());
        shipping.setLine1(request.getOrderShipping().getLine1());
        return shipping;
    }
    private static List<Item> generateMockItems(){
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Item item = new Item(
                    new Amount(currency, "100.00"),
                    "EAN",
                    1,
                    "T-shirt",
                    "Cloth",
                    "123",
                    "Off-brand",
                    "https://www.scalapay.com//product/view/",
                    "https://www.scalapay.com//product/view/"
            );
            items.add(item);
        }
        return items;
    }
}
