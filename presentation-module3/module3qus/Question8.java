package module3qus;

public class Question8 {

    static sealed class Phone permits IPhone, Android {
    }

    final class IPhone extends Phone {
    }

    final class Android extends Phone {
    }
}
