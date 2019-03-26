import java.util.ArrayList;

public class Zoo {
    private String zooName;
    ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args){
        Zoo zoo = new Zoo();
        zoo.demo();
        zoo.printAnimals();

    }

    private void demo(){
        Elephant.Child babyElephant = new Elephant.Child();
        babyElephant.setName("Alf");
        animals.add(babyElephant);
        Animal elephant = new Elephant();
        ((Elephant)elephant).setName("Rolf");
        animals.add(elephant);
        Animal fish = new Fish();
        animals.add(fish);
        Fish fish2 = new Fish();
        animals.add(fish2);

            //((Child) babyElephant).getParent();
            //((Fish) fish).getPond();
            //fish2.getPond();
            //fish2.hashCode();//Object metode
    }

    private void printAnimals(){
        int numberOfAnimals = animals.size();
        System.out.println("Number of animals registered: " + numberOfAnimals);

        int i = 1;
        for(Animal animal : animals){
            animal.setIdNum(i);



            i++;
            System.out.print("ID: " + animal.getIdNum() + " ");
            if(animal.getClass().toString().contains("Elephant") && ((Elephant) animal).getName() != null){
                System.out.print("Name: " + ((Elephant) animal).getName());
            }
            System.out.print(" of Java " + animal.getClass() + " \n");

        }
    }
}
