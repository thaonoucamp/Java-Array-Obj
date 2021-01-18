package myPackage;

public class Student {
    private String name;
    private String index;
    private int age;

    public Student() {

    }

    public Student(String name, String index, int age) {
        this.name = name;
        this.age = age;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
