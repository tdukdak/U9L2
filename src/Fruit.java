public class Fruit {
    public String color;
    public int calories;

    public Fruit(String color, int calories){
        this.color = color;
        this.calories = calories;
    }

    public void healthy(){
        if(calories > 400){
            System.out.println("This fruit is so unhealthy I should throw it out");
        }
        else{
            System.out.println("mmmm healthy");
        }
    }
}
