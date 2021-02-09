package animalkingdom;

public class Mammals extends Animals
{
     public Mammals(String name, int yearDiscovered)
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
          return "Walk";
     }

     @Override
     public String breathe()
     {
          return "Lungs";
     }

     @Override
     public String reproduce()
     {
          return "Live Birth";
     }
}
