// https://www.guru99.com/java-strings.html
public class SampleString{
	public static void main(String[] args){
	//String Concatenation
	String str1 = "Rock";
	String str2 = "Star";
	//Method 1 : Using concat
	String str3 = str1.concat(str2);
	System.out.println(str3);
	//Method 2 : Using "+" operator
	String str4 = str1 + str2;
	System.out.println(str4);
	
	//Length of a String
	System.out.println("Length of String: " + str4.length());
	  
	System.out.println("Character at position 5: " + str4.charAt(5));
	//Index of a given character
	System.out.println("Index of character 'S': " + str4.indexOf('S'));
	
	System.out.println("Compare To 'ROcKStar': " + str4.compareTo("ROcKStar"));
	//Compare to - Ignore case
	System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str4.compareToIgnoreCase("ROCKSTAR"));
	
	System.out.println("Replace 'Rock' with 'Duke': " + str4.replace("Rock", "Duke"));
	}
}