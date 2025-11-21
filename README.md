# Abstract Class


## 1. Will this code works?
```java
abstract class A {

}

class Test {
    public static void main(String[] args) {
        A a = new A();
    }
}
```

## 2 What is the output of this code?

```java
abstract class A {
    void show() {
        System.out.println("Hello");
    }
}

class Test {
    public static void main(String[] args) {
        A a = new A();
    }
}
```

## 3 What is the output of the following code? abstract class can have constructor? 

```java
abstract class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}

class Test {
    public static void main(String[] args) {
        A a = new B();
    }
}
```

## 4 What is the use of constructor in abstract class?

## 5 Will this work? why?

```java
abstract final class A {
    // abstract class
}
```

# final keyword

1. 
```java
final int x = 10;
x = 20;
```  

2. 
```
final Student s = new Student();
s = new Student(); 
s.name = "Raj"; 
```

3. 
```java
class A {
    final void show() {
        System.out.println("Hello World");
    }
}

class B extends A {
    void show() {
        System.out.println("Bye World");
    } 
}
```

4. 
```java
final class A {
    // code here
}

class B extends A {
    // code here
} 

```

Example: String class

5. 
```
final int x;
x = 10; 
x = 20;
```

6. Can we create object of final class 
```java
final class A {
    A() {
        System.out.println("Hello");
    }
}
```

7. which you will choose for implementation of your project, interface or abstract class?
which is good and which is bad

```java
interface A {
    void m1();
}

abstract class X {
    abstract void m1();
}

class Elon extends X {
    public void m1(){
        // code
    }
}

class Mark implements A {
    public void m1(){
        // code
    }
}
```