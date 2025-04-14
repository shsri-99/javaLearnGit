package Constructor;

public class Constructor {
    String greetings;
    String name;
    int age;
    //Default Contructor
    Constructor(){
        this.greetings="Hello";
        System.out.println(greetings + " This is default constructor");
    }
    //Parameterised Constructor
    Constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    //Copy Constructor
    Constructor (Constructor copy){
        this.name = copy.name;
        this.age = copy.age;
    }
}
