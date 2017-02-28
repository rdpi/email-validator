package com.validator.validator;

public class Validator{
	public Validator(){}
	
	public static int validate(String email){
		int rules = 0;
		if (email.contains(".")){
			++rules;
			
		}
		if (email.matches("^[^@]*@[^@]*$")){
			++rules;
		}
		return rules;
	}
}