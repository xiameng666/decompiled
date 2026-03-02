import java.util.Map;

public final class atwm implements Runnable {
    public final atxp a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;

    public atwm(atxp atxp0, int v, String s, Map map0, String s1) {
        this.a = atxp0;
        this.e = v;
        this.b = s;
        this.c = map0;
        this.d = s1;
    }

    @Override
    public final void run() {
        this.a.c.b(this.e, this.b, this.c, gkey.bJ, 1, this.d, 1, "");
    }
}

