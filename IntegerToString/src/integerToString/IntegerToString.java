package integerToString;

import java.util.Scanner;
import java.io.*;
import com.sun.speech.freetts.*;
public class IntegerToString {

	private static final String VOICENAME = "kevin16";
	
	public static void main(String[] args) {
		
		int num, rem,length=0;
	    char[] str = new char [10] ;
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the integer value : ");
	    num = scanner.nextInt();
	    
	    //String string = Integer.toString(num);
	    
	    int a = num;

	    while(a!=0){
	        length++;
	        a /=10;
	    }
	    int i;
	    for(i = 0; i<length; i++){
	        rem = num%10;
	        num = num/10;
	        str[length-(i+1)] = (char) (rem +'0');
	    }
	    str[length] = '\0';
	    
	    System.out.println(str);
	    
	    
	    Voice voice;
	    VoiceManager voicemanager = VoiceManager.getInstance();
	    voice = voicemanager.getVoice(VOICENAME);
	    voice.allocate();
	    String string = String.valueOf(str);
	    try{
	    	voice.speak(string);
	    } catch (Exception e){
	    	
	    }


	}

}
