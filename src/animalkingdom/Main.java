package animalkingdom;

import java.util.*;

public class Main
{
     public static void main(String[] args)
     {
          System.out.println("\nInitial Compile Complete!!\n");

          System.out.println("\n**** MVP ****\n");

          List<Animals> animalList = new ArrayList<>();
          // Adding Mammals
          animalList.add(new Mammals("Panda", 1869));
          animalList.add(new Mammals("Zebra", 1778));
          animalList.add(new Mammals("Koala", 1816));
          animalList.add(new Mammals("Sloth", 1804));
          animalList.add(new Mammals("Armadillo", 1758));
          animalList.add(new Mammals("Raccoon", 1758));
          animalList.add(new Mammals("Bigfoot", 2021));

          // Adding Birds
          animalList.add(new Birds("Pigeon", 1837));
          animalList.add(new Birds("Peacock", 1821));
          animalList.add(new Birds("Toucan", 1758));
          animalList.add(new Birds("Parrot", 1824));
          animalList.add(new Birds("Swan", 1758));

          // Adding Fish
          animalList.add(new Fish("Salmon", 1758));
          animalList.add(new Fish("Catfish", 1817));
          animalList.add(new Fish("Perch", 1758));

          //Using Lambda Expressions and displaying the results to the console
          System.out.println("\n**** List all the animals in descending order by year named ****\n");
          animalList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
          animalList.forEach( a -> System.out.println("Animal: " + a.getName() + " | Year Discovered: " + a.getYearDiscovered()));

          System.out.println("\n**** List all the animals alphabetically ****");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(a -> System.out.println(a.getName()));


          System.out.println("\n**** List all the animals order by how they move ****");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach(a -> System.out.println(a.getName() + " | How they move: " + a.move()));


          System.out.println("\n**** List only those animals that breath with lungs ****");
		animalList.forEach( a ->
          {
			if (a.breathe().equalsIgnoreCase("lungs"))
               {
				System.out.println(a.getName());
			}
		});


          System.out.println("\n**** List only those animals that breath with lungs and were named in 1758 ****");
		animalList.forEach( a -> {
			if (a.breathe().equalsIgnoreCase("lungs") && a.getYearDiscovered() == 1758)
               {
				System.out.println(a.getName());
			}
		});


          System.out.println("\n**** List only those animals that lay eggs and breath with lungs ****");
		animalList.forEach( a -> {
			if (a.breathe().equalsIgnoreCase("lungs") && a.reproduce().equalsIgnoreCase("eggs"))
               {
				System.out.println(a.getName());
			}
		});


          System.out.println("\n**** List alphabetically only those animals that were named in 1758 ****");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(a -> {
			if (a.getYearDiscovered() == 1758)
               {
				System.out.println(a.getName());
			}
		});

          System.out.println("\n*** STRETCH ***\n");
		System.out.println("\n**** For the list of animals, list alphabetically those animals that are mammals ****\n");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(a ->
          {
			if (a.reproduce().equalsIgnoreCase("live birth")) {
				System.out.println("Animal Name: " + a.getName() + " | Reproduction: " +  a.reproduce() + " | Movement: " + a.move() + " | Year Discovered: " + a.getYearDiscovered());
			}
		});
     }
} // Main End
