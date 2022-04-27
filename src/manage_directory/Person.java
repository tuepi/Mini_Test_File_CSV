package manage_directory;

import java.util.Scanner;

public class Person {
    private String name;
    private String phoneNumber;
    private String group;
    private String gender;
    private String address;
    private String email;
    private String dateOfBirth;


    public Person() {
    }

    public Person(String name, String phoneNumber, String group, String gender, String address, String email, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin: ");
        System.out.print("Nhập Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập Số điện thoại: ");
        String  phoneNumber = sc.nextLine();
        System.out.print("Nhập Nhóm: ");
        String group = sc.nextLine();
        System.out.print("Nhập Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập Email: ");
        String email = sc.nextLine();
        System.out.print("Nhập Ngày sinh: ");
        String dateOfBirth = sc.nextLine();
        return new Person(name, phoneNumber, group, gender, address, email, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{"
                + name + ", "
                + phoneNumber +", "
                + group +", "
                + gender +", "
                + address +", "
                + email +", "
                + dateOfBirth+
                '}';
    }
}
