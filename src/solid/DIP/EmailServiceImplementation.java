package solid.DIP;

import solid.common.MailMessage;
import solid.common.SmtpClientSpy;
import solid.common.ValidationException;

public class EmailServiceImplementation implements EmailService {
	
	private SmtpClientSpy smtpClient;

	/* (non-Javadoc)
	 * @see solid.DIP.EmailService#validateEmail(java.lang.String)
	 */
	@Override
	public void validateEmail(String email) {
		if (!email.contains("@")) {
			throw new ValidationException("Email is not a valid email");
		}
	}

	/* (non-Javadoc)
	 * @see solid.DIP.EmailService#sendEmail(java.lang.String)
	 */
	@Override
	public void sendEmail(String email) {
		smtpClient = new SmtpClientSpy();
		smtpClient.send(new MailMessage("mysite@nowhere.com", email, "Hello fool !"));
	}

}
