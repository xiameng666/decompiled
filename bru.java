import java.util.Map;

public final class bru implements Runnable {
    public final bsb a;
    public final bat b;
    public final Map c;
    public final jqt d;

    public bru(bsb bsb0, bat bat0, Map map0, jqt jqt0) {
        this.a = bsb0;
        this.b = bat0;
        this.c = map0;
        this.d = jqt0;
    }

    @Override
    public final void run() {
        jqt jqt0;
        try {
            jqt0 = this.d;
            this.a.a.a(this.b, this.c);
            jqt0.b(null);
        }
        catch(RuntimeException runtimeException0) {
            jqt0.c(runtimeException0);
        }
    }
}

