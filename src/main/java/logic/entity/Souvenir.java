package logic.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Souvenir {
    private Manufacturer manufacturer;
    private String name;
    private LocalDate date;
    private double price;


    @Override
    public String toString() {
        return "Souvenir{" +
                "manufacturer=" + manufacturer +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
