package demo.ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

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
		
		System.setProperty("https.proxyHost", "pun-fsrprx.net.plm.eds.com");
	    System.setProperty("https.proxyPort", "3128");
	    System.setProperty("https.proxyUser", "avdm1h");
	    System.setProperty("https.proxyPassword", "t@rget100");
	    System.setProperty("https.nonProxyHosts", "localhost");
	    System.setProperty("https.keepAlive", "true"); 
		
		System.setProperty("http.proxyHost", "pun-fsrprx.net.plm.eds.com");
	    System.setProperty("http.proxyPort", "3128");
	    System.setProperty("http.proxyUser", "avdm1h");
	    System.setProperty("http.proxyPassword", "t@rget100");
	    System.setProperty("http.nonProxyHosts", "localhost");
	    System.setProperty("http.keepAlive", "true"); 
	    
	    
		System.setProperty("spring.config.name", "demo-server");
		SpringApplication.run(ExtDemoApp.class, args);
	}
	
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
