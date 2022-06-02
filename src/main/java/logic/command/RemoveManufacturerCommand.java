package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class RemoveManufacturerCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleBinder.writeMessage("enter the name of the factory to be deleted: ");
        String plant = ConsoleBinder.readString();

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.removeManufacturer(plant);

        ConsoleBinder.writeMessage("Data removed.");
    }
}
