package free.com.utils;

public class CommonConstants {

	public static final String USER = "userId";

	public static final String STR_NULL = "null";

	public static final String SUCCESS = "1";

	public static final String FAILURE = "0";

	public static final String LOGIN_STATUS = "loginStatus";



	private CommonConstants() {

	}

	public static final class loginStatus {
		private loginStatus() {
			// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		}
		public static final String INIT = "init";
		public static final String LOGIN = "login";
		public static final String LOGOUT = "logout";
	}
}
