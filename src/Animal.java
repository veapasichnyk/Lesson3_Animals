public class Animal {
    private String name;
    private double speed;
    private int    age;

    public Animal ( String name , double speed ,
                    int age ) {
        this.name  = name;
        this.speed = speed;
        this.age   = age;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setSpeed ( double speed ) {
        this.speed = speed;
    }

    public double getSpeed () {
        return speed;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }
}
