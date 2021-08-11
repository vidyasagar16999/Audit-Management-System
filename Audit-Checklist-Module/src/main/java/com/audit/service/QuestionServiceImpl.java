package com.audit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audit.model.AuditType;
import com.audit.model.Question;
import com.audit.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepo;
	
	//Audit CheckList Questions
	public List<Question> getQuestionsByAuditType(AuditType auditType){
		List<Question> qlist = questionRepo.getQuestionsByAuditType(auditType.getAuditType());
		return qlist;
	}

}