class Stringbuffer
{
public static void main(String args[])
{
StringBuffer sb= new StringBuffer("hello");
sb.append(" ");
sb.append("World");
System.out.println(sb);
System.out.println(sb.length());
	System.out.println(sb.delete(5,11));
	System.out.println(sb.reverse());
}
}

 
