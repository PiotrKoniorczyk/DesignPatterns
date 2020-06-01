package Visitor.Visitor_Practice.transport;

import Visitor.Visitor_Practice.visitor.TransportVisitor;

public interface Transportable {
    void accept(TransportVisitor transportVisitor);
}
