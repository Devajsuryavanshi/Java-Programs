public class Abstraction {

    public static void main(String args[]){

        Animal test = new elephant();
        System.out.println("Animal is "+test.Animal_type() + " and has "+test.legs() + "legs and is a "+test.food_choice());

    }
    
}

abstract class Animal{
    public abstract String Animal_type();
    public abstract String food_choice();
    public abstract int legs();
}

class elephant extends Animal{

    public String Animal_type(){
        return "Mamal";
    }
    public String food_choice(){
        return "Herbivore";
    }
    public int legs(){
        return 4;
    }
}

    class Whale extends Animal{

        public String Animal_type(){
            return "Mamal";
        }
        public String food_choice(){
            return "Carnivore";
        }
        public int legs(){
            return 0;
        }
}


