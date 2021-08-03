public class frog extends Animal implements Croak{
    enum niche {AQUATIC,LAND,TREE}


    private niche Environment;
    private int PoisonLevel;

    public frog(String name, niche habitat, int poisonLevel, Size frogSize){
        setName(name);
        setSize(frogSize);
        PoisonLevel = poisonLevel;
        Environment = habitat;
    }


    public void croak() {
        System.out.println("I croak!");
    }

    public void jump() {
        System.out.println("I jump!");
    }

    public niche getEnvironment() {return Environment;}
    public void setEnvironment(niche environment) { Environment = environment; }

    public int getPoisionLevel() {return PoisonLevel;}
    public void setPoisonLevel(int poisonLevel) { PoisonLevel = poisonLevel; }


}
