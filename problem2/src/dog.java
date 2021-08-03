public class dog extends Animal implements Bark, Jump{
    enum Color {BLACK,WHITE,BROWN,RED}

    private Color furColor;
    private String breed;

    public dog(String name, Color furColor, String breed,Size size){
        setName(name);
        setSize(size);
        this.furColor = furColor;
        this.breed = breed;
    }

    @Override
    public void bark() {
        System.out.println("I bark");
    }
    @Override
    public void jump() {
        System.out.println("I jump!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Color getFurColor() {
        return furColor;
    }

    public void setFurColor(Color furColor) {
        this.furColor = furColor;
    }
}
