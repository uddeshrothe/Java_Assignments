package test2;

class Employee {
	String name;
	int salary;
	
	public Employee() {
		name = null;
		salary = 0;
	}
	
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
}

class Labour extends Employee {
	int OT;
	
	Labour(String n, int sal, int O){
		super(n,sal);
		OT = O;
	}
	
	public int getSalary() {
		return (super.getSalary() + OT);
	}
}

class Manager extends Employee {
	int inc;
	
	Manager(String n, int sal, int i){
		super(n,sal);
		inc = i;
	}
	
	public int getSalary() {
		return (super.getSalary() + inc);
	}
	
}


