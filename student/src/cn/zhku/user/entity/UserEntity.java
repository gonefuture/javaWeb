package cn.zhku.user.entity;

public class UserEntity extends Object {
	private int userId;
	private String userName;
	private String userPass;
	private int age;
	private String sex;
        private String email;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
        public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserEntity(int userId, String userName, String userPass, int age,
			String sex,String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.age = age;
		this.sex = sex;
        this.email =email;
	}
	public UserEntity(String userName, String userPass, int age,
			String sex,String email) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.age = age;
		this.sex = sex;
        this.email =email;
	}
	public UserEntity() {
		super();
	}
	
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", age=" + age
				+ ", sex=" + sex + ", email=" + email + "]";
	}
	

}
