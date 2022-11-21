package OOP.Lection2;

public class programm {
    void A(){
        System.out.println("a()");
    }
    public static void main(String[] args) {
        programm pr = new programm();
        pr.A();
//        A(); если статик в названии метода
        Foo f1 = new Foo();
        f1.value =123;
        //System.out.println(f1.value);
        f1.printCount();
        Foo f2 = new Foo();
        f2.value =222;
        //System.out.println(f2.value);
        f2.printCount();
        Foo f3 = new Foo();
        f3.value =333;
        //System.out.println(f3.value);
        f3.printCount();
        System.out.println(Foo.getCount());
        System.out.println(Doo.getCount());
    }
}
