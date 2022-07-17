package classroomFive.encapsulation;

public class Bird {
    private String colour;
    private String name = "Pollija";

    public void setKrasa(String krasa){
        this.colour = krasa;
    }

    public String getKrasa(){
        return colour;
    }


    //varam piekļūt no citām klasēm
    public void printText(){
        System.out.println("Šī ir publiska metode");
        System.out.println("Printēju putnu");
        printTextSpecial();
    }
    //varam piekļūt tikai no šīs klases
    private void printTextSpecial(){
        System.out.println("Šī ir privāta metode");
    }

    //varam piekļūt pakotnes ietvaros
    void defaultMethodExample(){
        System.out.println("Šī ir default metode");
    }

}