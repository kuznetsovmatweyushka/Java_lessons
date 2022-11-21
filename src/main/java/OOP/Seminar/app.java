package OOP.Seminar;

import java.util.HashMap;
import java.util.Map;


public class app {
    public static void main(String[] args) {
        Human h2 = new Human("Olga");
        Human h3 = new Human("Sergey");
        Human h4 = new Human("Natasha");
        Human h5 = new Human("Valya");
        Human h6 = new Human("Dima");
        Human h7 = new Human("Misha");
        Human h1 = new Human("Mathew");
        Map<Human,String> fam = new HashMap<>();
        Family fam1 = new Family();
        fam1.doFamily(fam,h1,"child");
        fam1.doFamily(fam,h2,"parent");
        fam1.doFamily(fam,h3,"parent");
        fam1.doFamily(fam,h4,"grma");
        fam1.doFamily(fam,h4,"grma");
        fam1.doFamily(fam,h5,"grma");
        fam1.doFamily(fam,h6,"grfa");
        fam1.doFamily(fam,h7,"grfa");
        Research r = new Research();
        r.getFamily(fam);
        Case case1 = new Case("closed");
        h2.openCase(case1);
        h1.hideInCase(case1);
        h2.openCase(case1);
    }
}



