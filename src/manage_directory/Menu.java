package manage_directory;

public class Menu {

    public void showMenu(){
        System.out.println("""
            ====CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ====
            Chọn chức năng theo số (để tiếp tục): 
            1. Xem danh sách
            2. Thêm mới
            3. Cập nhật
            4. Xóa
            5. Tìm kiếm
            6. Đọc từ file
            7. Ghi vào file
            8. Tìm gần đúng theo SĐT
            0. Thoát
            Chọn chức năng: 
            """);
    }

    public void displayMenu(){
        System.out.println();
    }
}
