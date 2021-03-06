package util;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviaEmail {
	
	public void envia() {
		// Recipient's email ID needs to be mentioned.
	      String email1 = "leticia.gonzalez@norber.com.br";
	      String email2 = "jose.jefferson@norber.com.br";
	      String email3 = "edson.takeshi@norber.com.br";
	      String email4 = "michel@norber.com.br";
	      String email5 = "natalia.oliveira@norber.com.br";
	      String email6 = "william.gama@norber.com.br";
	      
	      // Sender's email ID needs to be mentioned
	      String from = "leticia.gonzalez@norber.com.br";

	      // Assuming you are sending email from localhost
	      String host = "smtp.office365.com";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      
	      properties.put("mail.smtp.host", "smtp.office365.com");
	      properties.put("mail.smtp.socketFactory.port", 587);
	      properties.put("mail.smtp.ssl.checkserveridentity", "false");
	      properties.put("mail.smtp.ssl.trust", "*");     
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	      properties.put("mail.smtp.auth", true);
	      properties.put("mail.smtp.port", 587);
	      
		     Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
		    	 
		            protected PasswordAuthentication getPasswordAuthentication() {
		                   return new PasswordAuthentication("leticia.gonzalez@norber.com.br", "sucrilhos*040507");
		            }
		     });
		 
	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(email1));
	         //message.addRecipient(Message.RecipientType.TO,new InternetAddress(email2));
	         //message.addRecipient(Message.RecipientType.TO,new InternetAddress(email3));
	         //message.addRecipient(Message.RecipientType.TO,new InternetAddress(email4));
	         //message.addRecipient(Message.RecipientType.TO,new InternetAddress(email5));
	         //message.addRecipient(Message.RecipientType.TO,new InternetAddress(email6));

	         // Set Subject: header field
	         message.setSubject("Erro no Login");

	         // Create the message part 
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Fill the message
	         messageBodyPart.setText("Erro na INDUSTRIA COMERCIO MDM");
	         
	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = "C:\\Users\\leticia.gonzalez\\workspace-eclipse\\login\\src\\main\\java\\reports\\ErroLogin.png";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);

	         // Send the complete message parts
	         message.setContent(multipart );

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	
}
