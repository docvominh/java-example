package Interface;

public class Main {
    public static void main(String[] args) {

        IPerson human = new _Human();
        IPerson orc = new _Orc();
        IPerson devil = new _Devil();

        human.show();
        orc.show();
        devil.show();
    }
}
