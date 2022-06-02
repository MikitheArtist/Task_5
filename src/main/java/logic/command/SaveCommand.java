package logic.command;
import logic.ConsoleBinder;
import logic.SouvenirManager;

public class SaveCommand implements Command{

    @Override
    public void execute() throws Exception {

        SouvenirManager souvenirManager = new SouvenirManager();
        file.setSave(souvenirManager.save());
        ConsoleBinder.writeMessage("Data saved.");
    }
}
