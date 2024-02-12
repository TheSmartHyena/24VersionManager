//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // VersionManager a = new VersionManager();
        VersionManager b = new VersionManager("3.2.3");
        //b.major();
        //b.minor();
        b.patch();
        b.patch();

        System.out.println(b.getCurrentVersion());

        b.rollback();
        b.rollback();
        b.rollback();
        b.rollback();

        System.out.println(b.getCurrentVersion());


    }
}