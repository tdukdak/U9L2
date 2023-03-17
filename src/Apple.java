public class Apple extends Fruit{
    private boolean hasWorms;

    public Apple(String color, int calories, boolean hasWorms){
        super(color, calories);
        this.hasWorms = hasWorms;
    }

    public boolean isHasWorms() {
        return hasWorms;
    }

    public void chuck(){
        if(hasWorms == true){
            System.out.println("THIS APPLE HAS WORMS EWWWW");
        }
        else{
            System.out.println("This apple's fine");
        }
    }
}
