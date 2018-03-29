package dk.cristi.app.webshop.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class WebShopGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebShopGatewayServerApplication.class, args);
	}
}
