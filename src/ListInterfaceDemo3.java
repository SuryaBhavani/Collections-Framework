import java.util.*;
public class ListInterfaceDemo3 {
    public static void main(String []args){
        System.out.println("Enter the number of employees :");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();s.nextLine();
        List <EmployeeDetails> al=new ArrayList<>();
        EmployeeDetails obj[]=new EmployeeDetails[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter employee id:");
            int empId=s.nextInt();s.nextLine();
            System.out.println("Enter employee name:");
            String empName=s.nextLine();
            System.out.println("Enter worklocation:");
            String workLocation=s.nextLine();
            System.out.println("Enter Salary");
            float salary=s.nextFloat();s.nextLine();
            obj[i]=new EmployeeDetails(empId,empName,workLocation,salary);
            al.add(obj[i]);

        }

        for(EmployeeDetails i:al) {
            if (i.getSalary() < 10000) {
                System.out.println(i.getEmpName() + " " + i.getEmpId() + " " + i.getWorkLocation() + "  " + i.getSalary());
            }
        }

    }
}
class EmployeeDetails{
    private int empId;
    private String empName,workLocation;
    private float salary;
    EmployeeDetails(int empId,String empName,String workLocation,float salary){
        super();
        this.empId=empId;
        this.empName=empName;
        this.workLocation=workLocation;
        this.salary=salary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public String getWorkLocation(){
        return workLocation;
    }
    public float getSalary(){
        return salary;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public  void setWorkLocation(String workLocation){
        this.workLocation=workLocation;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }


}