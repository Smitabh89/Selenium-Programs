
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome world all";
		String s1="Smita";
		String []name= {"abc","xyz","pqr"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
			
		}
		//String s2=new String("Bhosale");
		System.out.println(s);
		System.out.println(s1);
		String[]splittedstring=s.split(" ");
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[0].trim());
		
		//Printing character of string
		for(int i=0;i<s.length();i++)
		{
		
			System.out.println(s.charAt(i));
	}
       
		//Printing reverse String
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
}
}