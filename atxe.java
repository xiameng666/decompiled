import java.util.List;

public final class atxe implements Runnable {
    public final atxp a;
    public final List b;

    public atxe(atxp atxp0, List list0) {
        this.a = atxp0;
        this.b = list0;
    }

    @Override
    public final void run() {
        this.a.s.a(this.b);
    }
}

