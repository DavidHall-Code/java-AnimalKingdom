package animalkingdom;

public abstract class Animals
{
     int maxId = 0;
     int id;
     String name;
     int yearDiscovered;

     public Animals(String name, int yearDiscovered)
     {
          maxId++;
          id = maxId;
          this.name = name;
          this.yearDiscovered = yearDiscovered;
     }

     public abstract String move();
     public abstract String breathe();
     public abstract String reproduce();

     public int getYearDiscovered()
     {
          return yearDiscovered;
     }

     public String getName()
     {
          return name;
     }
}
