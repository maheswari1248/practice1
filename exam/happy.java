public class happy{
public static void main(String args[])
{
String s1="happy new year";
		String s2[]=s1.split(" ");
		String s3="";
		int array[]=new int[s2.length];
		int count=0,index=0,max=0;
		for(int i=0;i<s2.length;i++)
		{
			s3=s2[i];
			for(int j=0;j<s3.length();j++) 
			{
				if(s3.charAt(j)=='a'||s3.charAt(j)=='e'||s3.charAt(j)=='i'||s3.charAt(j)=='o'||s3.charAt(j)=='u')
				{ 
					count++;
					
				}
				
				}
			array[i]=count;
			for(int k=0;k<array.length;k++) 
			{
				
				if(array[i]>max) {
					max=array[i];
					index=i;
				}
				
			}
		}
		System.out.println(max +" " +array[index]);

		
	}

}
