class A{
    final int noOfAlphabets = 26;// final variable - value once assigned cannot be changed.
    final int noOfDigits;
    // Either assign the value at time of decleration or assign the value inside the constructor.
    A(){
        noOfDigits = 10;
    }
    final void fun(){
        System.out.println("Hii, I'm a function of class A");
    }
}
final class B extends A{ //final classes can not be inherited.
    //void fun(){
    //    System.out.println("Hii, I'm a function of class B");
    //}
}
//class C extends B{

//}
public class FinalStudy {
    public static void main(String[] args) {
        B b = new B();
        b.fun();

    }
}
