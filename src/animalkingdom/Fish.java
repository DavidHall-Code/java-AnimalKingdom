package animalkingdom;

public class Fish extends Animals
{
     public Fish(String name, int yearDiscovered)
     {
          super(name, yearDiscovered);
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
}
