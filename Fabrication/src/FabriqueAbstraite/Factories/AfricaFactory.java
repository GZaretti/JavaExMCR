package FabriqueAbstraite.Factories;

import FabriqueAbstraite.Animals.Carnivore;
import FabriqueAbstraite.Animals.Gazelle;
import FabriqueAbstraite.Animals.Herbivore;
import FabriqueAbstraite.Animals.Lion;

public class AfricaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Gazelle();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Lion();
    }
}
