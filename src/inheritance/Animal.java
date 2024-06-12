package inheritance;

public class Animal {
    String name;
    public void eat(){
        System.out.println("Eats");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("Ham ham");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food!");
    }


}

class Main{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.display();
        d.name="Marcel";



    }
}


















