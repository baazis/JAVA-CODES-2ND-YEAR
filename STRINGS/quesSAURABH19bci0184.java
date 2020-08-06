import java.util.*;

public class quesSAURABH19bci0184 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int len;
		String r = "";
		
		s = sc.nextLine();
		len = s.length();
		for(int i=len-1; i>=0; i--){
			r = r + s.charAt(i);
		}
		if(s.equals(r)){
			System.out.println("The string is a palindrome.");
		}
		else {
			System.out.println("The string is not a palindrome.");
		}
	}
}
