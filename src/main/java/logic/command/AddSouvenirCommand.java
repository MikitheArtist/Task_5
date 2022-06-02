package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

import java.time.LocalDate;

public class AddSouvenirCommand implements Command{

    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("So, add a souvenir.");

        ConsoleBinder.writeMessage("Enter the manufacturer of your souvenir: ");
        String plant = ConsoleBinder.readString();

        ConsoleBinder.writeMessage("Enter country of manufacture: ");
        String country = ConsoleBinder.readString();

        ConsoleBinder.writeMessage("Enter the name of the souvenir: ");
        String souvenir = ConsoleBinder.readString();

        ConsoleBinder.writeMessage("Enter year of manufacture: ");
        int year = ConsoleBinder.readInt();
        ConsoleBinder.writeMessage("Enter number of month: ");
        int month = ConsoleBinder.readInt();
        ConsoleBinder.writeMessage("Enter day of manufacture: ");
        int day = ConsoleBinder.readInt();

        LocalDate date = LocalDate.of(year, month, day);

        ConsoleBinder.writeMessage("Enter the price of the item: ");
        int price = ConsoleBinder.readInt();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.addSouvenir(plant, country, souvenir, date, price );

        ConsoleBinder.writeMessage("The souvenir created.");

    }
}
