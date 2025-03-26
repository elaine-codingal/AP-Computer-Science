package OOP.Inheritence;
public class Dog extends Animal
 {
    private String breed;

    public Dog(String name, String sound, String breed){
        super(name,sound);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void displayDetails() {
        // Display details of the current instance
        System.out.println("Name: " + getName());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + getBreed());
    }
}
