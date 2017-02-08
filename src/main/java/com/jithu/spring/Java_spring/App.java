package com.jithu.spring.Java_spring;
/**
 * @author Jithu Paul
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.jithu.spring.Java_spring.Person;
public class App 
{
    public static void main( String[] args )  {
    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	Person person=(Person)context.getBean("person");    	
    	person.speak();
    	person.walk();
    	((FileSystemXmlApplicationContext)context).close();
    	
    	ApplicationContext content=new ClassPathXmlApplicationContext("/com/jithu/spring/Java_spring/beans/beans2.xml");
    	Family family=(Family)content.getBean("family");
    	family.description();
    	((ClassPathXmlApplicationContext)content).close();
    }
}
