package OOP.Seminar.FamilyTree;

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
        fam1.getFamily(fam);
        System.out.println();
        fam1.getGrMa(fam);
        System.out.println();
        Case case1 = new Case(Case.condition);
        h1.opnCase(case1);
        h1.closeCase(case1);
        h1.hideInCase(case1);
        h2.closeCase(case1);
    }
}



