
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Darth_Vader", 68);
        Toy toy2 = new Toy(1, "Sauron", 91);
        Toy toy3 = new Toy(2, "Decepticons", 49);
        Toy toy4 = new Toy(3, "Avtobots", 65);
        Toy toy5 = new Toy(id:4, name:"Darth_Sidious", weight:95);
        Toy toy6 = new Toy(id:5, name:"Soft_cat", weight:82);
        Toy toy7 = new Toy(id:6, name:"Lego", weight:75)

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy7);
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }
    
    
}