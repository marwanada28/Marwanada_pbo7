// Animal.java
public class Animal {
    // Properties (fields)
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to make sound (can be overridden by subclasses)
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
