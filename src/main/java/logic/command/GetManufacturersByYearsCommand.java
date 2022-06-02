package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

import java.time.LocalDate;

public class GetManufacturersByYearsCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("Enter the name of the souvenir: ");
        String souvenir = ConsoleBinder.readString();

        ConsoleBinder.writeMessage("Enter year of manufacture: ");
        int year = ConsoleBinder.readInt();
        ConsoleBinder.writeMessage("Enter number of month: ");
        int month = ConsoleBinder.readInt();
        ConsoleBinder.writeMessage("Enter day of manufacture: ");
        int day = ConsoleBinder.readInt();

        LocalDate date = LocalDate.of(year, month, day);

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.getManufacturersByYears(souvenir, date);
    }
}
