public class Person {
    private String name;
    private int age;
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
public Person(){}
    @Override
    public String toString() {
        return
                "\nname=" + name +
                "\nage=" + age +
                "\njob=" + job ;
    }
}
