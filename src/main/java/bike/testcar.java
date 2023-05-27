package bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcar
{
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
	car car= (car) context.getBean("car");
	car.Supercar();
}
}
