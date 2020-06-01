package Visitor.Visitor_Practice;

import Visitor.Visitor_Practice.transport.Animal;
import Visitor.Visitor_Practice.transport.Person;
import Visitor.Visitor_Practice.transport.Shipment;
import Visitor.Visitor_Practice.transport.Transportable;
import Visitor.Visitor_Practice.visitor.NameTransportVisitor;
import Visitor.Visitor_Practice.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();


        transportableList.forEach((transportable -> transportable.accept(priceTransportVisitor)));
        System.out.println("-----------------");
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));



    }
}
