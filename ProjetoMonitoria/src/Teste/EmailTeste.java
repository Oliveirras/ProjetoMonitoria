package Teste;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailTeste {
	public static void main(String[] args) {
		SimpleEmail email = new SimpleEmail();
		
		email.setSSLOnConnect(true);
		email.setHostName( "smtp.gmail.com" );
		email.setSslSmtpPort( "587" );
		email.setAuthenticator( new DefaultAuthenticator( "ifpbtestemonteiro@gmail.com" ,  "123456teste" ) );
		try {
		    email.setFrom("ifpbtestemonteiro@gmail.com");
		     
		    email.setDebug(true); 
		     
		    email.setSubject( "Assunto do E-mail" );
		    email.setMsg( "Texto sem formatação" );
		    email.addTo( "ifpbtestemonteiro@gmail.com" );//por favor trocar antes de testar!!!!
		     
		    email.send();
		     
		} catch (EmailException e) {
		    e.printStackTrace();
		} 

		
	}
	
	
}
