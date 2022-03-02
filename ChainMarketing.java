import java.io.*;
import java.util.*;

public class ChainMarketing 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
//no. of nodes in tree
Integer n = sc.nextInt();
//profit of last persion
Integer pl=sc.nextInt();
//percentage of profit passed to its superior
Integer p=sc.nextInt();
Integer i=0;
while(i<n-1)
{
    pl= Math.round((pl*p)/100);
	i++;
}
//profit earn by Top node
System.out.println(pl);
}
}
