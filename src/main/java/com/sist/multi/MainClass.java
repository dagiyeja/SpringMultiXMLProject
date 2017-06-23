package com.sist.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.sist.user.UserMain;

/*
 *   �޷� 
 *   ===
 *    1) �ѳ���  (1.1.1~����) % 7 ����
 *            ===========
 *               ���� 
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









