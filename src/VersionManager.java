import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class VersionManager {
    private  List<String> versions = new ArrayList<>();

    public VersionManager() {
        this.versions.add("0.0.1");
    }

    public VersionManager(String version) {
        String[] splitted = version.split("\\.");
        String[] result = new String[3];

        int indexMax = Math.min(splitted.length, 3);
        int indexMin  = splitted.length;

        for (int i = 0; i < indexMax; i++) {
            result[i] = Utils.isInt(splitted[i]) ? splitted[i] : "0";
        }

        for (int i = indexMin; i < 3; i++) {
            result[i] = "0";
        }

        this.versions.add(String.join(".", result));
    }

    public void rollback() {
        if (!this.versions.isEmpty()) {
            this.versions.removeLast();
        } else {
            System.out.println("Cannot rollback!");
        }
    }

    private void genericUpdate(int index) {
        String[] splitted = Utils.getSplited(this.versions.getLast());
        int newValue = (Integer.parseInt(splitted[index]) + 1);

        splitted[index] = Integer.toString(newValue);

        for (int i = index + 1; i < 3; i++) {
            splitted[i] = "0";
        }

        versions.add(String.join(".", splitted));
    }

    public void major() {
        genericUpdate(0);
    }

    public void minor() {
        genericUpdate(1);
    }
    public void patch() {
        genericUpdate(2);
    }

    public String getCurrentVersion() {
        if (!this.versions.isEmpty()) {
            return this.versions.getLast();
        }

        return "";
    }
}
