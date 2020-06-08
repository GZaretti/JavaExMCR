package FabriqueAbstraite.Animals;

public class Lion extends Carnivore {
    @Override
    public void eat(Herbivore h) {
        System.out.println("Le lion mage" + h.getClass().getName());
    }
}
