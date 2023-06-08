package druid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class MybatisDruidDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDruidDemoApplication.class, args);
	}

}
