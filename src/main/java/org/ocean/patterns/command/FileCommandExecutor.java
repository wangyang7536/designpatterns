package org.ocean.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class FileCommandExecutor {

    private final List<Command> commandList = new ArrayList<>();

    public String executeCommand(Command command) {
        commandList.add(command);
        return command.execute();
    }
}
