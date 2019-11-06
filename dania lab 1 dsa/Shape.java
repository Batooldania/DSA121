
public class Square extends Shape{
public void drawShape(){}
public void eraseShape(){}
}
public class Triangle extends Square{
public void drawShape(){}
public void eraseShape(){}
}

public class Shape {
	public static void main(String args[]){
	Square s1=new Square();
  Triangle t1=new Triangle();
  s1.drawShape();
  t1.drawShape();
		
	}
	
	
}