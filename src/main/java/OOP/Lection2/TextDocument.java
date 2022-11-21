package OOP.Lection2;

public class TextDocument {
    StringBuilder sb;
    public TextDocument(){
        sb = new StringBuilder();
    }
    public TextDocument(String data){
        this();
        addAllText(data);
    }
    public void addAllText(String text){
        sb.append(text +"\n");
    }
    public void SaveAs(){

    }

}
