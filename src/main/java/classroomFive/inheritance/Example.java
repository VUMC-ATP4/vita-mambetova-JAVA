package classroomFive.inheritance;

public class Example {

    public static void main(String[] args) {
       Dog dog1 = new Dog(4, "Bingo");
       Octopus octopus1 = new Octopus(8, "Handy");
       Chicken chicken1 = new Chicken(2, "Kluck");
       dog1.printLegCount();
       octopus1.printLegCount();
       chicken1.printLegCount();
        System.out.println(octopus1.waterType);
        Fox fox = new Fox(4,"Kumins");
        Animal[] dzivnieki = {dog1, chicken1, octopus1};

        for (int i = 0; i < dzivnieki.length; i++) {
         dzivnieki[i].printLegCount();
        }

    }
}
