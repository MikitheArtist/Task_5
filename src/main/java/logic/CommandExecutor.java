package logic;

import logic.command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operations, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operations.ADD_SOUVENIR, new AddSouvenirCommand());
        allKnownCommandsMap.put(Operations.ADD_MANUFACTURER, new AddManufacturerCommand());
        allKnownCommandsMap.put(Operations.WATCH_SOUVENIRS, new WatchSouvenirsCommand());
        allKnownCommandsMap.put(Operations.WATCH_MANUFACTURERS, new WatchManufacturersCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_SOUVENIRS_BY_MANUFACTURER, new SearchSouvenirsByManufacturerCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_SOUVENIRS_BY_COUNTRY, new SearchSouvenirsByCountryCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_MANUFACTURERS_BY_PRICE, new SearchManufacturerByPriceCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_MANUFACTURERS_WITH_THEY_SOUVENIRS, new GetSouvenirsAndManufacturersCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_MANUFACTURERS_BY_SOUVENIR_AND_YEAR, new GetManufacturersByYearsCommand());
        allKnownCommandsMap.put(Operations.DISPLAY_SOUVENIRS_BY_YEAR, new GetSouvenirsByYearCommand());
        allKnownCommandsMap.put(Operations.SAVE, new SaveCommand());
        allKnownCommandsMap.put(Operations.LOAD, new LoadCommand());
        allKnownCommandsMap.put(Operations.REMOVE, new RemoveManufacturerCommand());
        allKnownCommandsMap.put(Operations.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    public static void execute(Operations operation) throws Exception {
        allKnownCommandsMap.get(operation).execute();
    }
}
