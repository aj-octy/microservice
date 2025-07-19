package com.socialapp.auth_server;

import com.socialapp.auth_server.dto.AuthServerContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "com.socialapp.auth_server")
@EnableConfigurationProperties(AuthServerContactInfoDto.class)
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}

}
