package logic;

import java.io.IOException;

public class App {

    public static void main(String[] args) {

        Operations operation = null;
        do{
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } while (operation != Operations.EXIT);

    }

    private static Operations askOperation() throws IOException {
        ConsoleBinder.writeMessage("");
        ConsoleBinder.writeMessage("Choose an operation: ");
        ConsoleBinder.writeMessage(String.format("\t %d - add a manufacturer", Operations.ADD_MANUFACTURER.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - add a souvenir", Operations.ADD_SOUVENIR.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - watch all manufacturers", Operations.WATCH_MANUFACTURERS.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - watch all souvenirs", Operations.WATCH_SOUVENIRS.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - display information about souvenirs of a given manufacturer", Operations.DISPLAY_SOUVENIRS_BY_MANUFACTURER.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - display information about souvenirs produced in a given country", Operations.DISPLAY_SOUVENIRS_BY_COUNTRY.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - display information about manufacturers whose prices for souvenirs are less than the given one", Operations.DISPLAY_MANUFACTURERS_BY_PRICE.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - for each manufacturer, display information about all the souvenirs that he produces", Operations.DISPLAY_MANUFACTURERS_WITH_THEY_SOUVENIRS.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - display information about the manufacturers of the given souvenir produced in the given year", Operations.DISPLAY_MANUFACTURERS_BY_SOUVENIR_AND_YEAR.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - for each year, display a list of souvenirs produced in that year", Operations.DISPLAY_SOUVENIRS_BY_YEAR.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - save stage", Operations.SAVE.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - load stage", Operations.LOAD.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - delete the specified manufacturer and its souvenirs", Operations.REMOVE.ordinal()));
        ConsoleBinder.writeMessage(String.format("\t %d - exit", Operations.EXIT.ordinal()));

        return Operations.values()[ConsoleBinder.readInt()];
    }
}
