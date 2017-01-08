import java.util.*;
class Arm
{
public static void main(String args[]){
int l,a,b=0,t,d,e,f,g,h;
String z;
Scanner s=new Scanner(System.in);
System.out.println("enter the number..");
a=s.nextInt();
t=a;
z = ""+a;
l =z.length();
while(a>0)
{
d=a%10;
b+=Math.pow(d,l);
a=a/10;
}
System.out.println(+b);
if(t==b)
System.out.println("Armstrong number");
else
System.out.println("Not a Armstrong number");
}
}
