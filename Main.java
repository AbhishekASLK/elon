class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void showValues(int x) {
        System.out.println(x); 
        System.out.println(this.x); 
        System.out.println(super.x); 
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showValues(30); 
    }
}