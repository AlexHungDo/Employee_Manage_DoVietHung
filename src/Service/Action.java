package Service;

import Model.Employee;

import java.util.*;


public class Action {
    public static List<Employee> employeeList;
    public static void showEmployee(){
        System.out.println("id"+" "+"      Tên  |"+" "+"Tuổi|"+" "+"Phòng ban|"+" "+"     Code|"+" "+"Lương" );
        for (Employee a: employeeList){
            System.out.println(a.getId()+"| "+a.getName()+"| "+a.getAge()+"| "+a.getDepartment()
            +"| "+a.getCode()+"| "+a.getSalaryRate());}
    }
    public static List<Employee> createEmploy() {
        Employee employee = new Employee();
        List<String> departmentList = new ArrayList<>();
        departmentList.addAll(Arrays.asList("Phòng nhân sự", "Phòng tài chính", "Phòng kinh doanh"));
         ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        for (int i = 1; i <= 10; i++) {
            String name = "Nguyen Van " + (char) ('A' + (i - 1));
            Random randomAge = new Random();
            long age = 20 + randomAge.nextLong(10);
            String code = "123" + (char) ('A' + i);
            Double salaryRate = (double) (i * 10000);
            Random random = new Random();
            int index = random.nextInt(departmentList.size());
            String department = departmentList.get(index);
            listEmployee.add(new Employee(i, name, age, department, code, salaryRate));
        }
        employeeList = listEmployee;
        return employeeList;
    }
    public static void newEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");String name =sc.nextLine();
        System.out.println("Nhập vào tuổi: ");long age =sc.nextLong(); sc.nextLine();
        System.out.println("Nhập vào phòng ban: ");String department=sc.nextLine();
        System.out.println("Nhập vào code ");String code =sc.nextLine();
        System.out.println("Nhập vào lương ");int salaryRate=sc.nextInt();
        Employee lastEmployee = employeeList.get(employeeList.size()-1);
        employeeList.add(new Employee(lastEmployee.getId()+1,name,age,department,code,(double)salaryRate));
    }
    public static void DeleteEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id nhân viên bạn muốn xóa" );
        int empId=sc.nextInt();
        boolean found = false;
        for (int i = employeeList.size() - 1; i >= 0; i--) {
            if (employeeList.get(i).getId() == empId) {
                employeeList.remove(i);
                System.out.println("Đã xóa thành công nhân viên có id "+empId);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy nhân viên có id "+empId);
        }
        }
    }
