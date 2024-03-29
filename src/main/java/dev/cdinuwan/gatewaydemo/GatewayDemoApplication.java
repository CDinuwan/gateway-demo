package dev.cdinuwan.gatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayDemoApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/posts/**")
//						.filters(f -> f
//							.prefixPath("/api")
//							.addResponseHeader("X-Powered-By","DanSON Gateway Service")
//						)
//						.uri("http://localhost:8081")
//				)
//				.route(r -> r.path("/comments/**")
//						.filters(f -> f
//								.prefixPath("/api")
//								.addResponseHeader("X-Powered-By","DanSON Gateway Service")
//						)
//						.uri("http://localhost:8082")
//				)
//				.build();
//	}

}
