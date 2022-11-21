package OOP.Seminar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void openCase(Case cse){
        if(cse.getCondition() == "open"){
            System.out.println("Шкаф уже открыт!!!");
        }
        else System.out.println(this.name + " открыл(а) шкаф!");
    }
    public void hideInCase(Case cse){
        if(cse.getCondition() == "open"){
            System.out.println(this.name + " спрятался!");
        }
        else System.out.println(this.name + " открыл(а) шкаф и спрятался.");
    }
}

