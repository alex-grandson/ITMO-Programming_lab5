package com.company.collection;

import com.company.commands.AbstractCommands;
import com.company.commands.Help;
import com.company.commands.Info;
import com.company.commands.Show;

import java.io.IOException;

public class StringToObject {

    public AbstractCommands getObjectCommand(String command) throws IOException {
        String[] rightCommand = command.split(" ", 2);
        AbstractCommands objectCommands = null;

        switch (rightCommand[0]) {
            case "help":
                objectCommands = new Help();
                break;
            case "info":
                objectCommands = new Info();
                break;
            case "show":
                objectCommands = new Show();
                break;
        }
        return objectCommands;

    }
}
