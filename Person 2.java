package task2;
// Question 1.4
// creating base class person with attributes name and age
public class Person {
    String name;
    int age;

// creating parameterised constructor for person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        // creating an object
        Employee e = new Employee("tony", 24,11000000,1234567);
        System.out.println(e);

        }
    }


class Employee extends Person{
    int employeeID;
    float salary;
// using super keyword to initialise the attributes of parent class
    public Employee(String name, int age, float salary, int employeeID) {
        super(name, age);
        this.salary = salary;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



