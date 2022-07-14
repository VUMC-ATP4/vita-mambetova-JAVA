package homework.classHomework;

public class Trissturis {
    double sideA;
    double sideB;
    double sideC;
    double area;
    double area2;
    double sideX;
    double sideY;
    double sideZ;

    Trissturis() {
        System.out.println("We are making a triangle");
    }

    // find triangle area
    Trissturis(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Triangle area is1: " + area);
    }

// if even sided

    public void printResult() {
        Trissturis trissturis = new Trissturis();
        System.out.println(irVienadmalu());
    }

    public boolean irVienadmalu() {
        if (sideA == sideB && sideC != sideA || sideA == sideC &&  sideB != sideA || sideA == sideC && sideB != sideA) {
            System.out.println("Trissturis ir vienadmalu");
            return true;
    } else if (sideA == sideB && sideB == sideC &&  sideC == sideA){
            System.out.println("Trissturis nav vienadmalu");
            return false;
        }
        return false;
    }

    // is even
    public boolean irVienadsanu() {
        if (sideA == sideB && sideB == sideC && sideC == sideA) {
            System.out.println("Trissturis ir vienadsanu");
            return true;
        } else {
            System.out.println("Trissturis nav vienadsanu");
            return false;
        }
    }
//new constructor triangle
        Trissturis(int sideX, int sideY, int sideZ){
        double p = (sideX + sideY + sideZ) / 2;
        area2 = Math.sqrt(p * (p - sideX) * (p - sideY) * (p - sideZ));
        System.out.println("Triangle area is: " + area2);

    }

}