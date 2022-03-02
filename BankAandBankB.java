import java.io.*;
import java.util.*;

public class BankAandBankB 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int p=sc.nextInt();
int y=sc.nextInt();
int slabA=sc.nextInt();
double sumA=0,sumB=0;
for(int i=0;i<slabA;i++)
{
    int year=sc.nextInt();
    double mi=sc.nextDouble();

    double emi=(p*mi)/(1-1/(1+Math.pow(mi, year*12)));
    sumA=sumA+emi;
}
int slabB=sc.nextInt();
for(int i=0;i<slabB;i++)
{
    int year=sc.nextInt();
    double mi=sc.nextDouble();

    double emi=(p*mi)/(1-1/(1+Math.pow(mi, year*12)));
    sumB=sumB+emi;
}

if(sumA>sumB)
System.out.println("Bank B");
else
System.out.println("Bank A");
}
}

/*
10000                                                                                                                                         
20                                                                                                                                            
3                                                                                                                                             
5 9.5                                                                                                                                         
10 9.6                                                                                                                                        
5 8.5                                                                                                                                         
3                                                                                                                                             
10 6.9                                                                                                                                        
5 8.5                                                                                                                                         
5 7.9 
*/