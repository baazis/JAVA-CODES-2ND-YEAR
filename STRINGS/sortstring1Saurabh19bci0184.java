import java.util.Scanner;
public class sortstring1Saurabh19bci0184 {
	public static void main(String args[]){
		Scanner tip = new Scanner(System.in);
		String str1;
		System.out.println("Enter the string to be sorted: ");
		str1=tip.nextLine();
		str1=str1.replaceAll("\\s","");
		int length= str1.length();
		char s[]=str1.toCharArray();
		for(int i=0;i<length;i++)
		for(int j=i+1;j<length;j++){
			if (s[i]>s[j])
			{
				char mp=s[i];
				s[i]=s[j];
				s[j]=mp;
			}
		}
		String str2= new String(s);
		System.out.println("The answer is:" );
		System.out.println(str2);
	}
}
