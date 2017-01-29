import java.util.*;
class Circle{
public static void main(String args[]){
int n;
Scanner x=new Scanner(System.in);
n=x.nextInt();
for(int i=-n;i<=n;i++){
for(int j=-n;j<=n;j++){
if(i*i+j*j<=n*n)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
	
