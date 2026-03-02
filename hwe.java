import java.util.List;

public final class hwe {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final long k;
    public hwe l;
    private List m;
    private boolean n;
    private boolean o;

    public hwe(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, List list0, long v6, long v7) {
        this(v, v1, v2, z, f, v3, v4, z1, false, v5, v6);
        this.m = list0;
        this.k = v7;
    }

    public hwe(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = f;
        this.f = v3;
        this.g = v4;
        this.h = z1;
        this.i = v5;
        this.j = v6;
        this.k = 0L;
        this.n = z2;
        this.o = z2;
    }

    public final List a() {
        List list0 = this.m;
        return list0 == null ? ibps.a : list0;
    }

    public final void b() {
        hwe hwe0 = this.l;
        if(hwe0 == null) {
            this.n = true;
            this.o = true;
            return;
        }
        hwe0.b();
    }

    public final boolean c() {
        hwe hwe0 = this.l;
        if(hwe0 != null) {
            return hwe0.c();
        }
        return this.n ? true : this.o;
    }

    @Override
    public final String toString() {
        return "PointerInputChange(id=" + hwd.a(this.a) + ", uptimeMillis=" + this.b + ", position=" + hjz.f(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + hjz.f(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + this.c() + ", type=" + hwx.a(this.i) + ", historical=" + this.a() + ",scrollDelta=" + hjz.f(this.j) + ')';
    }
}

