package s0318;

public class Employee {

	
	private String name;
	private int salary;
	String grade;
	static int totalEmployee; // 사원이 입사할 때마다 이 값을 증가시켜야함, new하면, 즉 생성자를 실행할 때마다 증가시켜야함
	
	
	Employee(){
		
		
		++Employee.totalEmployee; //지금 생성자 2개있는데, 둘 중 하나의 생성자를 계속 실행할 거니까 두 곳다!
	}
	
	Employee(String name, int salary, String grade){
		
		this.name = name;  // 위의 멤버 변수에 접근하기 위해 this를 사용함
		this.salary = salary;
		this.grade = grade;
		
		
		++Employee.totalEmployee;
	}
	
	void info() {
		System.out.println("name: " + this.name+ ", salary: "+ this.salary + ", grade: "+grade);
		
		Employee.printTotalEmployee(); //일반 메소드가 만들어진 시점에는 클래스가 다 만들어져 있으니까, 클래스 메소드 에서는 인스턴스 멤버에 접근 불가
	}
	
	
	static void printTotalEmployee() {
			System.out.println("총 사원 수: " + Employee.totalEmployee+ " 명");  //static 변수는 구분을 위해 항상 자신의 클래스에서 사용하더라도 class. 으로 표현함
	}
	
	//사원의 이름을 알고 싶을때
	
	public String getName(){ // 겟어 메소드!! 이런거는 멤버 변수값을 보게 해주는 것
		return this.name;
	}
	
	public int getSalary(){ // 겟어 메소드!! 이런거는 멤버 변수값을 보게 해주는 것
		return this.salary;
	}
	
	public void setSalary(int salary) {  //셋어 메소드!! 수정하고 싶을 때!!, 연봉을 매개면수로 받아서 바꿔주면됨
		this.salary= salary;
	}
	
	
	
}

//추가 과제에서 메소드 정의 되어 있는 것 바꾸면 안됨
	
