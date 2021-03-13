package introduction;

public class Dock {

    public static void main(String[] args) {

        Boat microTitanic = new Boat("Small", 5.2, "Red");

        System.out.println(microTitanic.getHull());
        System.out.println(microTitanic.getMotorSize());
        System.out.println(microTitanic.getColor());

        System.out.println(microTitanic);

        String hornSound = microTitanic.honkHorn();
        System.out.println(hornSound);

        String hornSound2 = microTitanic.honkHorn("Hey idiot! ");
        System.out.println(hornSound2);

        System.out.println(microTitanic.isSeaWorthy());

        microTitanic.setAnchorDropped(true);



    }
}
