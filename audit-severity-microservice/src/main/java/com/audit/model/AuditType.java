package com.audit.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AuditType {
	
	private String auditType;
}
