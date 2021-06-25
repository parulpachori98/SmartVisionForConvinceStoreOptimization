package com.svfcso.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;


public class Basemethods {
	/*private LoginService loginService;
	private RegisterService registerService;*/
	
	public static String getUser(){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		return userName;
	}
	
	/*public String getName(String name ){
		String fn="",ln="";
		try{
			LoginVO loginVO = new LoginVO();
			loginVO.setUsername(name);
			List LoginList = new ArrayList();
			LoginList = loginService.searchByUsername(loginVO);
			LoginVO lVO = (LoginVO) LoginList.get(0);
		
			RegisterVO registerVO = new RegisterVO();
		
			registerVO.setLoginVO(lVO);
			List RegList = new ArrayList();
			RegList = registerService.searchByLoginId(registerVO);
		
			RegisterVO rVO = (RegisterVO)RegList.get(0);
		
			fn = rVO.getFirstName();
			ln = rVO.getLastName();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return fn+" "+ln;
	}*/

	public static String generateOTP() {
		int n = 8;
		// chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(AlphaNumericString.length()*Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
        return sb.toString(); 
	}
	
	public static void sendMail(String receiver,String securityKey,String userName){
		final String from = "noreply.svfcso@gmail.com";
		final String password = "svfcso@1234";
		
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		StackTraceElement element = stackTrace[2];
		String methodName = element.getMethodName();

		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mails.smtp.ssl.trust","smtp.gmail.com");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receiver));
			
			if(methodName=="resetPassword"){
				message.setSubject("Reset Password ");
			
				message.setText("Hello, " + userName + " your password is reset to " + securityKey);
			}
			else{
				message.setSubject("Approve ");
				
				message.setText("Hello,  " + userName + " your OTP is " + securityKey);
			}
			Transport.send(message);

			System.out.println("Sent message successfully....");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
