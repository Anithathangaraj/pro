import java.util.*;
public class Co1
{
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		String s=k.next();
		StringBuffer sb=new StringBuffer(s);
		String r=(sb.reverse()).toString();
		System.out.print(r);
	}
}
