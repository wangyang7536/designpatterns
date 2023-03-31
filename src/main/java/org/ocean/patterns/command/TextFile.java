package org.ocean.patterns.command;

import java.io.File;
import java.io.IOException;

/**
 * Author: ocean
 * Date: 3/29/23 8:27 PM
 */

public class TextFile {
    private String name;
    private File file = null;

    public TextFile(File file, String name) {
        this.file = file;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public File getFile() {
        return this.file;
    }

    public String open() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

}
