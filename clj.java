import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class clj {
    public final clj a;
    public final String b;
    public final gra c;
    public final SnapshotStateList d;
    public final SnapshotStateList e;
    public long f;
    private final cma g;
    private final gra h;
    private final gra i;
    private final gra j;
    private final gui k;
    private final gtn l;
    private final gtn m;

    public clj(cma cma0, clj clj0, String s) {
        this.g = cma0;
        this.a = clj0;
        this.b = s;
        this.h = new ParcelableSnapshotMutableState(this.f(), gul.a);
        this.i = new ParcelableSnapshotMutableState(new cle(this.f(), this.f()), gul.a);
        this.l = new ParcelableSnapshotMutableLongState(0L);
        this.m = new ParcelableSnapshotMutableLongState(0x8000000000000000L);
        Boolean boolean0 = Boolean.valueOf(false);
        this.c = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.d = new SnapshotStateList();
        this.e = new SnapshotStateList();
        this.j = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.k = new gpx(() -> {
            SnapshotStateList snapshotStateList0 = this.d;
            int v = snapshotStateList0.a();
            long v1 = 0L;
            for(int v3 = 0; v3 < v; ++v3) {
                v1 = Math.max(v1, ((clf)snapshotStateList0.get(v3)).c());
            }
            SnapshotStateList snapshotStateList1 = this.e;
            int v4 = snapshotStateList1.a();
            for(int v2 = 0; v2 < v4; ++v2) {
                v1 = Math.max(v1, ((clj)snapshotStateList1.get(v2)).a());
            }
            return v1;
        }, null);
        cma0.e(this);
    }

    public final void A(clf clf0) {
        this.d.add(clf0);
    }

    public final void B(Object object0, Object object1) {
        this.s(0x8000000000000000L);
        cma cma0 = this.g;
        cma0.t(false);
        if(!this.z() || !ibuq.m(this.f(), object0) || !ibuq.m(this.g(), object1)) {
            if(!ibuq.m(this.f(), object0) && (cma0 instanceof cjh)) {
                ((cjh)cma0).c(object0);
            }
            this.t(object1);
            this.r(true);
            this.D(new cle(object0, object1));
        }
        SnapshotStateList snapshotStateList0 = this.e;
        int v1 = snapshotStateList0.a();
        for(int v2 = 0; v2 < v1; ++v2) {
            clj clj0 = (clj)snapshotStateList0.get(v2);
            ibuq.d(clj0, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if(clj0.z()) {
                clj0.B(clj0.f(), clj0.g());
            }
        }
        SnapshotStateList snapshotStateList1 = this.d;
        int v3 = snapshotStateList1.a();
        for(int v = 0; v < v3; ++v) {
            ((clf)snapshotStateList1.get(v)).f(0L);
        }
        this.f = 0L;
    }

    public final void C(Object object0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xA6F9B301);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(object0) : goz1.Z(object0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(this) ? 0x20 : 16);
        }
        if(goz1.ad((v2 & 19) != 18, v2 & 1)) {
            if(this.z()) {
                goz1.M(0x18D231E1);
            }
            else {
                goz1.M(0x1BC87041);
                this.w(object0);
                Object object1 = goz1.j();
                if((v2 & 0x70) == 0x20 || object1 == gop.a) {
                    gpx gpx0 = new gpx(new ckw(this), null);
                    goz1.P(gpx0);
                    object1 = gpx0;
                }
                if(((Boolean)((gui)object1).a()).booleanValue()) {
                    goz1.M(0x1BCEAA74);
                    Object object2 = goz1.j();
                    Object object3 = gop.a;
                    if(object2 == object3) {
                        object2 = gqe.a(ibru.a, goz1);
                        goz1.P(object2);
                    }
                    int v3 = goz1.Z(((icck)object2));
                    if((v2 & 0x70) != 0x20) {
                        v1 = 0;
                    }
                    Object object4 = goz1.j();
                    if((v3 | v1) != 0 || object4 == object3) {
                        object4 = new ckx(((icck)object2), this);
                        goz1.P(object4);
                    }
                    gqe.b(((icck)object2), this, ((ibts)object4), goz1);
                }
                else {
                    goz1.M(0x18D231E1);
                }
                goz1.x();
            }
            goz1.x();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cky(this, object0, v);
        }
    }

    private final void D(cld cld0) {
        this.i.b(cld0);
    }

    // Detected as a lambda impl.
    public final long a() {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        long v1 = 0L;
        for(int v3 = 0; v3 < v; ++v3) {
            v1 = Math.max(v1, ((clf)snapshotStateList0.get(v3)).c());
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v4 = snapshotStateList1.a();
        for(int v2 = 0; v2 < v4; ++v2) {
            v1 = Math.max(v1, ((clj)snapshotStateList1.get(v2)).a());
        }
        return v1;
    }

    public final long b() {
        return this.a == null ? this.l.e() : this.a.b();
    }

    public final long c() {
        return this.m.e();
    }

    public final long d() {
        return ((Number)this.k.a()).longValue();
    }

    public final cld e() {
        return (cld)this.i.a();
    }

    public final Object f() {
        return this.g.a();
    }

    public final Object g() {
        return this.h.a();
    }

    public final void h() {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        for(int v2 = 0; v2 < v; ++v2) {
            clf clf0 = (clf)snapshotStateList0.get(v2);
            clf0.b = null;
            clf0.a = null;
            clf0.c = false;
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v3 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((clj)snapshotStateList1.get(v1)).h();
        }
    }

    public final void i() {
        this.k();
        this.g.f();
    }

    public final void j(long v, boolean z) {
        if(Long.compare(this.c(), 0x8000000000000000L) == 0) {
            this.l(v);
        }
        else {
            cma cma0 = this.g;
            if(!((Boolean)cma0.m.a()).booleanValue()) {
                cma0.t(true);
            }
        }
        this.u(false);
        SnapshotStateList snapshotStateList0 = this.d;
        int v2 = snapshotStateList0.a();
        int v4 = 1;
        for(int v3 = 0; v3 < v2; ++v3) {
            clf clf0 = (clf)snapshotStateList0.get(v3);
            if(!clf0.n()) {
                long v5 = z ? clf0.e().a() : v;
                clf0.k(clf0.e().d(v5));
                clf0.d = clf0.e().b(v5);
                if(chh.a(clf0.e(), v5)) {
                    clf0.i(true);
                }
            }
            v4 &= clf0.n();
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v6 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v6; ++v1) {
            clj clj0 = (clj)snapshotStateList1.get(v1);
            if(!ibuq.m(clj0.g(), clj0.f())) {
                clj0.j(v, z);
            }
            v4 &= ibuq.m(clj0.g(), clj0.f());
        }
        if(v4 != 0) {
            this.k();
        }
    }

    public final void k() {
        this.s(0x8000000000000000L);
        cma cma0 = this.g;
        if((cma0 instanceof cjh)) {
            ((cjh)cma0).c(this.g());
        }
        this.q(0L);
        cma0.t(false);
        SnapshotStateList snapshotStateList0 = this.e;
        int v1 = snapshotStateList0.a();
        for(int v = 0; v < v1; ++v) {
            ((clj)snapshotStateList0.get(v)).k();
        }
    }

    public final void l(long v) {
        this.s(v);
        this.g.t(true);
    }

    public final void m(clf clf0) {
        this.d.remove(clf0);
    }

    public final void n(float f) {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        for(int v2 = 0; v2 < v; ++v2) {
            clf clf0 = (clf)snapshotStateList0.get(v2);
            int v3 = Float.compare(f, -4.0f);
            if(v3 != 0 && f != -5.0f) {
                clf0.j(f);
            }
            else {
                ckv ckv0 = clf0.b;
                if(ckv0 != null) {
                    clf0.e().h(ckv0.a);
                    clf0.a = null;
                    clf0.b = null;
                }
                Object object0 = v3 == 0 ? clf0.e().b : clf0.e().a;
                clf0.e().h(object0);
                clf0.e().i(object0);
                clf0.k(object0);
                clf0.h(clf0.e().a());
            }
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v4 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v4; ++v1) {
            ((clj)snapshotStateList1.get(v1)).n(f);
        }
    }

    public final void o(long v) {
        if(this.c() == 0x8000000000000000L) {
            this.s(v);
        }
        this.q(v);
        this.u(false);
        SnapshotStateList snapshotStateList0 = this.d;
        int v2 = snapshotStateList0.a();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((clf)snapshotStateList0.get(v3)).f(v);
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v4 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v4; ++v1) {
            clj clj0 = (clj)snapshotStateList1.get(v1);
            if(!ibuq.m(clj0.g(), clj0.f())) {
                clj0.o(v);
            }
        }
    }

    public final void p(cju cju0) {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        for(int v2 = 0; v2 < v; ++v2) {
            clf clf0 = (clf)snapshotStateList0.get(v2);
            if(!ibuq.m(clf0.e().a, clf0.e().b)) {
                clf0.b = clf0.e();
                clf0.a = cju0;
            }
            Object object0 = clf0.a();
            Object object1 = clf0.a();
            cht cht0 = clf0.d.c();
            clf0.g(new ckv(clf0.e, clf0.g, object0, object1, cht0));
            clf0.h(clf0.e().a());
            clf0.c = true;
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v3 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((clj)snapshotStateList1.get(v1)).p(cju0);
        }
    }

    public final void q(long v) {
        if(this.a == null) {
            this.l.h(v);
        }
    }

    public final void r(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void s(long v) {
        this.m.h(v);
    }

    public final void t(Object object0) {
        this.h.b(object0);
    }

    @Override
    public final String toString() {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        String s = "Transition animation values: ";
        for(int v1 = 0; v1 < v; ++v1) {
            s = s + ((clf)snapshotStateList0.get(v1)) + ", ";
        }
        return s;
    }

    public final void u(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final void v() {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        int v2 = 0;
        while(v2 < v) {
            clf clf0 = (clf)snapshotStateList0.get(v2);
            cju cju0 = clf0.a;
            if(cju0 != null) {
                ckv ckv0 = clf0.b;
                if(ckv0 != null) {
                    long v3 = ibvr.d(((double)cju0.g) * ((double)cju0.d));
                    Object object0 = ckv0.d(v3);
                    if(clf0.c) {
                        clf0.e().i(object0);
                    }
                    clf0.e().h(object0);
                    clf0.h(clf0.e().a());
                    if(clf0.b() == -2.0f) {
                    }
                    else if(!clf0.c) {
                        clf0.f(clf0.f.b());
                        goto label_22;
                    }
                    clf0.k(object0);
                label_22:
                    if(v3 >= cju0.g) {
                        clf0.a = null;
                        clf0.b = null;
                    }
                    else {
                        cju0.c = false;
                    }
                }
            }
            ++v2;
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v4 = snapshotStateList1.a();
        for(int v1 = 0; v1 < v4; ++v1) {
            ((clj)snapshotStateList1.get(v1)).v();
        }
    }

    public final void w(Object object0) {
        if(!ibuq.m(this.g(), object0)) {
            this.D(new cle(this.g(), object0));
            if(!ibuq.m(this.f(), this.g())) {
                Object object1 = this.g();
                this.g.c(object1);
            }
            this.t(object0);
            if(!this.y()) {
                this.u(true);
            }
            SnapshotStateList snapshotStateList0 = this.d;
            int v = snapshotStateList0.a();
            for(int v1 = 0; v1 < v; ++v1) {
                ((clf)snapshotStateList0.get(v1)).j(-2.0f);
            }
        }
    }

    public final boolean x() {
        SnapshotStateList snapshotStateList0 = this.d;
        int v = snapshotStateList0.a();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((clf)snapshotStateList0.get(v1)).a != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList1 = this.e;
        int v2 = snapshotStateList1.a();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(((clj)snapshotStateList1.get(v3)).x()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        return this.c() != 0x8000000000000000L;
    }

    public final boolean z() {
        return ((Boolean)this.j.a()).booleanValue();
    }
}

