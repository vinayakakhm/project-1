package bike;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testgdp {
public static void main(String[] args) {
//	ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
//	gdp gdp=(gdp) context.getBean("gdp");
//	gdp.indiangdp();
	
	ClassPathResource resource=new ClassPathResource("ioc.xml");
	BeanFactory beanFactory=new XmlBeanFactory (resource);
	gdp gdp= (gdp) beanFactory.getBean("gdp");
	gdp.indiangdp();	
}
}
