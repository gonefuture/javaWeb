package cn.zhku.test.dao;

public class DaoException extends RuntimeException {

	/**		自定义异常处理类
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException() {
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

}
