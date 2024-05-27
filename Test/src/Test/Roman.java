package Test;
import java.util.Scanner;

public class Roman {
	//TO DO
	//Get a String (roman number) in standard input and convert to the equivalent in decimal
	//C -> 100 XC XCIX
	//L -> 50 XL XLIX  
	//X -> 10 IX XX XXX
	//V -> 5
	//I -> 1 IV II III
	public static int romanToDecimal(String cadena) {
		char[] charArray = cadena.toCharArray();
		int decimal = 0;
		for(int i = 0; i < cadena.length(); i++) {
			switch (charArray[i]) {
				case('C'):
					decimal += 100;
					break;
				case ('L'):
					decimal += 50;
					break;
				case ('X'):
					if(i < cadena.length() - 1) {
						switch(charArray[i + 1]) {
						case ('C'):
							decimal += 90;
							i++;
							break;
						case ('L'):
							decimal += 40;
							i++;
							break;
						default :
							decimal += 10;
							break;
						}
					} else {
						decimal += 10;
					}
				case ('V'):
					decimal += 5;
				break;
				case ('I'):{
					if(i < cadena.length() - 1) {
						switch (charArray[i+1]) {
						case ('X'):
							decimal += 9;
							i++;
							break;
						case ('V'):
							decimal +=4;
							i++;
							break;
						default:
							decimal += 1;
							break;
						}
					} else {
						decimal +=1;
					}
				}
			}
				
			
		}
		return decimal;
			
	}
	
	public static void main(String args[]) {
		String string = "XLIV";
		
		
		int decimal = romanToDecimal(string);
		System.out.println (decimal);
	}
	
}
