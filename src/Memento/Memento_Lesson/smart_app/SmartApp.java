package Memento.Memento_Lesson.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartApp {
    private double version;
    private List<Double> versionList = new ArrayList<>();

    public void setVersion(double version) {
        this.version = version;
    }

    public List<Double> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<Double> versionList) {
        this.versionList = versionList;
    }

    @Override
    public String toString() {
        return "SmartApp{" +
                "version=" + version +
                '}';
    }
}
