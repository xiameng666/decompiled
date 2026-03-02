import android.content.Context;
import android.os.Looper;

public final class ehxh extends ehww {
    public final lqh a;
    public boolean b;
    public final clht c;
    public gfsx d;
    public static final int e;
    private static final bboh f;
    private final ehwj g;
    private boolean h;

    static {
        ehxh.f = eicd.a("FD");
    }

    public ehxh(Context context0, String s, int v) {
        this.h = false;
        this.c = new clht(Looper.getMainLooper());
        this.d = gfqx.a;
        ((ggtj)ehxh.f.h()).x("Using V2 ProximityUiViewModel");
        this.g = new ehwj(context0, s, v, ehwo.b(), new ehxi(context0));
        ehws ehws0 = new ehws(null);
        ehws0.b(ehwt.a);
        this.a = new lqh(ehws0.a());
    }

    @Override  // ehww
    public final lqd a() {
        if(!this.h) {
            ehxe ehxe0 = new ehxe(this);
            this.a.o(this.g.a, ehxe0);
            this.h = true;
        }
        return this.a;
    }

    @Override  // ehww
    public final void b() {
        this.g.b();
    }

    @Override  // ehww
    public final void c() {
        this.g.a();
    }

    public final ehwt e() {
        lqh lqh0 = this.a;
        if(lqh0.ij() != null) {
            ehwv ehwv0 = (ehwv)lqh0.ij();
            gftb.check(ehwv0);
            return ehwv0.a;
        }
        return ehwt.a;
    }

    public final void f() {
        ehxf ehxf0 = new ehxf(this);
        long v = hxjr.a.b().d();
        this.c.postDelayed(ehxf0, v);
        this.b = true;
    }

    public final void g() {
        ehxd ehxd0 = new ehxd(this);
        long v = hxjr.a.b().e();
        this.c.postDelayed(ehxd0, v);
        this.b = true;
    }
}

