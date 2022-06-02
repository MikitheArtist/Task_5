package logic.command;
import logic.ConsoleBinder;
import logic.SouvenirManager;

public class LoadCommand implements Command{

    @Override
    public void execute() throws Exception {

        SouvenirManager souvenirManager = new SouvenirManager();
        souvenirManager.load(file.getSave());
        ConsoleBinder.writeMessage("Data loaded.");

    }
}
