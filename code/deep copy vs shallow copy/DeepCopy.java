import java.util.ArrayList;

public class DeepCopy {
    public static void main(String[] args) {
        ArrayList<Person> base = new ArrayList<Person>();
        
        Person original = new Person("원조입니다!!");
        base.add(original);
        System.out.println("base 변경 전: " + base.get(0).getName());

        ArrayList<Person> copyArray = new ArrayList<Person>();
        for(Person each : base) // 안에 있는 밸류를 새로 정의해서 넣어줌.
            copyArray.add(new Person(each.getName()));

        // ArrayList<Person> newCopyArray = base.clone();
        
        copyArray.set(0, new Person("새로운 친구입니다!!"));
        System.out.println("base 변경 후: " + base.get(0).getName());
        System.out.println("copyArray 변경 후: " + copyArray.get(0).getName());
    }    
}

class Person implements Cloneable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // public Person clone() throws CloneNotSupportedException {
    //     Person person = (Person) super.clone();
    //     person.name = this.name;

    //     return person;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}