package enummm;

public class M
{

	public static void main(String[] args) 
	{
		
		//1.object create
		//array[0]
		//call constructor()-->constant data(description)send to constructor

		for(Sub x:Sub.values())
		{
			System.out.printf("%s....%s ...%s...",x,x.get_age_return(),x.get_course_return());
		 System.out.println("\n");
		
		
		}

		
		System.out.println("\n");
		

	}//main close

}//class close
