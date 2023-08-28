public class frequency
{
public static void main(String args[])
{
  int a[]={-1,1,1,2,0,0,2,7,9,45,1,1};
  boolean b[]=new boolean[a.length];
int count=1;
  for(int i=0;i<a.length;i++)
  {
      count=1;
      if(b[i]==true)
      continue;
   for(int j=i+1;j<a.length;j++)
  {
     if(a[i]==a[j]){
      b[j]=true;

      count++;
     }
  }
System.out.println(a[i]+"-> "+count);
}
}
}