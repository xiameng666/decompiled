import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class qnu implements gui {
    public final gra a;
    public final gra b;
    public final gra c;
    public final gra d;
    public final gra e;
    public final cup f;
    private final gra g;
    private final gra h;
    private final gui i;
    private final gra j;
    private final gra k;
    private final gra l;
    private final gra m;
    private final gui n;

    public qnu() {
        Boolean boolean0 = Boolean.valueOf(false);
        this.g = new ParcelableSnapshotMutableState(boolean0, gul.a);
        Integer integer0 = (int)1;
        this.h = new ParcelableSnapshotMutableState(integer0, gul.a);
        this.a = new ParcelableSnapshotMutableState(integer0, gul.a);
        this.b = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.c = new ParcelableSnapshotMutableState(null, gul.a);
        this.d = new ParcelableSnapshotMutableState(((float)1.0f), gul.a);
        this.e = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.i = new gpx(new qno(this), null);
        this.j = new ParcelableSnapshotMutableState(null, gul.a);
        Float float0 = (float)0.0f;
        this.k = new ParcelableSnapshotMutableState(float0, gul.a);
        this.l = new ParcelableSnapshotMutableState(float0, gul.a);
        this.m = new ParcelableSnapshotMutableState(((long)0x8000000000000000L), gul.a);
        this.n = new gpx(new qnp(this), null);
        new gpx(new qnq(this), null);
        this.f = new cup();
    }

    @Override  // gui
    public final Object a() {
        return this.c();
    }

    public final float b() {
        return ((Number)this.n.a()).floatValue();
    }

    public final float c() {
        return ((Number)this.l.a()).floatValue();
    }

    public final float d() {
        return ((Number)this.d.a()).floatValue();
    }

    public final int e() {
        return ((Number)this.h.a()).intValue();
    }

    public final int f() {
        return ((Number)this.a.a()).intValue();
    }

    public final long g() {
        return ((Number)this.m.a()).longValue();
    }

    public final qkb h() {
        return (qkb)this.j.a();
    }

    public final qoj i() {
        return (qoj)this.c.a();
    }

    public final void j(qkb qkb0) {
        this.j.b(qkb0);
    }

    public final void k(int v) {
        this.h.b(Integer.valueOf(v));
    }

    public final void l(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final void m(float f) {
        this.k.b(Float.valueOf(f));
        if(((Boolean)this.e.a()).booleanValue()) {
            qkb qkb0 = this.h();
            if(qkb0 != null) {
                f -= f % (1.0f / qkb0.m);
            }
        }
        this.l.b(Float.valueOf(f));
    }

    public final boolean n() {
        return ((Boolean)this.b.a()).booleanValue();
    }

    public final boolean o(int v, long v1) {
        qkb qkb0 = this.h();
        if(qkb0 != null) {
            long v2 = this.g() == 0x8000000000000000L ? 0L : v1 - this.g();
            this.s(v1);
            qoj qoj0 = this.i();
            float f = qoj0 == null ? 0.0f : qoj0.b(qkb0);
            qoj qoj1 = this.i();
            float f1 = qoj1 == null ? 1.0f : qoj1.a(qkb0);
            float f2 = ((float)(v2 / 1000000L)) / qkb0.a() * this.q();
            float f3 = this.q() < 0.0f ? f - (this.r() + f2) : this.r() + f2 - f1;
            if((f3 < 0.0f)) {
                this.m(ibwt.f(this.r(), f, f1) + f2);
                return true;
            }
            float f4 = f1 - f;
            int v3 = (int)(f3 / f4);
            if(this.e() + (v3 + 1) > v) {
                this.m(this.b());
                this.k(v);
                return false;
            }
            this.k(this.e() + (v3 + 1));
            float f5 = f3 - ((float)v3) * f4;
            this.m((this.q() < 0.0f ? f1 - f5 : f + f5));
        }
        return true;
    }

    public static final void p(qnu qnu0) {
        qnu0.s(0x8000000000000000L);
    }

    private final float q() {
        return ((Number)this.i.a()).floatValue();
    }

    private final float r() {
        return ((Number)this.k.a()).floatValue();
    }

    private final void s(long v) {
        this.m.b(Long.valueOf(v));
    }
}

