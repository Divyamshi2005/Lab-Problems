import java.util.ArrayList;
import java.util.List;

interface Register {
    void display();
    void delete(String name);
    void prevNext(String name);
    void add(String name);
}
class ClassRegister implements Register {
    private List<String> students;

    public ClassRegister() {
        students = new ArrayList<>();
        students.add("Ajay");
        students.add("Bala");
        students.add("Cathey");
        students.add("Chella");
        students.add("Dolly");
        students.add("Ellan");
        students.add("Francis");
        students.add("Stella");
    }
    public void display() {
        System.out.println(students);
    }
    public void delete(String name) {
        System.out.println(name+" Deleted from the List");
        students.remove(name);
    }

    public void prevNext(String name) {
        int index = students.indexOf(name);
        if (index == -1) {
            System.out.println("Name not found in register");
        } else {
            if (index > 0) {
                System.out.println("Previous: " + students.get(index - 1));
            } else {
                System.out.println("No previous name");
            }
            if (index < students.size() - 1) {
                System.out.println("Next: " + students.get(index + 1));
            } else {
                System.out.println("No next name");
            }
        }
    }

    public void add(String name) {
        System.out.println("Name added sucessfull");
        students.add(name);
    }
}

class RegisterFactory {
    public static Register getRegister() {
        return new ClassRegister();
    }
}

public class week3_Inlab {
    public static void main(String[] args) {
        Register register = RegisterFactory.getRegister();
        register.display();
        register.delete("Chella");
        register.prevNext("Cathey");
        register.add("Zara");
        register.display();
    }
}
