import java.util.ArrayList;

public class ShallowCopy {
    public static void main(String[] args) {
        ArrayList<Person> base = new ArrayList<Person>();
        
        Person original = new Person("원조입니다!!");
        base.add(original);
        System.out.println("base 변경 전: " + base.get(0).getName());

        ArrayList<Person> copyArray = base;
        copyArray.set(0, new Person("새로운 친구입니다!!"));
        System.out.println("base 변경 후: " + base.get(0).getName());
        System.out.println("copyArray 변경 후: " + copyArray.get(0).getName());
    }    
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}