package com.learn.smtp;

import com.learn.smtp.model.EmailModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	EmailModel myEmail = new EmailModel();
	myEmail.setEmail("marifatalhanif@gmail.com");
        System.out.println( "Email: " + myEmail.getEmail());
    }
}
