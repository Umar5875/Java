import java.util.Scanner;
public class Stringmain{
public static void main(String[] args){
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter a string:");
	String s1 = new String(sc.nextLine());
	
	System.out.println("Enter the length of string:"+s1.length());
	
	System.out.println("Enter the new String:");
	String s2 = sc.nextLine();
	String s3 = s1.concat(s2);
	System.out.println("concataned string:"+s3);
	
	System.out.println("Enter index:");
	int index=sc.nextInt();
	System.out.println(index + ":" + s1.charAt(index));
	
	sc.nextLine();
	
	System.out.println("Enter the new String:");
	String s4 = sc.nextLine();
	System.out.println("equals:"+s1.equals(s4));
	System.out.println("compareTo:"+s1.compareTo(s4));
	
	System.out.println("Enter the substring:");
	String sub = sc.nextLine();
	System.out.println("index of substring:" + s1.indexOf(sub));

	System.out.println("Enter word to replace:");
	String oldword = sc.nextLine();
	System.out.println("Enter new word:");
	String newword = sc.nextLine();
	System.out.println("after replacing:" + s1.replace(oldword, newword));
	System.out.println("after uppercase:" + s1.toUpperCase());
	
	System.out.println("Enter a integer:");
	int num = sc.nextInt();
	String numStr = String.valueOf(num);
	System.out.println("converted integer to string:"+numStr);
	
	sc.nextLine();
	
	System.out.println("enter a sentance:");
	String data = sc.nextLine();
	String[] arr=data.split(" ");
	System.out.println("splitted strings:");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	System.out.println("enter string:");
	StringBuffer sb = new StringBuffer(sc.nextLine());
	System.out.println("enter new string:");
	sb.append(sc.nextLine());
	System.out.println("string buffer:"+sb);
	
	sc.close();
}
}
