package FabriqueAbstraite;

import FabriqueAbstraite.Animals.Carnivore;
import FabriqueAbstraite.Animals.Herbivore;
import FabriqueAbstraite.Factories.AfricaFactory;
import FabriqueAbstraite.Factories.ContinentFactory;
import FabriqueAbstraite.Factories.MiddleEarthFactory;

class AnimalWorld
{
    Herbivore herbivore;
    Carnivore carnivore;
    AnimalWorld(ContinentFactory cf) {
        herbivore = cf.createHerbivore();
        carnivore = cf.createCarnivore();
    }
    void runFoodChain() {
        carnivore.eat(herbivore);
    }
    public static void main(String ... args)
    {
        AnimalWorld
                aw1 = new AnimalWorld(new MiddleEarthFactory()),
                aw2 = new AnimalWorld(new AfricaFactory());
        aw1.runFoodChain(); // A dragon eats an oliphaunt
        aw2.runFoodChain(); // A lion eats a gazelle
    }
}
