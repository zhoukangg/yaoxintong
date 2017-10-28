package cn.edu.bupt.yaoxintong.util;

public class Logger extends org.apache.log4j.Logger {
	protected Logger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private static class LazyHolder {
		private static final Logger INSTANCE = new Logger("yaoxintong");
	}

	public static final Logger getInstance() {
		return LazyHolder.INSTANCE;
	}
}