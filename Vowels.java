package numbers1;

public class Vowels {
	public static void main(String[] args) {
		String a="jayasri";
		String vow="aeiou";
		int count =0;
		int cons =0;
		for(int i=0;i<a.length();i++){
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				System.out.println(ch);
			
			else 
			{
				cons++;
				System.out.println(i);
			}
	}
		System.out.println("vowels count "+count++);
		System.out.println("consonant count "+cons++);

}}
