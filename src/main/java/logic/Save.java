package logic;

import logic.entity.Manufacturer;
import logic.entity.Souvenir;

import java.util.Set;

public class Save {
    private final  Set<Souvenir> souvenirSet;
    private final  Set<Manufacturer> manufacturersSet;

    public Save(Set<Souvenir> souvenirSet, Set<Manufacturer> manufacturersSet) {
        this.souvenirSet = Set.copyOf(souvenirSet);
        this.manufacturersSet = Set.copyOf(manufacturersSet);
    }

    public Set<Souvenir> getSouvenirSet() {
        return souvenirSet;
    }

    public Set<Manufacturer> getManufacturersSet() {
        return manufacturersSet;
    }
}
