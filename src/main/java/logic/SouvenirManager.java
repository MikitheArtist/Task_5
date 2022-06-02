package logic;

import logic.entity.Manufacturer;
import logic.entity.Souvenir;
import lombok.Data;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


@Data
public class SouvenirManager {
    private static Manufacturer manufacturer;
    private static Souvenir souvenir;

    private static Set<Souvenir> souvenirSet = new HashSet<>();
    private static Set<Manufacturer> manufacturersSet = new HashSet<>();



    public void addManufacturer(String name, String country) {
        manufacturer = new Manufacturer(name, country);

        manufacturersSet.add(manufacturer);
    }

    public void addSouvenir( String factoryName, String factoryCountry, String nameSouvenir, LocalDate date, int price) {
        souvenir = new Souvenir(new Manufacturer(factoryName, factoryCountry), nameSouvenir, date, price);

        souvenirSet.add(souvenir);
        manufacturersSet.add(new Manufacturer(factoryName, factoryCountry));
    }

    public void watchSouvenirs() {
        souvenirSet.forEach(System.out::println);
    }

    public void watchManufactures() {
        manufacturersSet.forEach(System.out::println);
    }

    public void searchSouvenirsByManufacturer(String plant) {
        souvenirSet.stream()
                .filter(souvenir1 -> souvenir1.getManufacturer().getName().equals(plant))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void searchSouvenirsByCountry(String country) {
        souvenirSet.stream()
                .filter(souvenir1 -> souvenir1.getManufacturer().getCountry().equals(country))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void searchManufacturerByPrice(int num)  {
        souvenirSet.stream()
                .filter(souvenir1 -> souvenir1.getPrice() < num)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void getSouvenirsAndManufacturers()  {
        Map<Manufacturer, List<Souvenir>> collect = souvenirSet.stream()
                .collect(Collectors.groupingBy(Souvenir::getManufacturer));

        for(Map.Entry<Manufacturer, List<Souvenir>> item : collect.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    public void getManufacturersByYears(String souvenirName, LocalDate date)  {
        souvenirSet.stream()
                .filter(souvenir1 -> (souvenir1.getName().equals(souvenirName)) && (souvenir1.getDate().equals(date)))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void getSouvenirsByYear() {
        Map<LocalDate, List<Souvenir>> collect = souvenirSet.stream()
                .collect(Collectors.groupingBy(Souvenir::getDate));

        for(Map.Entry<LocalDate, List<Souvenir>> item : collect.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }

    public void removeManufacturer(String plant)  {
        souvenirSet.removeIf(souvenir1 -> souvenir1.getManufacturer().getName().equals(plant));
    }

    public void load(Save save){
        souvenirSet = Set.copyOf(save.getSouvenirSet());
        manufacturersSet = Set.copyOf(save.getManufacturersSet());
    }

    public Save save(){
        return new Save(souvenirSet, manufacturersSet);
    }

    @Override
    public String toString() {
        return "SouvenirManager{" +
                "souvenirSet=" + souvenirSet +
                ", manufacturersSet=" + manufacturersSet +
                '}';
    }
}
