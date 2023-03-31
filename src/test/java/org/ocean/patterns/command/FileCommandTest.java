package org.ocean.patterns.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

/**
 * Author: ocean
 * Date: 3/29/23 8:40 PM
 */

public class FileCommandTest {
    @Test
    public void test() {
        File file1 = new File("/Users/ocean/Workspace/design_patterns/DesignPatterns/src/test/resources" +
                "/CommandPatternTest/command_test_file1.txt");
        String fileName1 = "command_test_file1.txt";
        FileCommandExecutor fileCommandExecutor = new FileCommandExecutor();
        TextFile textFile = new TextFile(file1, fileName1);
        OpenFileCommand openFileCommand = new OpenFileCommand(textFile);
        fileCommandExecutor.executeCommand(openFileCommand);
        assertEquals(textFile.getFile().exists(), true);
    }
}
