package ChainOfResponsibility.ChainOfResponsibility_Practice;

public class MotherRequest {
    private Shelf Shelf;

    public MotherRequest(ChainOfResponsibility.ChainOfResponsibility_Practice.Shelf shelf) {
        Shelf = shelf;
    }

    public ChainOfResponsibility.ChainOfResponsibility_Practice.Shelf getShelf() {
        return Shelf;
    }
}
