package org.ocean.patterns.command;

import java.io.File;

public class OpenFileCommand implements Command{
    private TextFile textFile;

    public OpenFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        return textFile.open();
    }
}
