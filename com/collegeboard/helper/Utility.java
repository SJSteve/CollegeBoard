package com.collegeboard.helper;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	private String input;
	
	public String getInput(){
		
		System.out.println("Enter the text");
		
		Scanner scanInput  = new Scanner(System.in);
		if(scanInput.hasNextLine()){
			input=scanInput.nextLine();
		}
		return input;
	}
	public boolean validInput(String text){
		
		if(text.equalsIgnoreCase("Higher") || text.equalsIgnoreCase("Lower") || text.equalsIgnoreCase("End") || text.equalsIgnoreCase("yes") ){
			return true;
		}
		
		return false;
	}
	
	public int guessNumber(){
		Random random=new Random();
		int n=random.nextInt();
		if(n==0){
			return n+1;
		}
		
		return n;
	}
	public int guessNumber(int num){
		Random random=new Random();
		int n=random.nextInt(num);
		if(n==0){
			return n+1;
		}
		
		return n;
	}
}
