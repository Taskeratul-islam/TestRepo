package com.adn.AdnSmsProject.Utils;

public class XpathUtils {
	
	public static class LoginModule{
		
		public static final String email ="/html/body/div[1]/form/div/div/input[1]";
		public static final String password ="/html/body/div[1]/form/div/div/input[2]";
		public static final String signinBtn ="/html/body/div[1]/form/div/button";
		
	}
public static class SinglesmsModule{
		
	public static final String singlesmsBtn ="/html/body/section/header/div[2]/ul[2]/li[1]/button";
	public static final String selectMask ="selectMask";	
	public static final String mobileno ="/html/body/div[1]/div/div/div[2]/form/div[3]/div/input";
	public static final String messageType ="/html/body/div[1]/div/div/div[2]/form/div[4]/div/select";
	public static final String message="/html/body/div[1]/div/div/div[2]/form/div[5]/div/textarea";
	public static final String sendBtn ="/html/body/div[1]/div/div/div[2]/button[1]";
	}

public static class GcampModule{
	
	public static final String gcampBtn ="/html/body/section/aside/div/div[1]/ul/li[3]/a/span";
	public static final String createcamp="/html/body/section/aside/div/div[1]/ul/li[3]/ul/li/a";	
	public static final String camptitile="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[1]/div/input";	
	public static final String ispromononopath ="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[2]/div/label[2]/input";
	public static final String masktype ="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[3]/div/select";
	public static final String receipientlisttextbox ="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[4]/div/label[1]/input";
	public static final String contactlist ="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[5]/div/textarea";
	public static final String msgbody ="/html/body/section/section/section/div[3]/div/section/div/div[2]/form/div[9]/div/textarea";
	
	

}
}