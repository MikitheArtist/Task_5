package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class SearchSouvenirsByCountryCommand implements Command{
    @Override
    public void execute() throws Exception {

        ConsoleBinder.writeMessage("Enter the country of the manufacturer: ");
        String plantCountry = ConsoleBinder.readString();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.searchSouvenirsByCountry(plantCountry);

    }
}
