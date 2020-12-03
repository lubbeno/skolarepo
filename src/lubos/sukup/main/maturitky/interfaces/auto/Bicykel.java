package lubos.sukup.main.maturitky.interfaces.auto;

public class Bicykel implements Motor {


    @Override
    public void startuje() {
        System.out.println("clovicek slape do pedalu a funi");
    }

    @Override
    public void radenie() {
        System.out.println("bicykel ma 18 rychlosti");
    }
}
