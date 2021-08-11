package com.audit.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuditDetail {
	
	@NotEmpty
	private String auditType;
	@NotBlank
	private Date auditDate;
	private List<AuditQuestion> auditQuestions;
}
