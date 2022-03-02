import java.io.*;
import java.util.*;

public class NumberProblem1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//enter number
		Integer num = sc.nextInt();

// if number is 20 then new number is 45 as 4*5=20 and it is least combination number
//if number is less than 10 then new num is number+10. ex: 2 new num is 12
		Integer res=helper(num);
		System.out.println(res);

	}

	public static Integer helper(Integer num)
	{
		Stack<Integer> s = new Stack<>();
		if(num<10)
		{
			return (num+10);
		}

		for(int i=9;i>1;i--)
		{
			while(num%i==0)
			{
				s.push(i);
				num=num/i;
			}
		}

		if(num!=1)
			return -1;
		Integer newNum=0;
		while(!s.empty())
		{
			newNum=newNum*10+s.pop();
		}
		return newNum;
	}
}
