package animalkingdom;

public class Fish extends Animals
{
     public Fish(String name, int yearDiscovered)
     {
          super(name, yearDiscoverd);
     }

     // FROM ANIMALS
     // public abstract String move();
     // public abstract String breath();
     // public abstract String reproduce();

     @Override
     public String move()
     {
          return "Swim";
     }

     @Override
     public String breathe()
     {
          return "Gills";
     }

     @Override
     public String reproduce()
     {
          return "Eggs";
     }
} // Class End
