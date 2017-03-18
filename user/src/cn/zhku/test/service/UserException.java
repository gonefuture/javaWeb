package cn.zhku.test.service;

/**			
 *   	用户的异常处理
 */
public class UserException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserException(){
		super();
	}
	
	public UserException(String message){
		super(message);
	}

}
