package FabriqueAbstraite.Factories;

import FabriqueAbstraite.Animals.Carnivore;
import FabriqueAbstraite.Animals.Dragon;
import FabriqueAbstraite.Animals.Herbivore;
import FabriqueAbstraite.Animals.Oliphaunt;

public class MiddleEarthFactory extends ContinentFactory {

    @Override
    public Herbivore createHerbivore() {
        return new Oliphaunt();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Dragon();
    }
}
