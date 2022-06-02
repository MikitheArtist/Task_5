package logic.command;

import logic.SaveFile;

public interface Command {
    SaveFile file = new SaveFile();
    void execute() throws Exception;
}
