import java.util.HashMap;
import java.util.Set;

public abstract class Animal {
    enum Size{SMALL,MEDIUM,LARGE}
    private String name;

    private HashMap<String,String> Attributes;

    public void setAttribute(String key, String value){
        Attributes.put(key,value);
    }

    public String getAttribute(String key){
        return Attributes.get(key);
            //Should add in condition if key not present (perhaps exception or default return value)
    }
    
    //Perhaps useful function to pretty print an animal and all its set attributes
    public void getAttributes(){
        Set<String> keys = Attributes.keySet();
        System.out.println(name + "{");
        for(String k:keys){
            System.out.println("\t" + k + ": " + Attributes.get(k));
        }

        System.out.println("}");
    }
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    private Size size;
    public String getName()
        {
            return name;
        }

    public void setName(String nameGiven) {
        name = nameGiven;
    }


}

