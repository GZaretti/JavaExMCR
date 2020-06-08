package FabriqueAbstraite.Animals;

public class Dragon extends Carnivore {
    @Override
    public void eat(Herbivore h) {
        System.out.println("Le dragon mange " + h.getClass().getName());
    }
}
