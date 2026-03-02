import java.util.concurrent.atomic.AtomicBoolean;

final class arlx {
    public static final aqql a;
    public final armp b;
    public final armj c;
    public final AtomicBoolean d;
    public final aqqn e;
    public arkq f;
    public final arlw g;

    static {
        arlx.a = new aqql(new String[]{"UsbReceiver"});
    }

    public arlx(armp armp0, armj armj0, gmcg gmcg0, aqqn aqqn0) {
        this.d = new AtomicBoolean(true);
        this.f = null;
        this.b = armp0;
        this.c = armj0;
        this.g = new arlw(this, gmcg0);
        this.e = aqqn0;
    }

    public final void a() {
        this.d.set(false);
    }

    public final void b() {
        batl.l(this.f == null);
        this.f = this.b.a.a(hkyj.b);
    }

    public final void c(int v) {
        this.f.a(v);
        this.f = null;
    }
}

