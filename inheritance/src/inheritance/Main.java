package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age=24;
		customer.email="ornek@gmail.com";
		customer.firstName="Mustafa";
		customer.lastName="Iþýk";
		customer.id= 1;
		
		employee.age=28;
		employee.firstName= "burak";
		employee.lastName="Aga";
		employee.salary= 15.000;
		employee.id=2;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.BestEmployee();
		employeeManager.add();
		employeeManager.list();
		customerManager.add();
		customerManager.list();
	}

}
