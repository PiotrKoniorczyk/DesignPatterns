package Facade.Facade_Lesson.deliveryBox;

class DeliveryBoxSystem {

    void sendNotification() {
        System.out.println("Text message to client");
    }

    boolean isPayemntSecured(){
        System.out.println("Payment has been secured");
        return true;
    }

    boolean isUserDataValidated(){
        System.out.println("User datahas been validated");
        return true;
    }

    void scheduleDelivery(){
        System.out.println("Delivery has been scheduled");
    }

}
