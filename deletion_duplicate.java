
 class deletion_dupliate 
{

	public static void main(String[] args) 
{
		StringBuffer sb=new StringBuffer("hello all good morning");
		
		int x,y;
       for(x=0;x<sb.length();x++)
 {
    	   for(y=x+1;y<sb.length();y++) 
{
    		   if(sb.charAt(x)==(sb.charAt(y))) 
{
    			   sb.replace(y, y+1,"_");
    			   
    		   }
    	   }
    	   
       }
       String temp=" ";
       for(int i=0;i<sb.length();i++) 
{
    	   if(sb.charAt(i)!='_') 
{
    		   temp=temp+sb.charAt(i);
    		   
    	   }
       }
       System.out.println(temp);
       
	
}

}
