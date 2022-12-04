package com.mcommerce.gatewayserver.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;



@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {
    Logger log = LoggerFactory.getLogger(this.getClass());

    public LogFilter() {
        super(Config.class);
    }
    @Override
    @Order(1)
    public GatewayFilter apply(Config  config) {
        return (exchange, chain) -> {
            ServerHttpRequest req = exchange.getRequest();
            log.info("**** Requête interceptée ! L'URL est : {} " , req.getPath().contextPath().value());
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                ServerHttpResponse res =exchange.getResponse();
                res.setStatusCode(HttpStatus.BAD_REQUEST);
                log.info(" CODE HTTP {} ", res.getStatusCode());

            }));
        };
    }
    public static class Config {

    }
}
