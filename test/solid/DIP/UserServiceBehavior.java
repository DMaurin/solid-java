package solid.DIP;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solid.common.DatabaseSpy;
import solid.common.SmtpClientSpy;
import solid.common.ValidationException;

public class UserServiceBehavior {
	
	private UserService service;

	@Before
	public void setUp() throws Exception {
		service = new UserService(new EmailServiceImplementation(), new DatabaseSpy());
		DatabaseSpy.userIsSaved(false);
		SmtpClientSpy.mailIsSent(false);
	}

	@Test
	public void shouldSaveUserToDatabaseWhenEmailIsValid() {
		
		service.register("toto@email.com", "toto");
		assertTrue(DatabaseSpy.userIsSaved());
	}

	@Test
	public void shouldSendEmailWhenEmailIsValid() throws ValidationException {
		
		service.register("toto@email.com", "toto");
		assertTrue(SmtpClientSpy.mailIsSent());
	}

	@Test(expected=ValidationException.class) 
	public void shouldThrowValidationExceptionWhenEmailIsNotValid() {
		service.register("totoemail.com", "toto");
		fail("should have thrown a Validation Exception");
	}

	@Test 
	public void shouldNotSaveUserWhenEmailIsNotValid() {
		
		try {
			service.register("totoemail.com", "toto");
		} catch (ValidationException e) {
		}

		assertFalse(DatabaseSpy.userIsSaved());
	}

	@Test 
	public void shouldNotSendEmailEmailIsNotValid() {
		
		try {
			service.register("totoemail.com", "toto");
		} catch (ValidationException e) {
		}

		assertFalse(SmtpClientSpy.mailIsSent());
	}
}
