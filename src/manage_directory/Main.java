package manage_directory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ManagePerson managePerson = new ManagePerson();
        int choice;
            do {
                menu.showMenu();
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        if (managePerson.list.size() != 0){
                            managePerson.display();
                        } else {
                            System.out.println("Danh sách trống!!!");
                        }

                        break;
                    case 2:
                        managePerson.add();
                        break;
                    case 3:
                        System.out.print("Nhập tên người cần sửa: ");
                        String nameEdit = sc.nextLine();
                        managePerson.edit(nameEdit);
                        break;
                    case 4:
                        System.out.print("Nhập tên người cần xóa: ");
                        String nameDelete = sc.nextLine();
                        managePerson.remove(nameDelete);
                        break;
                    case 5:
                        System.out.print("Nhập tên người cần xem: ");
                        String nameShow = sc.nextLine();
                        managePerson.findPersonByName(nameShow);
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Yêu cầu nhập lại 0 > 7: ");
                }
            } while (choice != 0);
        }
}
