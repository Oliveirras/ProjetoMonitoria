package Teste;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailHTML {
	public static void main(String[] args) {
		
		HtmlEmail email = new HtmlEmail();
		email.setSSLOnConnect(true);
		email.setHostName( "smtp.gmail.com" );
		email.setSslSmtpPort( "587" );
		email.setAuthenticator( new DefaultAuthenticator( "ifpbtestemonteiro@gmail.com" ,  "123456teste" ) );
		try {
		    email.setFrom( "ifpbtestemonteiro@gmail.com" , "Teste");
		    email.setDebug(true); 
		    email.setSubject( "Assunto do E-mail" );
		     
		    StringBuilder builder = new StringBuilder();
		    builder.append("<h1>Um titulo</h1>");
		    builder.append("<p>Lorem ipsum dolor sit amet, <b>consectetur adipiscing elit</b>. Duis nec aliquam tortor. Sed dignissim dolor ac est consequat egestas. Praesent adipiscing dolor in consectetur fringilla.</p>");
		    builder.append("<a href=\"http://wwww.botecodigital.info\">Boteco Digital</a> <br> ");
		    builder.append("<img src=\"http://www.botecodigital.info/wp-content/themes/boteco/img/logo.png\">");
		             
		    email.setHtmlMsg( builder.toString() );
		    email.addTo( "ifpbtestemonteiro@gmail.com" );
		    email.send();
		} catch (EmailException e) {
		    e.printStackTrace();
		} 
		
	}

}
