## 1. Choose the correct option

```java
class Test {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Hello, World!");
        }
    }
}
``` 

## Options:

1. "Hello, World!" is printed only once
2. No output is printed
3. "Hello, World!" prints infinitely
4. Compilation error

## 2. When we create child class object, parent class object is created or not? Give me proof

## Options

1. Yes
2. No

## 3. What is the output of this code?

```java
class Test {
    String name = "AbhishekASLK";
    Test(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
```

## Options

1. AbhishekASLK
2. Compiler time Error
3. Runtime Error
4. Mujhe kya pata


## 4. What is the output of this code?

```java
class Test {
    String name;
    int age;
    Test(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
```

## 5. What is the output of the below code?

```java
class Test {
    Test(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}
```

## Answers:
### 2.
```java
class Parent {
    Parent(){
        System.out.println(this.hashCode());
    }
}

class Child extends Parent {
    Child(){
        System.out.println(this.hashCode());
    }
}

public class Main
{
	public static void main(String[] args) {
	    Child c = new Child();
	    System.out.println(c.hashCode());	
	}
}
```

