public class palprime
{
public static void main(String args[])
{
  int a=1,count=1,count1=1,i,rev=0,rem=0,b=a;
for( i=1;count<=10;i++){
   rev=0;count=1;b=i;
  while(i>0)
{
   rem=i%10;
   rev=rev*10+rem;
   i=i/10;
}

if(rev==b)
{
 count++;
 System.out.println(rev);
}
else{
System.out.println("hello");
}
}
}
}