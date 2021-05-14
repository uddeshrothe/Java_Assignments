package test2;

abstract class mojo{}
abstract class Base {
    Base()
    {
        System.out.println("Base Constructor Called");
    }
    abstract void fun();
}
class Derived extends Base {
    Derived()
    {
        System.out.println("Extended Constructor Called");
    }
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
class Fourth {
    public static void main(String args[])
    {
        Derived d = new Derived();
    }
}