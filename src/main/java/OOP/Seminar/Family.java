package OOP.Seminar;

import java.util.Map;

public class Family {
    public Map<Human, String> doFamily(Map<Human, String> fam, Human h, String relationship) {
        fam.put(h, relationship);
        return fam;
    }
}
