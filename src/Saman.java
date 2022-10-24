public class Saman {
    int physicalFitness(){
        return 5;
    }
}
class Amara extends Saman{
    @Override
    int physicalFitness() {
        return 60;
    }
}
class Kamal extends Amara{
    String surname(){
        return "Disanayake";
    }
}
class TestProgram{
    public static void main(String[] args) {
        Saman s = new Saman();
        Amara a = new Amara();
        Kamal k = new Kamal();
        System.out.println("Saman's height "+ s.physicalFitness()+" ft");
        System.out.println("Amara's weight "+ a.physicalFitness()+" KG");
        System.out.println("Kamal's surname is "+ k.surname());

    }

}
