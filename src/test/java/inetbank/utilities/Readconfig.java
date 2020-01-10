package inetbank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;
public Readconfig() {
	
	File src=new File("./configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
		}
	catch(Exception e) {
		System.out.println("exception is"+" "+e.getMessage());
		}
}

public String getappurl() {
	String url=pro.getProperty("baseurl");
	return url;
}
public String getusername() {
	String uname=pro.getProperty("username");
	return uname;
}
public String getpassword() {
	String pwd=pro.getProperty("password");
	return pwd;
	}
public String getchrome() {
	String chrome=pro.getProperty("chromepath");
	return chrome;
	}
public String getfire() {
	String fire=pro.getProperty("firepath");
	return fire;
}

}
