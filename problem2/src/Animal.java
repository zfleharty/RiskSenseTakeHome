public abstract class Animal {
    enum Size{SMALL,MEDIUM,LARGE}
    private String name;
    private Size size;

    
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName()
        {
            return name;
        }

    public void setName(String nameGiven) {
        name = nameGiven;
    }

}
