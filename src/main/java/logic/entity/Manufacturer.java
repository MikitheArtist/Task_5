package logic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {
    public String name;
    public String country;

    @Override
    public String toString() {
        return "Manufacturer: " +
                "name: " + name +
                ", country: " + country +" \n";
    }
}
