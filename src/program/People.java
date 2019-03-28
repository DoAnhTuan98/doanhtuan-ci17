package program;

public class People {
    String name;
    int age;

    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public static void main(String[] args){
        People person1 = new People("John",20);
        System.out.println(person1.name);

    }

}


//class student extends People{
//    // String name
//    // int age
//    // contructor
//    // ham con bat buoc phai co  1 ham tao giong het class cha
//    double average;
//    public student(String name, int age){
//        super(name, age); // ham tao // this.name, this.age
//        super.name; // thuoc tinh
//        super.eat();
//
//    }
//}