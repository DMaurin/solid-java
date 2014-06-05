package solid.DIP;

import solid.common.Database;
import solid.common.User;
import solid.common.ValidationException;

public class UserService {

	private EmailService emailService;
	private Database database;

	public UserService(EmailService emailService, Database database) {
		this.emailService = emailService;
		this.database = database;
	}

	public void register(String email, String password)
			throws ValidationException {
		emailService.validateEmail(email);

		User user = new User(email, password);
		database.save(user);

		emailService.sendEmail(email);
	}

}
