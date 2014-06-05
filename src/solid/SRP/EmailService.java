package solid.SRP;

import solid.common.MailMessage;
import solid.common.SmtpClientSpy;
import solid.common.ValidationException;

public class EmailService {
	
	private SmtpClientSpy smtpClient;

	void validateEmail(String email) {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

	void sendEmail(String email, String message) {
		smtpClient = new SmtpClientSpy();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, message));
	}

}
