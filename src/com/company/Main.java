package com.company;

import com.company.collection.CollectionManager;
import com.company.collection.XmlParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static final String file = "C:\\Users\\Vasilisa\\Desktop\\Laba_5_lesha\\file.xml";

    public static void main(String[] args) throws JAXBException, IOException, ClassNotFoundException {


        File f = new File(file);

        CollectionManager app = new CollectionManager(f);
        app.callCommand();


    }


}
