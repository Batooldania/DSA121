public class Task1{
	// making method for passing arguements
   public int linearSearch(String [] arr , String value ){
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
String [] arr={"Dania","Eman","Maria","Jabeen"};

Task1 t=new Task1();
System.out.print(t.linearSearch(arr, "Dania"));
	
	
}




}
	