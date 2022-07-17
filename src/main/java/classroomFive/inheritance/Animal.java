package classroomFive.inheritance;

public class Animal {
    int legCount;
    String name;

    public Animal(int legCount, String name){
        this.legCount = legCount;
        this.name = name;
    }

    public void printLegCount(){
        System.out.println("Vards: " + name + "," + "Kaju skaits ir: " + legCount);
    }

}
