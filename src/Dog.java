public class Dog extends Animal{
    private boolean walked;

    public Dog(String name, int age, boolean vaccinated, boolean walked){
        super(name, age, vaccinated);
        this.walked = walked;
    }

    public boolean isWalked() {
        return walked;
    }

    public void walk(){
        System.out.println("let's walk :)");
        walked = true;
    }

    public void bark(){
        System.out.println("BARK BARK BARK WOOF WOOF");
    }

    public boolean hasWalked(){
        if(walked == true){
            System.out.println("I've already been walked :p");
        }
        else{
            System.out.println("I need a walk :(");
        }
        return walked;
    }

}
