package Facade.Facade_Lesson.deliveryBox;

public class DeliveryBoxFacade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        deliveryBox = new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickUpPackage() {


        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPayemntSecured()) {
            deliveryBox.openBox();
        }


    }
}
