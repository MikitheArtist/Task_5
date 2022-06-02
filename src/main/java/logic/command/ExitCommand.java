package logic.command;

import logic.ConsoleBinder;

public class ExitCommand implements Command{
    @Override
    public void execute() throws Exception {

        ConsoleBinder.writeMessage("See you!!!");
    }
}
