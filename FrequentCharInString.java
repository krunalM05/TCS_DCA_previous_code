import java.io.*;
import java.util.*;

public class FrequentCharInString 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int l = str.length();
int[] freq = new int[l];
for(int i=0;i<l;i++)
freq[i]=0;

for(int i=0;i<l;i++)
{
	for(int j=0;j<l;j++)
	{
		if(str.charAt(i)==str.charAt(j))
			freq[i] = freq[i]+1;
	}
} 

int max=Integer.MIN_VALUE;
int index=-1;
for(int i=0;i<l;i++)
{
	if(freq[i]>max)
	{
		max=freq[i]; 
		index=i;
	}
}

/*corner case*/
if(max==1)
{
	System.out.println("No most and Second most frequent character");
	return;
}
int max2=Integer.MIN_VALUE;
int index2=-1;
for(int i=0;i<l;i++)
{
	if(freq[i]>max2 && freq[i]!=max)
	{
		max2=freq[i];              /* 55353535 */
		index2=i;
	}
}
System.out.println(str.charAt(index));
System.out.println(str.charAt(index2));
}
}

