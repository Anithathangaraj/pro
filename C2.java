import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
int s=k.nextInt();int fact=1,k1=1;
		for(int i=0;i<s;i++){
		    fact=fact*k1;
		    k1++;
		}
		System.out.print(fact);
	}
}
