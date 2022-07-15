package classroomFive.inheritance;

public class Fox {

    int legCount;
    String name;

    public Fox(int legCount, String name) {
        this.legCount = legCount;
        this.name = name;
    }
    public void printLegCount (){
        System.out.println("Vards: " + name + "Kaju skaits: " + legCount );
    }


}
