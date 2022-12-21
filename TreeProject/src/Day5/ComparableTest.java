package Day5;

public class ComparableTest {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("Jack", 5.6f, "Wheatish", 65.0f, "DBA", 75000.0f);
		Employee emp2 = new Employee("Jane", 6.5f, "Fair", 55.0f, "Analyst", 85000);
		Employee emp3 = new Employee("Julie", 6.3f, "White", 56.0f, "Developer", 80000);
		Employee emp4 = new Employee("Smith", 5.5f, "Black", 75.0f, "Tester", 75000);
		Employee emp5 = new Employee("Julia", 6.5f, "Fair", 55.0f, "CEO", 175000);
		
		emp1.compareSalary(emp2);
		emp1.compareSalary(emp3);
		emp1.compareSalary(emp4);
		emp1.compareSalary(emp5);
		
		Office off = new Office();
		off.work(emp1, emp5);
	}

}

class Office
{
	//Comparators
	void work(Employee x , Employee y)
	{
		System.out.println("\nEmployees working are : "+x +" \nand " +y);
		if(x.salary > y.salary)
			System.out.println(x.name+"'s salary is more than "+y.name+"'s salary.");
		
		else if(x.salary == y.salary)
			System.out.println(x.name+"'s salary is same as "+y.name+"'s salary.");
		
		else
			System.out.println(x.name+"'s salary is lesser than "+y.name+"'s salary.");
	}
}

class Employee
{
	String name;
	float height;
	String color;
	float weight;
	String designation;
	float salary;
	
	public Employee(String name, float height, String color, float weight, String designation, float salary) {
		super();
		this.name = name;
		this.height = height;
		this.color = color;
		this.weight = weight;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", height=" + height + ", color=" + color + ", weight=" + weight
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	void selfTalk()
	{
		System.out.println("\n"+name +" having self talk....");
	}
	
	//emp2.talk(emp3)
	void compareSalary(Employee x)	//Comparable
	{
		if(salary > x.salary)
			System.out.println(name+"'s salary is more than "+x.name+"'s salary");
		
		else if(salary == x.salary)
			System.out.println(name+"'s salary equal to "+x.name+"'s salary");
		
		else
			System.out.println(name+"'s salary is lesser than "+x.name+"'s salary");

	}
}

class Girl
{
	String name;
	float height;
	String color;
	float weight;
	
	public Girl(String name, float height, String color, float weight) {
		super();
		this.name = name;
		this.height = height;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", height=" + height + ", color=" + color + ", weight=" + weight + "]";
	}
}
