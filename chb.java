import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class chb {
    public final chn a;
    public final cht b;
    public final cht c;
    public cht d;
    public cht e;
    public final cmc f;
    private final Object g;
    private final gra h;
    private final gra i;
    private final cjn j;
    private final ckh k;

    public chb(Object object0, cmc cmc0, Object object1) {
        chp chp1;
        chp chp0;
        this.f = cmc0;
        this.g = object1;
        this.a = new chn(cmc0, object0, null, 60);
        this.h = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        this.i = new ParcelableSnapshotMutableState(object0, gul.a);
        this.j = new cjn();
        this.k = new ckh(object1, 3);
        cht cht0 = this.a();
        if((cht0 instanceof chp)) {
            chp0 = chc.e;
        }
        else if((cht0 instanceof chq)) {
            chp0 = chc.f;
        }
        else if((cht0 instanceof chr)) {
            chp0 = chc.g;
        }
        else {
            chp0 = chc.h;
        }
        this.b = chp0;
        cht cht1 = this.a();
        if((cht1 instanceof chp)) {
            chp1 = chc.a;
        }
        else if((cht1 instanceof chq)) {
            chp1 = chc.b;
        }
        else if((cht1 instanceof chr)) {
            chp1 = chc.c;
        }
        else {
            chp1 = chc.d;
        }
        this.c = chp1;
        this.d = chp0;
        this.e = chp1;
    }

    public chb(Object object0, cmc cmc0, Object object1, int v) {
        if((v & 4) != 0) {
            object1 = null;
        }
        this(object0, cmc0, object1);
    }

    public final cht a() {
        return this.a.a;
    }

    public final Object b(Object object0) {
        if(!ibuq.m(this.d, this.b) || !ibuq.m(this.e, this.c)) {
            cmc cmc0 = this.f;
            cht cht0 = (cht)cmc0.a.a(object0);
            int v = cht0.b();
            boolean z = false;
            for(int v1 = 0; v1 < v; ++v1) {
                if((cht0.a(v1) < this.d.a(v1)) || (cht0.a(v1) > this.e.a(v1))) {
                    cht0.e(v1, ibwt.f(cht0.a(v1), this.d.a(v1), this.e.a(v1)));
                    z = true;
                }
            }
            return z ? cmc0.b.a(cht0) : object0;
        }
        return object0;
    }

    public final Object c() {
        return this.i.a();
    }

    public final Object d() {
        return this.a.a();
    }

    public final Object e(Object object0, ibrl ibrl0) {
        cgz cgz0 = new cgz(this, object0, null);
        Object object1 = cjn.a(this.j, cgz0, ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }

    public final Object f(ibrl ibrl0) {
        cha cha0 = new cha(this, null);
        Object object0 = cjn.a(this.j, cha0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final void g() {
        this.a.a.d();
        this.a.b = 0x8000000000000000L;
        this.h(false);
    }

    public final void h(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void i(Object object0) {
        this.i.b(object0);
    }

    public final boolean j() {
        return ((Boolean)this.h.a()).booleanValue();
    }

    public static Object k(chb chb0, Object object0, chl chl0, ibts ibts0, ibrl ibrl0, int v) {
        if((v & 2) != 0) {
            chl0 = chb0.k;
        }
        Object object1 = (v & 4) == 0 ? null : chb0.f.b.a(chb0.a());
        Object object2 = chb0.d();
        cht cht0 = (cht)chb0.f.a.a(object1);
        cgy cgy0 = new cgy(chb0, object1, new ckv(chl0, chb0.f, object2, object0, cht0), chb0.a.b, ((v & 8) == 0 ? ibts0 : null), null);
        return cjn.a(chb0.j, cgy0, ibrl0);
    }
}

