package FabriqueAbstraite.Factories;

import FabriqueAbstraite.Animals.Carnivore;
import FabriqueAbstraite.Animals.Herbivore;

public abstract class ContinentFactory {
    public abstract Herbivore createHerbivore();
    public abstract Carnivore createCarnivore();
}
