package com.example.configserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigserverclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverclientApplication.class, args);
	}

}

@RefreshScope
@RestController
class ConfigController {
    @Value("${message:Default Hello}")
    private String message;


    @GetMapping("/message")
    public String getMessage() {
        return message;
    }


}
