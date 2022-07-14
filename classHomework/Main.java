package homework.classHomework;

public class Main {


    public static void main(String[] args) {
        Trissturis trissturis = new Trissturis();
        trissturis.sideA = 10;
        trissturis.sideB = 10;
        trissturis.sideC = 10;
        System.out.println(trissturis.irVienadmalu());
        System.out.println(trissturis.irVienadsanu());
        Trissturis trissturis1 = new Trissturis();
        trissturis1.sideX = 13;
        trissturis1.sideY = 13;
        trissturis1.sideZ = 21;
        System.out.println(trissturis.irVienadsanu());
        System.out.println(trissturis.irVienadmalu());

    }

}
