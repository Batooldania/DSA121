public class Employee{
     float salary;
	 float hours;
 public void getinfo(float salary,int hours){
 
}
public void addSalary(float salary){
   if(salary>500) this.salary=this.salary+10;
}
public  void addWorkHourBonus(int hours){
if(hours>5) this.salary=this.salary+5;

}

}
class Main{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.addSalary(600);
		e1.addWorkHourBonus(7);
		
	}
	
	
}