package com.company.commands;

import com.company.collection.DragonCollection;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Help extends AbstractCommands {

    @Override
    public String execute(DragonCollection dragonCollection) throws JAXBException, IOException, ClassNotFoundException {
        return dragonCollection.toString();
    }
}
