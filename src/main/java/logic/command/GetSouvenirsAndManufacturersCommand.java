package logic.command;

import logic.SouvenirManager;

public class GetSouvenirsAndManufacturersCommand implements Command {
    @Override
    public void execute() throws Exception {

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.getSouvenirsAndManufacturers();
    }
}
