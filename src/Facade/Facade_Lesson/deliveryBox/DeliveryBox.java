package Facade.Facade_Lesson.deliveryBox;

class DeliveryBox {

    boolean isDeliveryBoxFull(){
        System.out.println("Delivery box is not full");
        return false;
    }

    boolean isDeliveryBoxIsBroken(){
        System.out.println("Delivery box is not broken");
        return false;
    }

    void getUserData(){
        System.out.println("User data entered.");
    }

    void openBox(){
        System.out.println("Box opened");
    }
}
