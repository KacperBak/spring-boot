package de.kacperbak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/application.properties")
public class HelloConfig {


  @Autowired
  Environment env;

  @Bean
  public Hello hello(){
      return new Hello(env.getRequiredProperty("hello.message"));
  }
}
