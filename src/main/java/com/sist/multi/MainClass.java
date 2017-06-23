package com.sist.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.sist.user.UserMain;

/*
 *   달력 
 *   ===
 *    1) 총날수  (1.1.1~현재) % 7 요일
 *            ===========
 *               윤년 
 */
public class MainClass {
    private UserMain um;
    
	public void setUm(UserMain um) {
		this.um = um;
	}

	public static void main(String[] args) {
        String[] xml={"application-context.xml",
        		      "application-security.xml",
        		      "application-datasource.xml"};
        ApplicationContext app=
        	new ClassPathXmlApplicationContext(xml);
        MainClass mc=(MainClass)app.getBean("mc");
        mc.um.display();
	}

}









