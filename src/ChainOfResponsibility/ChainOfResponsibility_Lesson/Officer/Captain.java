package ChainOfResponsibility.ChainOfResponsibility_Lesson.Officer;

import ChainOfResponsibility.ChainOfResponsibility_Lesson.Message;

public class Captain extends Officer{
    private final int CODE = 20;
    private final String NAME = "Kapitan Borewicz";


    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                && message.getCode() == CODE){
            System.out.println(NAME +" otrzymał wiadomość: " + message.getContent());
        }else getSuperiorOfficer().processMessage(message);
        }

    }

