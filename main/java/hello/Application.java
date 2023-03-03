package hello;

import java.io.*;
import java.time.*;
import java.util.*;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/*
 https://github.com/spring-guides/gs-spring-boot-docker/blob/master/README.adoc

 */
@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Docker |" + LocalDateTime.now();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
