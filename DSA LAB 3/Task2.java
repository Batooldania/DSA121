public class Task2{
	// making method for passing arguements
   public int linearSearch(char [] arr , char value ){
	   for(int i=0; i<arr.length ; i++)
	   {
		   //condition if elements in the array or not
		   if(arr[i]==value)
		   {
			   return i;
		   }
		   
	   }
	   return -1;
	   
   }
public static void main(String args[])
{
	//making array of type string
char [] arr={'D','A','N','I','A'};

Task2 t=new Task2();
System.out.print(t.linearSearch(arr, 'A'));
	
	
}




}
	