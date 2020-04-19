package ChainOfResponsibility.ChainOfResponsibility_Lesson;

import ChainOfResponsibility.ChainOfResponsibility_Lesson.Officer.*;

public class Main {
    public static void main(String[] args) {

        Message message = new Message("Atakować", 10, OfficerRank.SERGEANG);

        Officer sergant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergant.processMessage(message);



    }
}
