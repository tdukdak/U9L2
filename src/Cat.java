public class Cat extends Animal{
    private boolean play;

    public Cat(String name, int age, boolean vaccinated, boolean play){
        super(name, age, vaccinated);
        this.play = play;
    }

    public boolean isPlay() {
        return play;
    }

    public void play(){
        System.out.println("let's play ^-_-^");
        play = true;
    }

    public boolean hasPlayed(){
        if(play == true){
            System.out.println("I've already played :p");
        }
        else{
            System.out.println("I need to play :(");
        }
        return play;
    }

    public void meow(){
        System.out.println("MEOWWWW MEOWWW PURRRR");
    }

}
