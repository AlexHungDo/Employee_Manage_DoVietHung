import Model.Employee;
import Service.Action;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Action.createEmploy();
      Action.showEmployee();
      while(true){
      try {
              System.out.println("*******************");
              System.out.println("1-Thêm nhân viên");
              System.out.println("2-Xóa nhân viên");
              System.out.println("3-Thoát");
              System.out.println("*******************");
              System.out.print("Lựa chọn: ");
              int choose =sc.nextInt();
              if (choose>3){
                  System.out.println("Chỉ có 3 lựa chọn !");;
              }
              if (choose==1){
                  Action.newEmployee();
                  Action.showEmployee();
              }
              if (choose==2){
                  Action.DeleteEmployee();
                  Action.showEmployee();
              }
              if (choose==3){
                  System.out.println("Hẹn gặp lại");
                  break;
              }
          } catch (Exception e) {
              System.out.println("Vui lòng chọn đúng định dạng");
              sc.nextLine();
          }
      }
        }
}



