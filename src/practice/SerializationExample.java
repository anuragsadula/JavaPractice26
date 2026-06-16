package practice;

import java.io.*;

class Person implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person("John", "Smith", 18);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        out.writeObject(person);
        out.close();

        // To read the object back from the file, you can use ObjectInputStream as follows:
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
         Person deserializedPerson = (Person) in.readObject();
         in.close();

         System.out.println("Deserialized Person: " + deserializedPerson.getFirstName() + " " + deserializedPerson.getLastName() + ", Age: " + deserializedPerson.getAge());
    }
}
