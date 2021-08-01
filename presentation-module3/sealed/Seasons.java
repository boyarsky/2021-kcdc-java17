package sealed;

public abstract sealed class Seasons permits sealed.Fall, Spring, Summer, Winter { }

final class Fall extends Seasons {}
final class Spring extends Seasons {}
final class Summer extends Seasons {}
final class Winter extends Seasons {}