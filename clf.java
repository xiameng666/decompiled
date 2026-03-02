import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class clf implements gui {
    public cju a;
    public ckv b;
    public boolean c;
    public cht d;
    public final cii e;
    final clj f;
    public final cmc g;
    private final gra h;
    private final ckh i;
    private final gra j;
    private final gra k;
    private final gra l;
    private final gra m;
    private boolean n;
    private final gtj o;
    private final gtn p;

    public clf(clj clj0, Object object0, cht cht0, cmc cmc0) {
        this.f = clj0;
        super();
        this.g = cmc0;
        this.h = new ParcelableSnapshotMutableState(object0, gul.a);
        Object object1 = null;
        ckh ckh0 = chm.b(0.0f, 0.0f, null, 7);
        this.i = ckh0;
        this.j = new ParcelableSnapshotMutableState(ckh0, gul.a);
        this.k = new ParcelableSnapshotMutableState(new ckv(this.d(), cmc0, object0, this.o(), cht0), gul.a);
        this.l = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
        this.o = new ParcelableSnapshotMutableFloatState(-1.0f);
        this.m = new ParcelableSnapshotMutableState(object0, gul.a);
        this.d = cht0;
        this.p = new ParcelableSnapshotMutableLongState(this.e().a());
        Float float0 = (Float)cno.b.get(cmc0);
        if(float0 != null) {
            float f = float0.floatValue();
            cht cht1 = (cht)cmc0.a.a(object0);
            int v = cht1.b();
            for(int v1 = 0; v1 < v; ++v1) {
                cht1.e(v1, f);
            }
            object1 = this.g.b.a(cht1);
        }
        this.e = chm.b(0.0f, 0.0f, object1, 3);
    }

    @Override  // gui
    public final Object a() {
        return this.m.a();
    }

    public final float b() {
        return this.o.e();
    }

    public final long c() {
        return this.p.e();
    }

    public final cii d() {
        return (cii)this.j.a();
    }

    public final ckv e() {
        return (ckv)this.k.a();
    }

    public final void f(long v) {
        if(this.b() == -1.0f) {
            this.n = true;
            if(ibuq.m(this.e().a, this.e().b)) {
                this.k(this.e().a);
                return;
            }
            this.k(this.e().d(v));
            this.d = this.e().b(v);
        }
    }

    public final void g(ckv ckv0) {
        this.k.b(ckv0);
    }

    public final void h(long v) {
        this.p.h(v);
    }

    public final void i(boolean z) {
        this.l.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.o.h(f);
    }

    public final void k(Object object0) {
        this.m.b(object0);
    }

    public final void l(Object object0, Object object1, cii cii0) {
        this.q(object1);
        this.p(cii0);
        if(ibuq.m(this.e().b, object0) && ibuq.m(this.e().a, object1)) {
            return;
        }
        this.r(object0, false);
    }

    public final void m(Object object0, cii cii0) {
        if((!this.c || !ibuq.m(object0, (this.b == null ? null : this.b.a))) && (!ibuq.m(this.o(), object0) || this.b() != -1.0f)) {
            this.q(object0);
            this.p(cii0);
            boolean z = true;
            this.r((this.b() == -3.0f ? object0 : this.a()), ((boolean)(this.n() ^ 1)));
            if(Float.compare(this.b(), -3.0f) != 0) {
                z = false;
            }
            this.i(z);
            if((this.b() >= 0.0f)) {
                long v = this.e().a();
                this.k(this.e().d(((long)(((float)v) * this.b()))));
            }
            else if(this.b() == -3.0f) {
                this.k(object0);
            }
            this.c = false;
            this.j(-1.0f);
        }
    }

    public final boolean n() {
        return ((Boolean)this.l.a()).booleanValue();
    }

    private final Object o() {
        return this.h.a();
    }

    private final void p(cii cii0) {
        this.j.b(cii0);
    }

    private final void q(Object object0) {
        this.h.b(object0);
    }

    private final void r(Object object0, boolean z) {
        cii cii0;
        if(ibuq.m((this.b == null ? null : this.b.a), this.o())) {
            cht cht0 = this.d.c();
            this.g(new ckv(this.e, this.g, object0, object0, cht0));
            this.c = true;
            this.h(this.e().a());
            return;
        }
        if(!z || this.n) {
            cii0 = this.d();
        }
        else if((this.d() instanceof ckh)) {
            cii0 = this.d();
        }
        else {
            cii0 = this.e;
        }
        clj clj0 = this.f;
        cki cki0 = clj0.b() > 0L ? new cki(cii0, clj0.b()) : cii0;
        Object object1 = this.o();
        this.g(new ckv(cki0, this.g, object0, object1, this.d));
        this.h(this.e().a());
        this.c = false;
        clj0.u(true);
        if(clj0.z()) {
            SnapshotStateList snapshotStateList0 = clj0.d;
            int v = snapshotStateList0.a();
            long v2 = 0L;
            for(int v1 = 0; v1 < v; ++v1) {
                clf clf0 = (clf)snapshotStateList0.get(v1);
                v2 = Math.max(v2, clf0.c());
                clf0.f(0L);
            }
            clj0.u(false);
        }
    }

    @Override
    public final String toString() {
        return "current value: " + this.a() + ", target: " + this.o() + ", spec: " + this.d();
    }
}

