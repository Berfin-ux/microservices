package com.microservices.apigateway.router;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderServiceRouter {
    @Value("${order.service.url}")
    private String orderServiceUrl;

    @Bean
    public RouteLocator orderServiceRouteLocator(RouteLocatorBuilder builder) {

        return builder
                .routes()
                .route(
                        "order",
                        r ->
                                r.path("/api/v1/order/**")
                                        .or()
                                        .path("/v3/api-docs/order")
                                        .uri(orderServiceUrl))
                .build();
    }
}
