import android.os.SystemClock;
import j..util.Objects;
import java.util.ArrayList;

public final class fuvm extends fuvo {
    public int a;
    public int b;
    public boolean c;
    final fuvs d;

    public fuvm(fuvs fuvs0, boolean z) {
        Objects.requireNonNull(fuvs0);
        this.d = fuvs0;
        super(fuvs0);
        this.a = 0;
        this.b = 0;
        this.c = z;
    }

    @Override  // fuvo
    public final String a() {
        return "MaybeLeavingVehicleState";
    }

    @Override  // fuvo
    protected final void c() {
        this.d.c.g(0L, false);
        ArrayList arrayList0 = new ArrayList(this.d.c.v);
        arrayList0.add(this);
        this.d.c.v = arrayList0;
        long v = SystemClock.elapsedRealtime() + 90000L;
        this.d.b(v);
    }

    @Override  // fuvo
    protected final void d(fuvo fuvo0) {
        super.d(fuvo0);
        this.d.c.r(0L);
        ArrayList arrayList0 = new ArrayList(this.d.c.v);
        arrayList0.remove(this);
        this.d.c.v = arrayList0;
    }

    @Override  // fuvo
    protected final void e() {
        this.c = true;
    }

    @Override  // fuvo
    protected final void f() {
        fuvl fuvl0 = new fuvl(this.d);
        this.d.a(fuvl0);
    }
}

