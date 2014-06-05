package solid.SRP;

import solid.common.Database;
import solid.common.DatabaseSpy;
import solid.common.SmtpClientSpy;
import solid.common.User;
import solid.common.ValidationException;

public class UserService {
	
	private Database database;
	private EmailService emailService;

	public void register(String email, String password) throws ValidationException {
		emailService = new EmailService();
		emailService.validateEmail(email);
		
		database = new DatabaseSpy();
		User user = new User(email, password);
		database.save(user);
		
		sendWelcomeEmail(email);
	}

	private void sendWelcomeEmail(String email) {
		emailService.sendEmail(email, "Hello fool !");
	}
}
