package logic.command;

import logic.ConsoleBinder;
import logic.SouvenirManager;

public class GetSouvenirsByYearCommand implements Command{
    @Override
    public void execute() throws Exception {

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.getSouvenirsByYear();
    }
}
