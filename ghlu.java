import java.util.concurrent.TimeUnit;

public final class ghlu extends gmbf {
    final String a;

    public ghlu(gmcd gmcd0, String s) {
        this.a = s;
        super(gmcd0);
    }

    @Override  // gmbe
    public final Object get() {
        return ghma.a(this.b, this.a);
    }

    @Override  // gmbe
    public final Object get(long v, TimeUnit timeUnit0) {
        return ghma.b(this.b, v, timeUnit0, this.a);
    }

    @Override  // ggcs
    public final String toString() {
        return this.a;
    }
}

