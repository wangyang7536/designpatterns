package org.ocean.patterns.command;

/**
 * Author: ocean
 * Date: 3/29/23 8:13 PM
 */

public class SaveFileCommand implements Command {
    private TextFile textFile;

    public SaveFileCommand(TextFile textFile) {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        return textFile.save();
    }
}
