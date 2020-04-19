package ChainOfResponsibility.ChainOfResponsibility_Lesson.Officer;

import ChainOfResponsibility.ChainOfResponsibility_Lesson.Message;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sierżant kowalski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANG)
                && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        }else getSuperiorOfficer().processMessage(message);
    }
}
