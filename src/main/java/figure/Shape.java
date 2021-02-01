package figure;

public abstract class Shape implements Figures {

   private String name;

   Shape(String name) {
       this.name = name;
   }

    public String getName() {
        return name;
    }

    @Override
    public String printName() {
        return getName();
    }
}
