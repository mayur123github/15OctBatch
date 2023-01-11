package com.arrrylistdemo;

public class Employee 
{   // id, name, salary.

		private int id;
		private String name;
		private String salary;
		
		public Employee(int id, String name, String salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
	 	public Employee() {
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

  @Override // if we have mutiple object we need overide to string method at once 
   public String toString() 
   {
   return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
   }


		
		
		


		


}
