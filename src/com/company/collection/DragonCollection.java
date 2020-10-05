package com.company.collection;

import com.company.basis.Dragon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

import java.util.ArrayDeque;

@XmlRootElement(name = "dragons")
@XmlAccessorType(XmlAccessType.FIELD)
public class DragonCollection {


    @XmlElement(name = "dragon")
    private ArrayDeque<Dragon> dragons;
    private Date date;

    public DragonCollection(ArrayDeque<Dragon> dragons) {
        this.dragons = dragons;
        this.date = new Date();
    }



    public ArrayDeque<Dragon> getDragons() {
        return dragons;
    }


    public DragonCollection() {

    }

    @Override
    public String toString() {
        return "Тип коллекции: " + this.getDragons().getClass() +
                "\nДата инициализации: " + date +
                "\nКоличество элементов: " + this.getDragons().size();
    }


    public void setDate(Date date) {
        this.date = date;
    }


}
