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
    	/*Person person1=(Person)context.getBean("person");
    	Person person2=(Person)context.getBean("person");
    	person2.display();
    	System.out.println(person2);
    	person2.log();
    	person1.setTaxId(888);
    	person1.display();
    	System.out.println(person1);
    	person1.log();*/
    	
    	Customer customer=(Customer)context.getBean("customer");
    	System.out.println(customer);
    	
    	Jungle jungle =(Jungle)context.getBean("jungle");
    	System.out.println(jungle);
    	
    	/*Address address2=(Address)context.getBean("address2");
    	System.out.println(address2);
    	*/
    	
    	((FileSystemXmlApplicationContext)context).close();
    	
    	ApplicationContext content=new ClassPathXmlApplicationContext("/com/jithu/spring/Java_spring/beans/beans2.xml");
    	Summary summary=(Summary)content.getBean("summary");
    	summary.description();
    	((ClassPathXmlApplicationContext)content).close();
    }
}
