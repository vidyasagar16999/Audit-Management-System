package com.audit.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.audit.model.AuditBenchmark;
import com.audit.repository.AuditBenchmarkRepo;
import com.audit.service.AuditBenchmarkServiceImpl;

@SpringBootTest
class AuditBenchmarkServiceTests {
	
	@Mock
	AuditBenchmarkRepo auditBenchmarkRepo;
	
	@InjectMocks
	AuditBenchmarkServiceImpl auditBenchmarkServiceImpl;
	
	@Test
	public void contextLoads() throws Exception {
		assertNotNull(auditBenchmarkServiceImpl);
	}
	
	@Test
	public void testGetAuditBenchmarkList() {
		List<AuditBenchmark> auditBenchmarkList = new ArrayList<>();
		auditBenchmarkList.add(new AuditBenchmark(1,"Internal",3));
		auditBenchmarkList.add(new AuditBenchmark(2,"SOX",1));
		
		when(auditBenchmarkRepo.findAll()).thenReturn(auditBenchmarkList);
		
		assertEquals(auditBenchmarkList, auditBenchmarkServiceImpl.getAuditBenchmarkList());
	}
	
	
}
