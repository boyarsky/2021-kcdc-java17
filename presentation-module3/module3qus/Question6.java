package module3qus;

public class Question6 {

    static sealed interface Weather permits Wet, Dry{
        boolean needUmbrella();
    }
    static non-sealed class Wet implements Weather {
        public boolean needUmbrella() { return true; }
    }
    static record Dry(boolean needUmbrella) implements Weather {
    }

    public static void main(String[] args) {
        Weather weather = new Dry(false);
        System.out.println(weather.needUmbrella());
    }
}
