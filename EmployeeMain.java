package s0318;

public class EmployeeMain {

	
	public static void main(String[] args) {
		
		//int totalEmployee =0; 객체 스럽게 만들기 위해..
		
		//입사할 때마다 몇 명의 사원이 입사했는지 개수를 세아리고 싶음
		// e.name= "홍길동" ; 이렇게 변수로 접근하는 것은 좋지않음!
		
		// ============================================
		// e. 하지 않고.. 그러니까 현재 몇 명의 사원을 가지고 있는지 바로 알고싶은 경우! 현재는 인스턴스 생성하지 않고는 메소드를 호출할 수 없는데
		// System.out.println(Employee.totalEmployee+ " 명"); // 이렇게 직접 접근하는거는 안좋지.. 
		
		//Employee.printTotalEmployee(); //printTotalEmployee 메소드에 static을 붙여줘서 접근 가능!!
		
		
		
		
		Employee e =new Employee("홍길동", 3200, "사원");  //생성자 형태로 써보자
		//e.name="종범박"; 멤버 변수를 private으로 해주면 오류남, 외부에서 내 멤버 변수에 접근하지 못하게함
		//totalEmployee++;
		
		System.out.println("첫 번째 사원명: " + e.getName());  //겟어 메소드를 통해 접근 가능
		
		
		
		
		Employee e2= new Employee("강길동", 4000, "주임");
		//totalEmployee++;
		System.out.println("두 번째 사원명: " + e2.getName());
		
		Employee e3= new Employee("윤길동", 3600, "사원");
		//totalEmployee++;
		System.out.println("세 번째 사원명: " + e3.getName());
		
		
		// e.info();
		// e2.info();
		// e3.info();
		
		
		//e3.printTotalEmployee(); //이렇게 막상 해보니까 사원 수가 증가된게 아니라 1명로 나옴, static으로 처리함
		
		//System.out.println("입사한 총 사원 수:"+ totalEmployee);
		//지금까지 입사한 사원이 몇명일까? 변수 만들기! totalEmployee++
		
		
		
		//Employee.printTotalEmployee();
		
		e2.info();
		
		// e.name 같은거 못하게 하기 위해서 사용하는게 '접근제한자' public=모두 접근 가능, private=접근 불가, 메소드는 모두 public으로 만들고!, 멤버 변수는 private으로 만들기
		
		// e.salary =3800; 하고 싶은데 접근 private로불가 
		
		
		e.setSalary(5000);  // 이렇게 하면 멤버 변수말고, 메소드로 했는데도 다 고칠 수 있지 않을까? => 이런 메소드를 구성하는 선택권이 개발자에게 있음
		System.out.println(e.getSalary());
		
	}
}
