package Seminar_6.Vet_clinic;

import java.util.HashSet;
import java.util.Set;

public class Cat {
    private String name;
    private int age;
    private String color;

    private int catId;

    public Cat(String name, int age, String color, int catId) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getCatId() {
        return catId;
    }

    private String getInfo() {
        return "Кошачий ID: " + catId + " | " + " Кличка: " + name + " | " + " Возраст: " + age + " месяц(а)." + " | " + " Цвет: " + color + ".";
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return age == cat.age && color == cat.color && catId == cat.catId && name.equals(cat.name);
    }


    @Override
    public int hashCode() {
        return catId;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 1, "Черный", 11);
        Cat cat2 = new Cat("Жора", 2, "Рыжий", 12);
        Cat cat3 = new Cat("Жора", 2, "Рыжий", 13);
        Cat cat4 = new Cat("Жора", 2, "Рыжий", 14);

        Set<Cat> setCat = new HashSet<>();
        setCat.add(cat1);
        setCat.add(cat2);
        setCat.add(cat3);
        setCat.add(cat4);
        System.out.println(setCat.size() + " котика.");
        for (var cat : setCat) {
            System.out.println(cat);
        }

        System.out.println(cat2.equals(cat3));

        for (var cat : setCat) {
            System.out.println(cat.hashCode());
        }
    }
}
