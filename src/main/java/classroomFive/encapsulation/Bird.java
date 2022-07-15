package classroomFive.encapsulation;

 public class Bird {
     public String name;

     public void printText (){
         System.out.println("Printeju putnu");
         System.out.println("Si ir publiska metode");
     }

     private void ptintTextSpecial (){
         System.out.println("Si ir privata metode");
     }
     void defaultMethodExample (){
         System.out.println("Si ir default metode");
     }
}
