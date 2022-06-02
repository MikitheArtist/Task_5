package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class AddManufacturerCommand implements Command{
    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("Let's add a manufacturer.");

        ConsoleBinder.writeMessage("Enter the manufacturer of your souvenir: ");
        String plantName = ConsoleBinder.readString();

        ConsoleBinder.writeMessage("Enter country of manufacture: ");
        String country = ConsoleBinder.readString();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.addManufacturer(plantName, country);

        ConsoleBinder.writeMessage("The manufacturer created.");
    }
}
