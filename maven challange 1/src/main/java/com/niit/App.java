package com.niit;

import com.niit.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Product product1 = (Product)context.getBean("Product");
        System.out.println(product1);
        System.out.println( "Hello World!" );
    }
}
