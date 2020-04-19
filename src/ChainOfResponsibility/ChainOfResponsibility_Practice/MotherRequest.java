package ChainOfResponsibility.ChainOfResponsibility_Practice;

public class MotherRequest {
    private Shelf Shelf;

    public MotherRequest(Shelf shelf) {
        Shelf = shelf;
    }

    public Shelf getShelf() {
        return Shelf;
    }
}
