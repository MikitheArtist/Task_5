package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class SearchSouvenirsByManufacturerCommand implements Command{
    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("Enter the manufacturer of your souvenir: ");
        String plant = ConsoleBinder.readString();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.searchSouvenirsByManufacturer(plant);
    }
}
