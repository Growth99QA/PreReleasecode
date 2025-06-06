package com.growth99.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	
	public static final int IMPLICIT_WAIT = 20;
	public static final int PAGE_LOAD_TIME = 20;
	
	public static String generateRandomEmail() {
		return "user"+generateRandomNumber()+"@gmail.com";
	}
	
	public static String generateRandomNumber() {	
		String randomNumber = new SimpleDateFormat("ddMMmmss").format(new Date());
		return "99"+randomNumber;
	}

}
