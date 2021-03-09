package animalkingdom;

public class Birds extends Animals
{
     public Birds(String name, int yearDiscovered)
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
          return "Fly";
     }

     @Override
     public String breathe()
     {
          return "Lungs";
     }

     @Override
     public String reproduce()
     {
          return "Eggs";
     }
} // Class End
