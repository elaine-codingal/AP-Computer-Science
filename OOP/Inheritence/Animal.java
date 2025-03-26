package OOP.Inheritence;
public class Animal {
    private String name;
    private String sound;

    //Create constructor
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    
    public String getName(){
        return name;
    }
    public String getSound(){
        return sound;
    }

}

