package func_interface_mylabs_POC;

public class Student {
	int id;
	
	String name;
	
	double percentage;
	
	String specialization;

	public Student(int i, String string, double d, String string2) {
		this.id = i;
		this.name = string;
		this.percentage = d;
		this.specialization = string2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {		
		return id + "-" + name + "-" + percentage + "-" + specialization;
	}
	
	

}
