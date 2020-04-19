package ChainOfResponsibility.ChainOfResponsibility_Lesson.Officer;

import ChainOfResponsibility.ChainOfResponsibility_Lesson.Message;

public abstract class Officer {

    private Officer superiorOfficer;
    public abstract void processMessage(Message message);

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }
}
