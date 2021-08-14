package com.audit.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

public class AuthenticationResponseTest {
 
	@Test
	void testNoArgsAuditType()
	{
		assertThat(new AuthenticationResponse()).isNotNull();
	}
	
	@Test
	void testAllArgsAuditType()
	{
		AuthenticationResponse authenticationResponse = new AuthenticationResponse("akhil","Project1",true);
		
		assertThat(assertThat(authenticationResponse).isNotNull());
	}
	@Test
	void testSetterAuditType()
	{
		AuthenticationResponse a = new AuthenticationResponse();
		
		assertThat(assertThat(a).isNotNull());
	}
	@Test
	void testAuditType() {
		EqualsVerifier.simple().forClass(AuthenticationResponse.class).verify();
	}
	
}
