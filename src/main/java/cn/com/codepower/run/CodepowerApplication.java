package cn.com.codepower.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"cn.com.codepower"})
public class CodepowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodepowerApplication.class, args);
	}
}
