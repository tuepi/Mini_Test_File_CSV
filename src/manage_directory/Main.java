package manage_directory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ManagePerson managePerson = new ManagePerson();
        WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
        int choice = -1;
            do {
                menu.showMenu();
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice){
                        case 1:
//                            writeAndReadFile.writeList("C:\\Users\\hongh\\IdeaProjects\\quan_ly_danh_ba\\src\\data\\directory.csv", managePerson.list);
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
                            writeAndReadFile.readFile("C:\\Users\\hongh\\IdeaProjects\\quan_ly_danh_ba\\src\\data\\directory.csv",managePerson.list);

                            break;
                        case 7:
                            writeAndReadFile.writeFile("C:\\Users\\hongh\\IdeaProjects\\quan_ly_danh_ba\\src\\data\\directory.csv",managePerson.list);
                            System.out.println("Đã ghi xong.");
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Yêu cầu nhập lại 0 > 7: ");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Nhập lại 0 > 7 ");
                }
            } while (choice != 0);
        }
}
