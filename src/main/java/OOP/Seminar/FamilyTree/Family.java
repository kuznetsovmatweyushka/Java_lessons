package OOP.Seminar.FamilyTree;

import java.util.Map;

public class Family implements Research {
    public Map<Human, String> doFamily(Map<Human, String> fam, Human h, String relationship) {
        fam.put(h, relationship);
        return fam;
    }

    @Override
    public void getFamily(Map<Human, String> fam) {
        for (var rel : fam.entrySet()) {
            if (rel.getValue() == "child") {
                System.out.println("Семья: " + rel.getKey().getName());
            }
        }
        for (var rel : fam.entrySet()) {

            if (rel.getValue() == "parent") {
                System.out.println("Родитель: " + rel.getKey().getName());
            }
            if (rel.getValue() == "grma") {
                System.out.println("Бабушка : " + rel.getKey().getName());
            }
            if (rel.getValue() == "grfa") {
                System.out.println("Дедушка : " + rel.getKey().getName());
            }
        }
    }

    @Override
    public void getGrMa(Map<Human, String> fam) {
        for (var rel : fam.entrySet()) {
            if (rel.getValue() == "grma") {
                System.out.println("Бабушка : " + rel.getKey().getName());
            }
        }
    }
}

