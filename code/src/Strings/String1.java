package Strings;

public class String1 {

	public static void main(java.lang.String[] args) {
      String s1=new String("hello");
      String s2=new String("hello");
      s1=s1.concat(" ajay babu");
      System.out.println(s1);
      System.out.println("length of string is :"+s1.length());
      System.out.println(s1.compareToIgnoreCase(s2));
      
      System.out.println(s1.trim()+"i am fine");
      int value=20;
      System.out.println(value);
      String s4=s1.replace('h','t');
      System.out.println(s4);
      System.out.println(s1.contains("hello"));
      char[] c=s1.toCharArray();
      for(int i=0;i<c.length;i++){
    	  System.out.println(c[i]);
      }
      long Starttime=System.currentTimeMillis();
      StringBuffer sb=new StringBuffer("Mass");
      sb.append(" Babu");
      System.out.println("time taken for string"+ sb +" buffer append is:"+ (System.currentTimeMillis()-Starttime));
	}

}
