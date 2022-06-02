package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class SearchManufacturerByPriceCommand implements Command{
    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("Enter the limit of price: ");
        int price = ConsoleBinder.readInt();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.searchManufacturerByPrice(price);
    }
}
