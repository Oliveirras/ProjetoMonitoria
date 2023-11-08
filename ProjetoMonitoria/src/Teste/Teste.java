package Teste;



import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Teste {
	public static void main(String[] args) {
		
		SimpleEmail email = new SimpleEmail(); 
		
		
		

	      try {  
	      email.setDebug(true);  
	      email.setHostName("smtp.gmail.com"); 
	      email.setSslSmtpPort( "587" );
	      email.setAuthentication("ifpbtestemonteiro@gmail.com","gdon yhnr wbdg yfdu");  
	      email.setSSL(true);  
	      email.addTo("ifpbtestemonteiro@gmail.com"); //pode ser qualquer email  
	      email.setFrom("ifpbtestemonteiro@gmail.com"); //será passado o email que você fará a autenticação
	      email.setSubject("Enviando email");  
	      email.setMsg("Teste de envio de email");  
	      email.send();  

	      } catch (EmailException e) {  

	      System.out.println("Falha ao enviar Email!");  

	      }   
		
	}
}
