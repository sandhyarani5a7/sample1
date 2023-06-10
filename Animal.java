package super1;

public class Animal
{
	int rollno;
	String name,course;
	float fee;
	
 
		Animal(int rollno,String name, String course )
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		
		
	}
	
	Animal(int rollno,String name, String course,float fee)
	{
		this(rollno,name,course);
		this.fee=fee;
		
		
		
	}
	
	void display()
	{
		System.out.println(rollno +"   "+ name+"   " + course +"   "+ fee);
	}


}//main close
