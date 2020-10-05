package com.company.collection;

import com.company.commands.AbstractCommands;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CollectionManager {
    private DragonCollection collection;
    private File file;
    private StringToObject stringToObject = new StringToObject();

    public CollectionManager(File file) {
        this.file = file;

    }

    public void callCommand() throws IOException, JAXBException, ClassNotFoundException {
        collection = new XmlParser().parseCollection(file);
        Scanner sc = new Scanner(System.in);
        String commands;
        System.out.println("vvedite comandy");
        while ((commands = sc.nextLine()) != "exit") {

            String result = stringToObject.getObjectCommand(commands).execute(collection);
            System.out.println(result);
        }
    }
}
