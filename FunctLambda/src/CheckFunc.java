import java.util.function.Function;

public class CheckFunc {
public static void main(String[] args) {
	Function<Student, String> f= i-> {
				int marks=i.marks;
				String grade="";
				
				if(marks>80) grade="A";
				else if(marks>60) grade="B";
				else grade="c";
				return grade;
				
	};
	
	Student s[]= {
			new Student("swetha",61),
			new Student("Divya",50)
	};
	
	for(Student s1:s)
	{
		System.out.println("Student Name= "+s1.sname);
		System.out.println("Grade = "+f.apply(s1));
	}
	
	
}
}
