package com.collegeboard.client;



import com.collegeboard.helper.Utility;

public class PlayGame {

	/**
	 * @param args
	 */
	
	static Utility utility = new Utility();
	static boolean flag = true;
	static boolean beginFlag = true;
	static final String readyString="READY";
	static final String endString="END";
	static int max;
	static int min=0;
	
	public static void main(String[] args) {
		
		String input=null;
		String beginInput=null;
		
		System.out.println("Welcome to College Board Game.");
		System.out.print("Choose a randome number and I will guess yours....");
		System.out.println("I will figure it out by asking few questions and you can say either \"Higher\" or \"Lower\",");
		System.out.println("enter \"End\" if you want to Quit at any time");
		
		System.out.println("Let's play...Think a number and once you are done, keyin \"Ready\" or \"end\" to Quit ");
		
		do{
			beginInput = utility.getInput();
			if(readyString.equalsIgnoreCase(beginInput)){
				break;
				
				//beginFlag=true;
			}else if(endString.equalsIgnoreCase(beginInput)){
				System.out.println("Good Bye!!!");
				System.exit(0);
			}else{
				System.out.println("Enter the String \"Ready\" or \"end\" to Quit");
				beginFlag=true;
			}
			
		}while(beginFlag);
		
		
		boolean maxFlag=false;
		boolean minFlag=false;
		
		do{
			
			int n=utility.guessNumber();
			if(maxFlag){
				n=utility.guessNumber(max-1);
			}
			if(maxFlag){
				n=utility.guessNumber(min+1);
			}
			System.out.println("Is the number " + n);
			//System.out.println("Please enter any one of the valid input");
			System.out.println("Is the number \"Higher\" or \"Lower\" or  \"Yes\" or \"End\"");
			input = utility.getInput();
			if (!utility.validInput(input)){
				
				System.out.println("Please enter any one of the valid input");
				System.out.println("Is the number \"Higher\" or \"Lower\"? or Quit to  \"Yes\" or \"End\"");
				flag=true;
				
			}
			else{
				if ("YES".equalsIgnoreCase(input) || "END".equalsIgnoreCase(input)){
					System.exit(0);
				}
				if("HIGHER".equalsIgnoreCase(input)){					
					max=n;
					maxFlag=true;
				}
				if("LOWER".equalsIgnoreCase(input)){					
					min=n;
					minFlag=true;
				}
				
				if((max-min)==2){
					System.out.println("Your number is " + (max-min));
				} 
			}			
		}while(flag);
		
		//System.out.println("Input is " + input);
		
		
	}  
	
	

}
