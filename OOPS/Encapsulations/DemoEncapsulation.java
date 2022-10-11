package OOPS.Encapsulations;

public class DemoEncapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpId(3);
        e1.setEmpName("Navin");
        Employee e2 = new Employee();
        e2.setEmpId(5);
        e2.setEmpName("Sid");
        System.out.println(e1.getEmpId());
        

    }
}

class Employee
{
    private int empId;
    private String empName;

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }
}
