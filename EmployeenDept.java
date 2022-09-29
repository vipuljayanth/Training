import java.util.Scanner;

public class EmployeenDept {}
    class EmployeeDetails {
        int id;
        int age;
        String deptId;

        String name;
        String address;
        String Dept;

        public int getID() {
            return id;
        }

        public void setId() {
            this.id = id;

        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;

        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDept() {
            return Dept;

        }

        public void setDept(String Dept) {
            this.Dept = Dept;
        }

        public String getDeptId() {
            return deptId;
        }

        public void setDeptID(String deptId) {
            this.deptId = deptId;
        }


        @Override
        public String toString() {
            return "EmployeeDetails{" +
                    "id=" + id +
                    ", age=" + age +
                    ", deptId='" + deptId + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", Dept='" + Dept + '\'' +
                    '}';
        }

        public void func(EmployeeDetails employee) {
        }
    }

    class Department {
        String DeptName;

        public String getDEptName() {
            return DeptName;
        }

        public void setDeptName(String DeptName) {
            this.DeptName = DeptName;
        }

    }

    class EmployeeTest {
        public static void main(String[] args) {
            EmployeeTest employeeTest = new EmployeeTest();
            EmployeeDetails[] employees = new EmployeeDetails[10];
            for (int i = 0; i <= 9; i++) {
                employees[i] = new EmployeeDetails();
                employeeTest.func(employees[i]);
            }
        }

        void func(EmployeeDetails emp1) {
            setdata(emp1);
            getdata(emp1);
        }


    void getdata(EmployeeDetails emp1) {
        System.out.println("emp1 name" + emp1.getName());
        System.out.println("emp1 age " + emp1.getAge());
        System.out.println("emp1 id " + emp1.getID());
        System.out.println("emp1 Dept " + emp1.getDept());
        System.out.println("emp1 DeptId " + emp1.getDeptId());
        System.out.println("emp1 address " + emp1.getAddress());
    }

    void setdata(EmployeeDetails emp1) {
        Scanner sc= new Scanner(System.in);

        int  Id= Integer.parseInt(sc.next());
        String name=sc.next();
        int age= Integer.parseInt(sc.next());
        String Dept=sc.next();
        String DeptId=sc.next();
        String Address=sc.next();
        emp1.setId( );
        emp1.setName("");
        emp1.setAge(Integer.parseInt(" "));
        emp1.setDept(" ");
        emp1.setDeptID(" ");
        emp1.setAddress(" ");
    }

}


