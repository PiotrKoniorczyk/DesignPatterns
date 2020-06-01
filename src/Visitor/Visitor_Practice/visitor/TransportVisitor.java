package Visitor.Visitor_Practice.visitor;

import Visitor.Visitor_Practice.transport.Animal;
import Visitor.Visitor_Practice.transport.Person;
import Visitor.Visitor_Practice.transport.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
