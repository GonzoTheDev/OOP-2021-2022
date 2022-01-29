package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;
    
    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public Cat(String name, int numLives) {
        super(name);
        this.numLives = numLives;
    }

    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    public void killMe()
    {
        if(this.numLives <= 0)
        {
            System.out.println("Dead.");
        } else {
            System.out.println("Ouch.");
        }

        this.numLives -= 1;
    }
}