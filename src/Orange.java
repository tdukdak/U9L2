public class Orange extends Fruit{
    private boolean hasSeeds;

    public Orange(String color, int calories, boolean hasSeeds){
        super(color, calories);
        this.hasSeeds = hasSeeds;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    public void valid(){
        if(hasSeeds == true){
            System.out.println("THIS ORANGE HAS SEEDS EWWWW");
        }
        else{
            System.out.println("oh cool this orange doesnt have seeds");
        }
    }
}
