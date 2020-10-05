package com.company.collection;

import com.company.basis.Dragon;
import com.sun.corba.se.impl.activation.CommandHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class XmlParser {

    private DragonCollection dragonCollection;

    public DragonCollection parseCollection(File file) throws IOException, JAXBException {


    /*    FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //обрабатываем считанную строку - пишем ее в консоль
            System.out.println(line);
        }

        StringBuffer data = new StringBuffer();
        while (br.readLine()!=null)
            data.append(br.readLine());*/


        Scanner in = new Scanner(file);
        StringBuffer data = new StringBuffer();
        while (in.hasNext())
            data.append(in.nextLine());
        JAXBContext context1 = JAXBContext.newInstance(DragonCollection.class);
        Unmarshaller jaxbUnmarshaller = context1.createUnmarshaller();
        DragonCollection dragonCollection = (DragonCollection) jaxbUnmarshaller.unmarshal(file);

// обработка ошиьбокр тевошдмтлогритвпл доделать
        // проверка на налллабл
        dragonCollection.setDate(new Date());
        this.dragonCollection = dragonCollection;
        return dragonCollection;

    }


}
