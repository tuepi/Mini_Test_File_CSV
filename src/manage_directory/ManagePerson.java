package manage_directory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ManagePerson implements Manage<Person>{
    List<Person> list = new ArrayList<>();
    Person p = new Person();

    public ManagePerson() throws FileNotFoundException {
//        list.add(new Person("Kiên","0123456654","Bạn Học", "Nam", "Thái Nguyên","kien@gmail.com","23/4/1998"));
//        list.add(new Person("Huy","0187458992","Bạn Học", "Nam", "Hà Nội","khun@gmail.com","13/5/1997"));
//        list.add(new Person("Hùng","0127258393","Bạn Học", "Nam", "Thanh Hóa","sgn@gmail.com","25/3/1992"));
    }

    @Override
    public void add() {
        Person person = p.input();

        list.add(person);
    }

    public int findByName(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void findPersonByName(String name){
        if (findByName(name) != -1) {
            System.out.println("Thông tin người cần tìm là:");
            System.out.println(list.get(findByName(name)));
        } else {
            System.out.println("Không tồn tại " + name);
        }
    }
    @Override
    public void edit(String name) {
        if (findByName(name) != -1){
            System.out.println("Cần sửa thành: ");
            Person person = p.input();
            list.set(findByName(name), person);
            System.out.println("Đã sửa xong.");
        } else {
            System.out.println("Không tồn tại " + name);
        }
    }

    @Override
    public void remove(String name) {
        if (findByName(name) != -1){
            list.remove(findByName(name));
            System.out.println("Đã xóa.");
        } else {
            System.out.println("Không tồn tại " + name);
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }



}
