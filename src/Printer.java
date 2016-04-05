import java.util.Scanner;
import java.lang.Math;

public class Printer {
	 static RandomAlphaNum ran;
	static Num num;
	static PrintAllNum allNum;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me what you want me to print :\n 1: Random 4 digit number\n 2: Random __ digit number\n 3: Random 13 digit AlphaNumChar\n 4: Random ___ digit AlphaNumChar\n 5: print all 4 digit combos");
		int x = scan.nextInt();
		
		if(x == 1){
			num = new Num();
			System.out.println(num.toString());
		}
		else if(x == 2){
			System.out.println("How long?");
			int length = scan.nextInt();
			num = new Num(length);
			System.out.println(num.toString());
		}
		else if(x == 3){
			ran = new RandomAlphaNum();
			System.out.println(ran.toString());
		}
		else if(x == 4){
			System.out.println("How long?");
			int length = scan.nextInt();
			ran = new RandomAlphaNum(length);
			System.out.println(ran.toString());
		}
		else if(x == 5){
		
			allNum = new PrintAllNum();
			System.out.print(allNum.toString());
		}
		else{
			System.out.println("Solution not found!");
		}
		
		
	}

}
