
public class stringDemo {

	public static void main(String[] args) {
		//Methods of String
		
		System.out.println("MEthods of String");
		String  s1=new String("Hello world");
		System.out.println(s1.length());
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparision
		
		String s2="Hello";
		String s3="Heldo";
		System.out.println(s2.compareTo(s3));
		
		//isEmpty
		String s4="";
		System.out.println(s4.isEmpty());
		
		//toLowerCase
		String s5="Hello";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s3.replace('d','l');
		System.out.println(replace);
		
		//equals
		String x="Welcome to java";
		String y="WeLcOmE tO jAvA";
		System.out.println(x.equals(y));
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and appending method
		
		
		
		

	}

}
