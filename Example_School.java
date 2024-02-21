class Example_School
{
public static void main(String []es) 
{
//Declare and initialization of variables
String school_Name="Modern College,Shivajinagar,Pune";
String affilation="Maharashtra State Board",name= "Sanket M. Pandhare",date= "11.02.2024",roll_No= "M0027",exam="Final Semister";
char sec='M';
int p=85,m=95,c=75,h=75,e=85;
int pt=100,mt=100,ct=100,ht=100,et=100;

//Printing statment
System.out.println("**********************************************************************************************");
System.out.println("			    "+school_Name);
System.out.println("			        "+affilation);
System.out.println("**********************************************************************************************");
System.out.println("Name: "+name+"				 	Date: "+date);
System.out.println("Roll No.: "+roll_No+"		        Section: "+sec+"		   Exam: "+exam);
System.out.println("");
System.out.println("**********************************************************************************************");
System.out.println("");
System.out.println(" Subjects			Marks 			Out Of");
System.out.println("1.Physics			 "+p+"			 "+pt);
System.out.println("2.Maths				 "+m+"	            	 "+mt);
System.out.println("3.Chemistry			 "+c+"			 "+ct);
System.out.println("4.History			 "+h+"			 "+ht);
System.out.println("5.English			 "+e+"			 "+et);
int marksObtain=p+m+c+h+e;
int totalMarks=pt+mt+ct+ht+et;
System.out.println("**********************************************************************************************");
System.out.println("");
System.out.println("Total:			 	"+marksObtain+"			 "+totalMarks);
System.out.println("");
double percentage=(marksObtain*100)/totalMarks;
String grade=(percentage<=100&&percentage>=90)?("A"):((percentage<90&&percentage>=75)?("B"):((percentage<75&&percentage>=55)?("C"):((percentage<55&&percentage>=35)?("E"):((percentage<35&&percentage>=0)?("F"):("Invalid Marks")))));
System.out.println("**********************************************************************************************");
System.out.println("");
System.out.println("Percentage: "+percentage+ " %			 			Grade: '"+grade+"'");
System.out.println("");
System.out.println("**********************************************************************************************");
System.out.println("");
System.out.println("					       		 Rahul M.");
System.out.println("Remarks: Good			 			Signature");
System.out.println("**********************************************************************************************");
System.out.println("");
}
}