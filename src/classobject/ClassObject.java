package classobject;

class NoteBook{
    int pages;
    String company;
    int price;

    public void specifications(){
        System.out.println("\n"+company+"'s Notebook contains "+pages+" with price of Rs"+price);
    }
}

public class ClassObject {

    public static void main(String[] args) {
        NoteBook myNotebook = new NoteBook();
        myNotebook.company = "DOMS";
        myNotebook.pages = 200;
        myNotebook.price = 75;

        myNotebook.specifications();
    }
}
