package demo.ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("demo.*")
@EnableJpaRepositories(basePackages = "demo.*")
@ComponentScan("demo.*")
@EntityScan("demo.*")
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableFeignClients 
public class ExtDemoApp {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "demo-server");
		SpringApplication.run(ExtDemoApp.class, args);
	}
}
