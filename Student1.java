class Student 
{
  String name;
  double per;

       Student(String name,double per)
             {

                this.name=name;
                this.per=per;

             }

       public static void main(String args[])
             {

               Student S[]={new Student("onkar",70.50),
                            new Student("ganesh",60.55),
                            new Student("paradip",90.99), 
                            new Student("durge",70.60), 
                            new Student("affan",80.75)};

               for(int i=0;i<5;i++)
                    {
                        for(int j=i+1;j<5;j++)
                          {
                            if(S[i].per<S[j].per)
                             {
                        
                                Student temp=S[i];
                                S[i]=S[j];
                                S[j]=temp;

                             }
                          }
                    }
              for(int j=0;j<5;j++)
                  {

                  
                     System.out.println(S[j].name +" "+S[j].per);


                  }  


             }




}