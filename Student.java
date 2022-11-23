class Student
{
 static String collegename="AVCOE";
 int rollno;
 String name;
 float percentage;
 
 Student(int rollno,String name,float percentage)
 {
	 this.rollno=rollno;
	 this.name=name;
	 this.percentage=percentage;
	 
	 
 }

}

class Demo1
{
	public static void main(String args[])
	{
		Student[] sarr={new Student(11,"onkar",75.60f),
			            new Student(12,"ganesh",75.80f),
						new Student(13,"pradip",60.90f),
						new Student(14,"affan",55.70f),
			
			
		                };
						
		 System.out.println(Student.collegename);

        for(int i=0;i<sarr.length;i++)
		{
		  /*System.out.println(sarr[i].rollno);
          System.out.println(sarr[i].name);
          System.out.println(sarr[i].percentage);*/
			
			System.out.println(sarr[i].name+" "+sarr[i].rollno+" "+sarr[i].percentage);
		}	

          Student temp;
         for(int i=0;i<((sarr.length) -1);i++)
		 {
			 for(int j=i+1;j<sarr.length;j++)
			 {
				 if(sarr[i].percentage < sarr[j].percentage)
				 {
					temp=sarr[i];
					sarr[i]=sarr[j];
					sarr[j]=temp;
					 
				 }
				 
			 }
			 
		 }	
         System.out.println("sorted data:");		 
		 for(int i=0;i<sarr.length;i++)
		{
		 /* System.out.println(sarr[i].rollno);
          System.out.println(sarr[i].name);
          System.out.println(sarr[i].percentage);	*/	  
			
			System.out.println(sarr[i].name+" "+sarr[i].rollno+" "+sarr[i].percentage);
		}
	}
	
}