package cn.zhku.user.dao;



import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.zhku.user.domain.User;

public class UserDaoImpl {
	private String path = "E:/users.xml";//���������ļ�
	
	public User findByUsername(String username){
		SAXReader reader = new SAXReader(); 
		try{
			Document doc = reader.read(path);
			Element ele = (Element) doc.selectSingleNode("//user[@username='"+username+"']");
			 if(ele == null) return null;
			 
			 User user = new User();
			 String attrUsername = ele.attributeValue("username");
			 String attrPassword =ele.attributeValue("password");
			 user.setUsername(attrUsername);
			 user.setPassword(attrPassword);
			 return user;
		}catch(DocumentException e){
			throw new RuntimeException(e);
		}
	}
	/**
	 * ����û�
	 * */
	public void add(User user){
		SAXReader reader = new SAXReader(); 
		try{
			Document doc = reader.read(path);
			
			Element root = doc.getRootElement();
			
			Element userEle=root.addElement("user");
			
			userEle.addAttribute("username", user.getUsername());
			userEle.addAttribute("password", user.getPassword());
			
			OutputFormat format = new OutputFormat("\t",true);
			format.setTrimText(true);
			XMLWriter writer;
			try{
				writer = new XMLWriter(new OutputStreamWriter(
						new FileOutputStream(path),"utf-8"),format);
				writer.write(doc);
				writer.close();
			}catch (Exception e){
				throw new RuntimeException(e);				
			}
		}catch (DocumentException e){
			throw new RuntimeException(e);				
		}
	}
}
