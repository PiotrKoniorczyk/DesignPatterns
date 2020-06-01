package Visitor.Visitor_Practice.visitor;

import Visitor.Visitor_Practice.transport.Animal;
import Visitor.Visitor_Practice.transport.Person;
import Visitor.Visitor_Practice.transport.Shipment;

public class NameTransportVisitor implements  TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Animal kind: " + animal.getKind());

    }

    @Override
    public void visit(Person person) {
        System.out.println("Person name: " + person.getFristName() + " " + person.getLastName());


    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Shipment designation: " + shipment.getPrefix() + "-" + shipment.getSerialNumber());


    }
}
