package sealed;

public sealed interface TimeOfDay permits Morning, Afternoon, Evening {
    boolean early();
}

non-sealed class Morning implements TimeOfDay {
    public boolean early() { return true; }
}

non-sealed class Afternoon implements TimeOfDay {
    public boolean early() { return false; }
}

record Evening(int hour) implements TimeOfDay {
    public boolean early() { return false; }
}
