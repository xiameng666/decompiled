import j..util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class bgtt {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public Optional e;
    private final Random f;

    static {
        bgrz.a("RegGen");
    }

    public bgtt(Random random0, int v, int v1, String s, String s1) {
        this.e = Optional.empty();
        this.f = random0;
        this.a = v;
        this.b = v1;
        this.c = bgtt.b(s);
        this.d = bgtt.b(s1);
    }

    public final double a(double f) {
        return this.f.nextDouble() * f * ((double)(this.f.nextBoolean() ? 1 : -1));
    }

    private static List b(String s) {
        return bbqr.d(s) ? Collections.EMPTY_LIST : gfud.e(',').i().d().n(s);
    }
}

