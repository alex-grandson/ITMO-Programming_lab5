package com.company.basis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDate;


@XmlRootElement(name = "dragon")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dragon implements Comparable<com.company.basis.Dragon>, Serializable {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    @XmlJavaTypeAdapter(value = LocalDateSerializer.class)
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int age; //Значение поля должно быть больше 0
    private String description; //Поле может быть null
    private Float weight; //Значение поля должно быть больше 0, Поле может быть null
    private DragonType type; //Поле может быть null
   // private DragonHead head;

    public Dragon(){

    }
    public Dragon(String name, Coordinates coordinates,
                     int age, String description, Float weight, DragonType type) {
        this.id = (int) (Math.random() * 1000);
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDate.now();
       this.age = age;
       this.description = description;
       this.weight = weight;
       this.type = type;
      // this.head=head;
    }


    @Override
    public int compareTo(Dragon o) {
        return 0;
    }

    public String getName() {
        return name;
    }
}
