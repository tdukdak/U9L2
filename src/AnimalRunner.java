public class AnimalRunner {
    public static void main(String[] args) {
        Animal bear = new Animal("Usur the Bone Crusher and Man Eater", 15, false);
        System.out.println(bear.getName());
        System.out.println(bear.getAge());
        System.out.println(bear.isVaccinated());

        Dog pitbull = new Dog("Princess", 6, true, false);
        System.out.println(pitbull.getName());
        System.out.println(pitbull.getAge());
        pitbull.bark();
        pitbull.adopt();
        pitbull.hasWalked();
        pitbull.walk();
        pitbull.hasWalked();

        Cat puss = new Cat("Puss in Boots", 13, false, false);
        System.out.println(puss.getName());
        System.out.println(puss.getAge());
        puss.meow();
        puss.adopt();
        puss.hasPlayed();
        puss.play();
        puss.hasPlayed();
    }
}
