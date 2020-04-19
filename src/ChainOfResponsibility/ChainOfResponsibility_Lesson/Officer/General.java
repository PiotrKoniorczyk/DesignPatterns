package ChainOfResponsibility.ChainOfResponsibility_Lesson.Officer;

import ChainOfResponsibility.ChainOfResponsibility_Lesson.Message;

public class General extends Officer{
    private final int CODE = 30;
    private final String NAME = "Generał Mazowiecki";



    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE){
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        }else {
            System.out.println("Zły adresat wiadomośći lub zły kod szyfrujący");
        }

    }
}
