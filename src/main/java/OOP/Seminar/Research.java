package OOP.Seminar;

import java.util.Map;

public class Research {
    public void getFamily(Map<Human, String> fam) {
        for (var rel : fam.entrySet()) {
            if (rel.getValue() == "child") {
                System.out.println("Семья: " + rel.getKey().getName());
            }
        }
        for (var rel : fam.entrySet()) {
//            if (rel.getValue() == "child") {
//                System.out.println("Семья: " + rel.getKey().getName());
//            }
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
}
