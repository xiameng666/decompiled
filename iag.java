import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import jeb.synthetic.FIN;

public final class iag implements gom {
    public final ify a;
    public gpg b;
    public ict c;
    public int d;
    public int e;
    public final hzy f;
    public final hzv g;
    public final gwq h;
    public int i;
    public int j;
    public final String k;
    public final bzk l;
    public final bzk m;
    public final bzk n;
    public final bzk o;
    private final ics p;

    public iag(ify ify0, ict ict0) {
        this.a = ify0;
        this.c = ict0;
        this.l = new bzk(null);
        this.m = new bzk(null);
        this.f = new hzy(this);
        this.g = new hzv(this);
        this.n = new bzk(null);
        this.p = new ics(null);
        this.o = new bzk(null);
        this.h = new gwq(new Object[16]);
        this.k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final icm a(Object object0) {
        return !this.a.am() ? new iac() : new iad(this, object0);
    }

    @Override  // gom
    public final void b() {
        this.k(true);
    }

    @Override  // gom
    public final void c() {
        this.h();
    }

    @Override  // gom
    public final void d() {
        this.k(false);
    }

    public final icm e(Object object0, ibtw ibtw0) {
        ify ify0 = this.a;
        if(ify0.am()) {
            this.j();
            if(!this.m.c(object0)) {
                this.o.h(object0);
                bzk bzk0 = this.n;
                Object object1 = bzk0.a(object0);
                if(object1 == null) {
                    object1 = this.g(object0);
                    if(object1 == null) {
                        ify ify1 = this.f(ify0.z().size());
                        ++this.j;
                        object1 = ify1;
                    }
                    else {
                        this.l(ify0.z().indexOf(object1), ify0.z().size());
                        ++this.j;
                    }
                    bzk0.k(object0, object1);
                }
                this.m(((ify)object1), object0, ibtw0);
            }
        }
        return this.a(object0);
    }

    public final ify f(int v) {
        ify ify0 = new ify(true, 2, null);
        this.a.m = true;
        this.a.I(v, ify0);
        this.a.m = false;
        return ify0;
    }

    public final ify g(Object object0) {
        int v4;
        if(this.i == 0) {
            return null;
        }
        List list0 = this.a.z();
        int v = list0.size() - this.j;
        int v1 = v - this.i;
        int v2 = v - 1;
        int v3;
        for(v3 = v2; true; --v3) {
            v4 = -1;
            if(v3 < v1) {
                break;
            }
            if(ibuq.m(this.o(list0, v3), object0)) {
                v4 = v3;
                break;
            }
        }
        if(v4 == -1) {
            while(v2 >= v1) {
                ify ify0 = (ify)list0.get(v2);
                Object object1 = this.l.a(ify0);
                ibuq.c(object1);
                hzw hzw0 = (hzw)object1;
                if(hzw0.a != icl.a && !this.c.b(object0, hzw0.a)) {
                    --v2;
                    continue;
                }
                hzw0.a = object0;
                v3 = v2;
                v4 = v3;
                goto label_30;
            }
            v3 = v2;
            v4 = -1;
        }
    label_30:
        if(v4 == -1) {
            return null;
        }
        if(v3 != v1) {
            this.l(v3, v1);
        }
        --this.i;
        ify ify1 = (ify)list0.get(v1);
        Object object2 = this.l.a(ify1);
        ibuq.c(object2);
        ((hzw)object2).a(14);
        ((hzw)object2).e = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
        ((hzw)object2).d = true;
        ((hzw)object2).c = true;
        return ify1;
    }

    public final void h() {
        ify ify0 = this.a;
        ify0.m = true;
        bzk bzk0 = this.l;
        Object[] arr_object = bzk0.c;
        long[] arr_v = bzk0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            gpj gpj0 = ((hzw)arr_object[(v1 << 3) + v3]).g;
                            if(gpj0 != null) {
                                gpj0.d();
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        ify0.U();
        ify0.m = false;
        bzk0.j();
        this.m.j();
        this.j = 0;
        this.i = 0;
        this.n.j();
        this.j();
    }

    public final void i(int v) {
        int v3;
        boolean z;
        hbm hbm1;
        ibts ibts0;
        hbm hbm0;
        this.i = 0;
        ify ify0 = this.a;
        List list0 = ify0.z();
        int v1 = list0.size() - this.j - 1;
        if(v <= v1) {
            ics ics0 = this.p;
            ics0.clear();
            if(v <= v1) {
                int v2 = v;
                while(true) {
                    ics0.a(this.o(list0, v2));
                    if(v2 == v1) {
                        goto label_13;
                    }
                    ++v2;
                }
            }
            else {
            label_13:
                this.c.a(ics0);
                hbm0 = hbl.a();
                ibts0 = hbm0 == null ? null : hbm0.i();
                hbm1 = hbl.b(hbm0);
                z = false;
                v3 = FIN.finallyOpen$NT();
            }
            while(v1 >= v) {
                ify ify1 = (ify)list0.get(v1);
                bzk bzk0 = this.l;
                Object object0 = bzk0.a(ify1);
                ibuq.c(object0);
                hzw hzw0 = (hzw)object0;
                Object object1 = hzw0.a;
                if(ics0.contains(object1)) {
                    ++this.i;
                    if(hzw0.b()) {
                        iag.q(ify1);
                        this.p(hzw0, false);
                        if(hzw0.f) {
                            z = true;
                        }
                    }
                }
                else {
                    ify0.m = true;
                    bzk0.h(ify1);
                    gpj gpj0 = hzw0.g;
                    if(gpj0 != null) {
                        gpj0.d();
                    }
                    ify0.V(v1, 1);
                    ify0.m = false;
                }
                this.m.h(object1);
                --v1;
            }
            FIN.finallyCodeBegin$NT(v3);
            hbl.d(hbm0, hbm1, ibts0);
            FIN.finallyCodeEnd$NT(v3);
            if(z) {
                hbl.e();
            }
        }
        this.j();
    }

    public final void j() {
        int v = this.a.z().size();
        bzk bzk0 = this.l;
        if(bzk0.e != v) {
            hxt.c(("Inconsistency between the count of nodes tracked by the state (" + bzk0.e + ") and the children count on the SubcomposeLayout (" + v + "). Are you trying to use the state of the disposed SubcomposeLayout?"));
        }
        if(v - this.i - this.j < 0) {
            hxt.c(("Incorrect state. Total children " + v + ". Reusable children " + this.i + ". Precomposed children " + this.j));
        }
        bzk bzk1 = this.n;
        if(bzk1.e == this.j) {
            return;
        }
        hxt.c(("Incorrect state. Precomposed children " + this.j + ". Map size " + bzk1.e));
    }

    public final void k(boolean z) {
        this.j = 0;
        this.n.j();
        List list0 = this.a.z();
        int v1 = list0.size();
        if(this.i != v1) {
            this.i = v1;
            hbm hbm0 = hbl.a();
            ibts ibts0 = hbm0 == null ? null : hbm0.i();
            hbm hbm1 = hbl.b(hbm0);
            try {
                for(int v = 0; v < v1; ++v) {
                    ify ify0 = (ify)list0.get(v);
                    hzw hzw0 = (hzw)this.l.a(ify0);
                    if(hzw0 != null && hzw0.b()) {
                        iag.q(ify0);
                        this.p(hzw0, z);
                        hzw0.a = icl.a;
                        if(z) {
                            hzw0.a(12);
                        }
                        else {
                            hzw0.a(13);
                        }
                    }
                }
            }
            finally {
                hbl.d(hbm0, hbm1, ibts0);
            }
            this.m.j();
        }
        this.j();
    }

    public final void l(int v, int v1) {
        this.a.m = true;
        this.a.S(v, v1, 1);
        this.a.m = false;
    }

    public final void m(ify ify0, Object object0, ibtw ibtw0) {
        boolean z;
        bzk bzk0 = this.l;
        Object object1 = bzk0.a(ify0);
        if(object1 == null) {
            object1 = new hzw(object0, hyl.a);
            bzk0.k(ify0, object1);
        }
        ibtw ibtw1 = ((hzw)object1).b;
        gpj gpj0 = ((hzw)object1).g;
        if(gpj0 == null) {
            z = true;
        }
        else {
            __monitor_enter(gpj0.b);
            z = gpj0.n.e > 0;
            __monitor_exit(gpj0.b);
        }
        if(ibtw1 == ibtw0 && !z && !((hzw)object1).c) {
            return;
        }
        ((hzw)object1).b = ibtw0;
        hbm hbm0 = hbl.a();
        ibts ibts0 = hbm0 == null ? null : hbm0.i();
        hbm hbm1 = hbl.b(hbm0);
        int v = FIN.finallyOpen$NT();
        ify ify1 = this.a;
        ify1.m = true;
        gpj gpj1 = ((hzw)object1).g;
        gpg gpg0 = this.b;
        if(gpg0 != null) {
            ((hzw)object1).a((gpj1 == null ? 7 : 6));
            if(((hzw)object1).d) {
                ((hzw)object1).a(9);
            }
            if(gpj1 == null || gpj1.f()) {
                gpj1 = new gpj(gpg0, new ijo(ify0));
            }
            ((hzw)object1).g = gpj1;
            ibtw ibtw2 = ((hzw)object1).b;
            if(this.n() == null) {
                ((hzw)object1).f = true;
                ibtw2 = new gze(0x5AD8C84E, true, new iaf(((hzw)object1), ibtw2));
            }
            else {
                ((hzw)object1).f = false;
            }
            if(((hzw)object1).d) {
                gpj1.r();
                gpj1.p();
                gpj1.l(ibtw2);
            }
            else {
                gpj1.e(ibtw2);
            }
            ((hzw)object1).d = false;
            ify1.m = false;
            FIN.finallyCodeBegin$NT(v);
            ((hzw)object1).c = false;
            return;
        }
        hxt.b("parent composition reference not set");
        throw new ibnm();
    }

    private final iik n() {
        iik iik0 = igc.a(this.a);
        return ((ili)iik0).isAttachedToWindow() ? iik0 : null;
    }

    private final Object o(List list0, int v) {
        ify ify0 = (ify)list0.get(v);
        Object object0 = this.l.a(ify0);
        ibuq.c(object0);
        return ((hzw)object0).a;
    }

    private final void p(hzw hzw0, boolean z) {
        Boolean boolean0 = Boolean.valueOf(false);
        if(!z && hzw0.f) {
            hzw0.e.b(boolean0);
        }
        else {
            hzw0.e = new ParcelableSnapshotMutableState(boolean0, gul.a);
        }
        if(z) {
            hzw0.a(1);
            gpj gpj0 = hzw0.g;
            if(gpj0 == null) {
                return;
            }
            gpj0.m();
            return;
        }
        iik iik0 = this.n();
        if(iik0 == null) {
            if(!hzw0.f) {
                hzw0.a(3);
                gpj gpj1 = hzw0.g;
                if(gpj1 != null) {
                    gpj1.m();
                }
                return;
            }
            hzw0.a(4);
            return;
        }
        hzw0.a(2);
        iik0.h(new iae(hzw0));
    }

    private static final void q(ify ify0) {
        ify0.q().G = 3;
        igt igt0 = ify0.p();
        if(igt0 != null) {
            igt0.y = 3;
        }
    }
}

