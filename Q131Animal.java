//Main.java
class Main {
  public static void main(String[] args) {

    // //추상클래스는 인스턴스를 생성할수 없다. 
    // // Animal x = new Animal();

    Animal[] a = new Animal[2];

    a[0] = new Dog("뭉치","치와와"); //클래스 Dog참조
    a[1] = new Cat("마이클", 7); //클래스 Cat 참조

    // for (Animal s : a) {
    //   System.out.println(s.getName()+ " ");
    //   s.bark();
    //   System.out.println();
    // }

    for (int i = 0 ; i < a.length ; i++) {
      System.out.print(a[i].getName() + " ");
      a[i].bark();
      System.out.println();
    }


  }
}


// 

//Animal.java
abstract class Animal {
  private String name;
  public Animal(String name) { this.name = name;}
  public abstract void bark();
  public String getName() {return name;}
}

// 추상 클래스는 설계도 공통적인 개념
// 인스턴스를 생성할수 없거나 생성해서는 안되는 것
// 메서드의 내용을 정의 할수 없다. 내용은 서브클래스 구현
// 추상 클래스에서 인스턴스는 생성할수 없다. 


// 추상 매써드 "이 클래스에서는 매서드 자체를 정의할 수가 없으니 나로부터 파생된 클래스에서 정의해 주세요"
// 추상 매써드는 {} 대신에 ; 선언
// 추상 매서드를 1개라도 가지는 클래스는 반드시 추상 클래스로 선언해야한다. 


//Cat.java
class Cat extends Animal {
  private int age; //나이

  // 생성자
  public Cat(String name, int age) {
    super(name); this.age = age;
  }

  public void bark() { System.out.println("냐옹");}

}

//Dog.java
class Dog extends Animal {
  private String type; //개의 종류

  // 생성자
  public Dog(String name, String type) {
    super(name); this.type = type;
  }

  public void bark() { System.out.println("멍멍");}

}

