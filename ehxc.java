import android.os.Looper;

public final class ehxc extends ehww {
    public final lqh a;
    public boolean b;
    public final clht c;
    public gfsx d;
    public static final int e;
    private static final bboh f;
    private final ehwj g;
    private boolean h;

    static {
        ehxc.f = eicd.a("FD");
    }

    public ehxc(ehwj ehwj0) {
        this.h = false;
        this.c = new clht(Looper.getMainLooper());
        this.d = gfqx.a;
        ((ggtj)ehxc.f.h()).x("Using V1 ProximityUiViewModel");
        this.g = ehwj0;
        ehws ehws0 = new ehws(null);
        ehws0.b(ehwt.a);
        this.a = new lqh(ehws0.a());
    }

    @Override  // ehww
    public final lqd a() {
        if(!this.h) {
            ehxb ehxb0 = new ehxb(this);
            this.a.o(this.g.a, ehxb0);
            this.h = true;
        }
        return this.a;
    }

    @Override  // ehww
    public final void b() {
    }

    @Override  // ehww
    public final void c() {
    }

    public static float e(double f) {
        return ((float)Math.round(((float)f) * 10.0f)) / 10.0f;
    }
}

