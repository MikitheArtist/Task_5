package logic.command;

import logic.SouvenirManager;

public class WatchManufacturersCommand implements Command{
    @Override
    public void execute(){
        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.watchManufactures();
    }
}
