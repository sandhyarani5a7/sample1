package enummm;

public enum Sub 
{
	ram("25","java") ,  sita("24pages","python_edition","125rs");
	String age;
	String course;
    String name;
	private Sub(String age,String course)
	{
		String name;
		this.age=age;
		this.course=course;
		//this.name=name;
		
	}
	public String get_age_return()
	{
		return age;
	}
	public String get_course_return()
	{
		return course;
	}
	public String get_name_return()
	{
		return name;
	}

	

}//class close
