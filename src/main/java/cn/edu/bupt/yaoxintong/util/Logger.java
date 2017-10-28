package cn.edu.bupt.yaoxintong.util;


public class Logger extends org.apache.log4j.Logger {

	protected Logger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub
		if (Constant.DEBUG)
			super.info(message);
	}
	
	public static Logger getLogger(Class clazz) {
		return (Logger) org.apache.log4j.Logger.getLogger(clazz);
	}

}
