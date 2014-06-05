package solid.DIP;

public interface EmailService {

	public abstract void validateEmail(String email);

	public abstract void sendEmail(String email);

}