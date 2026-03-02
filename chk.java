import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class chk {
    public final Object a;
    public final long b;
    public final gra c;
    public cht d;
    public long e;
    public long f;
    private final ibth g;
    private final gra h;
    private final cmc i;

    public chk(Object object0, cmc cmc0, cht cht0, long v, Object object1, long v1, ibth ibth0) {
        this.i = cmc0;
        this.a = object1;
        this.b = v1;
        this.g = ibth0;
        this.c = new ParcelableSnapshotMutableState(object0, gul.a);
        this.d = chu.a(cht0);
        this.e = v;
        this.f = 0x8000000000000000L;
        this.h = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
    }

    public final Object a() {
        return this.c.a();
    }

    public final Object b() {
        return this.i.b.a(this.d);
    }

    public final void c() {
        this.e();
        this.g.a();
    }

    public final boolean d() {
        return ((Boolean)this.h.a()).booleanValue();
    }

    public final void e() {
        this.h.b(Boolean.valueOf(false));
    }
}

