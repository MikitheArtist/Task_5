package logic.command;

import logic.SouvenirManager;

public class WatchSouvenirsCommand implements Command{
    @Override
    public void execute() {
        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.watchSouvenirs();
    }
}
