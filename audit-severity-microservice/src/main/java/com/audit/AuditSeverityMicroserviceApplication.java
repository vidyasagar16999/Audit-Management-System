package com.audit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
public class AuditSeverityMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditSeverityMicroserviceApplication.class, args);
	}

}