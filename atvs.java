import java.util.List;

public final class atvs implements Runnable {
    public final atxp a;
    public final List b;
    public final Long c;

    public atvs(atxp atxp0, List list0, Long long0) {
        this.a = atxp0;
        this.b = list0;
        this.c = long0;
    }

    @Override
    public final void run() {
        this.a.i.e(this.b, this.c);
    }
}

