import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class qop implements qok {
    public final gui a;
    private final gra b;
    private final gra c;
    private final gui d;
    private final icbr e;

    public qop() {
        this.e = new icbr();
        this.b = new ParcelableSnapshotMutableState(null, gul.a);
        this.c = new ParcelableSnapshotMutableState(null, gul.a);
        new gpx(new qol(this), null);
        this.d = new gpx(new qom(this), null);
        new gpx(new qon(this), null);
        this.a = new gpx(new qoo(this), null);
    }

    @Override  // gui
    public final Object a() {
        return this.b();
    }

    @Override  // qok
    public final qkb b() {
        return (qkb)this.b.a();
    }

    @Override  // qok
    public final boolean c() {
        return ((Boolean)this.d.a()).booleanValue();
    }

    public final Throwable d() {
        return (Throwable)this.c.a();
    }

    public final void e(qkb qkb0) {
        synchronized(this) {
            ibuq.f(qkb0, "composition");
            if(this.c()) {
                return;
            }
            this.b.b(qkb0);
            this.e.V(qkb0);
        }
    }

    public final void f(Throwable throwable0) {
        synchronized(this) {
            if(this.c()) {
                return;
            }
            this.c.b(throwable0);
            this.e.d(throwable0);
        }
    }
}

