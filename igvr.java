import java.util.Locale;

public final class igvr {
    public int a;
    public int b;
    public int c;
    private final int d;
    private final int e;

    public igvr(int v, int v1) {
        this.d = v;
        this.e = v1;
    }

    static String a(igvx igvx0) {
        return igvx0.getClass().getName() + " = <" + igvx0.toString() + ">";
    }

    @Override
    public final String toString() {
        return String.format(Locale.UK, "  Start:(%1$d,%2$d)", ((int)this.d), ((int)this.e)) + String.format(Locale.UK, "  End:(%1$d,%2$d)", ((int)this.a), ((int)this.b)) + String.format(Locale.UK, "  Bits:%1$d", ((int)this.c));
    }
}

