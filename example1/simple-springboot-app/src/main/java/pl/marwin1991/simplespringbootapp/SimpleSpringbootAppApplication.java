package pl.marwin1991.simplespringbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
public class SimpleSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAppApplication.class, args);
	}

//	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(SimpleSpringbootAppApplication.class);
//		application.setDefaultProperties(getSystemProperties());
//		application.run(args);
//	}
//
//	public static Properties getSystemProperties(){
//		Logger log = LoggerFactory.getLogger(SimpleSpringbootAppApplication.class);
//		log.info("Kodowanie: " + Charset.defaultCharset().name());
//		Properties properties = new Properties();
//		Map<String,String> envies = System.getenv();
//		log.info("Przekaze parametry:");
//		envies.forEach((key, value) -> {
//			log.info(key+"="+value);
//			properties.put(key,value);
//		});
//		return properties;
//	}

}
