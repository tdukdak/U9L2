public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal(String name, int age, boolean vaccinated){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public void adopt(){
        System.out.println("I have been adopted :)");
    }

    public void feed(){
        System.out.println("I've been fed >_<");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
