package com.spring.lyf;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 
    public static void main(String[] args)
        throws Exception
    {
 
        
 
        ConfigurableApplicationContext cap
            = new ClassPathXmlApplicationContext(
                "Life.xml");
 
        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();
    }
}