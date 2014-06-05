package solid.common;

public class DatabaseSpy implements Database {
	
	private static boolean userIsSaved;

	public static void userIsSaved(boolean isSaved) {
		userIsSaved = isSaved;
	}

	public static boolean userIsSaved() {
		return userIsSaved;
	}

	/* (non-Javadoc)
	 * @see solid.common.Database#save(solid.common.User)
	 */
	@Override
	public void save(User user) {
		userIsSaved = true;
	}

}
