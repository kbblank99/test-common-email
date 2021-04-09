package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.sql.Date;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	private static final String[] TEST_EMAIL = {"ab@bc.com", "a.b@c.org", 
			"abcdefghijklmnopqrstuvwyz@abcdefghijklmnopqrstuvwxyz.com.bd"};

	private String[] testValidChars = {" ", "a", "A", "\uc5ec", "0123456789", "01234567890123456789", "\n"};
	
	private String[] testNames = {"Ron", "Josh", "Drake", "Sammy", "Jane", "Sarah"};
	
	private String testNull = null;
	
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception{
		email = new EmailConcrete();
	}
	
	@After
	public void tearDownEmailTest() throws Exception{
		
	}

	@Test
	public void testAddBcc() throws Exception{
		email.addBcc(TEST_EMAIL);
		
		assertEquals(3, email.getBccAddresses().size());
	}

	@Test
	public void testAddCc() throws Exception{
		email.addCc(TEST_EMAIL[1]);
		
		assertEquals(3, email.getCcAddresses().size());
	}

}
