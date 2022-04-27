package manage_directory;

public interface Manage<T> {

    void add();
    void edit(String name);
    void remove(String name);
    void display();

}
