package staticexample;

public class DriverClass {

    public static void main(String[] args) {

        MyClass class1 = new MyClass();
        System.out.println(class1.name);

        MyClass class2 = new MyClass();
        System.out.println(class2.name);
        class2.name = "Javier";

        System.out.println(class1.name);

        MyClass.greet();
        
        Integer.parseInt("5");

    }
}
