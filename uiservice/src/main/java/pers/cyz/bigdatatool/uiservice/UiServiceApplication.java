package pers.cyz.bigdatatool.uiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication

public class UiServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(UiServiceApplication.class, args);
	}

}
