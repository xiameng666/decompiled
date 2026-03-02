import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gpml implements gpmi {
    public static final iakp b;
    public final gphl c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final ConcurrentLinkedQueue f;
    public final ConcurrentLinkedQueue g;

    static {
        gpml.b = new iakp("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", null);
    }

    public gpml(gphl gphl0) {
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new ConcurrentLinkedQueue();
        this.g = new ConcurrentLinkedQueue();
        this.c = gphl0;
    }
}

