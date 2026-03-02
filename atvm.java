import java.util.Map;

public final class atvm implements Runnable {
    public final atxp a;
    public final String b;
    public final Map c;

    public atvm(atxp atxp0, String s, Map map0) {
        this.a = atxp0;
        this.b = s;
        this.c = map0;
    }

    @Override
    public final void run() {
        this.a.c.c(this.b, this.c, gkey.bK, 3);
    }
}

