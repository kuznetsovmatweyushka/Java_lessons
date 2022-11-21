package OOP.Seminar.FamilyTree;

import OOP.Seminar.FamilyTree.Case;

public class Human implements CaseAction{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void openCase(Case cse){

    }

    @Override
    public void hideInCase(Case cse) {
        if(Case.condition == "open"){
            System.out.println(this.name + " спрятался!");
            Case.condition = "closed";
        }
        else {
            System.out.println(this.name + " открыл(а) шкаф и спрятался.");
            Case.condition = "closed";
        }
    }

    @Override
    public void opnCase(Case cse) {
        if(Case.condition == "open"){
            System.out.println("Шкаф уже открыт!!!");
        }
        else System.out.println(this.name + " открыл(а) шкаф!");
    }

    @Override
    public void closeCase(Case cse) {
        if(Case.condition == "closed"){
            System.out.println("Шкаф уже закрыт!!!");
        }
        else {
            System.out.println(this.name + " закрыл(а) шкаф!");
            Case.condition = "closed";
        }
    }
}

