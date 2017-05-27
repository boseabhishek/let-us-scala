package goInterface;

//cannot be publc - if public, need to be declared in a JustAnInterface.java file
interface JustAnInterface {
    void iAmAbstract();
    String iAmAbstractToo(String someParam);
}

//cannot be public; Java allows only one class/interface to be public
class SuperClass implements JustAnInterface {


    @Override
    public void iAmAbstract() {
        System.out.println("Implemented iAmAbstract");
    }

    @Override
    public String iAmAbstractToo(String someParam) {
        return "Implemented iamAbstractToo when " +someParam + "  is passed";
    }
}

class SuperDuperClass extends SuperClass {

    SuperClass sc = new SuperClass();
}

public class PublicClassToTestThem {

    // non-static sc1 created
    SuperClass sc1 = new SuperClass();

    // non-static pc1 created
    //warning: Do not create an instance of a class inside the body of the same class
    //Infinite recursion - class calls itself
   // PublicClassToTestThem pc1 = new PublicClassToTestThem();

    void testMethod() {
        System.out.println("Inside public class");
    }

    public static void main(String[] args) {

        //java: non-static variable sc1 cannot be referenced from a static context
        // main method is a static context
         //sc1.iAmAbstract();
        //sc1.iAmAbstractToo("Test")

        // static sc2 var is created
        SuperClass sc2 = new SuperClass();
        sc2.iAmAbstract();
        System.out.println(sc2.iAmAbstractToo("Test"));

        // static pc2 var is created
        PublicClassToTestThem pc2 = new PublicClassToTestThem();
        pc2.testMethod();
    }
}
