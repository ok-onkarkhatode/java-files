class Student
{
  int rollNo;
  String name;
  float per;
 

   Student(int rollNo,String name,float per)
     {
        this.rollNo=rollNo;
        this.name=name;
        this.per=per;       
     }
/*
  public boolean equals(final Object obj) 
    {
        if(this == obj)
            {

              return true;
            }
        else if(obj instanceof Student)
           {  Student s=(Student)obj;
             if( this.name==s.name && this.per==s.per)
                 {
                   return true;

                 }


           }
        else
            {
               return false;  

            }
        return false;
    }*/

}


class Test
{
   public static void main(String args[])
      {

       Student s1=new Student(40,"onkar",75);
      // Student s2=new Student(40,"onkar",75);    

      // System.out.println(s1.equals(s2));
       System.out.println(s1.hashCode());

     }
}