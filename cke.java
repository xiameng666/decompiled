import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.concurrent.CancellationException;

public final class cke extends cma {
    public static final chp a;
    public Object b;
    public clj c;
    public long d;
    public icbi e;
    public final cjn f;
    public long g;
    public cju h;
    public final ibts i;
    public float j;
    public final icta k;
    public final bzd l;
    private final gra n;
    private final gra o;
    private final ibth p;
    private final ibts q;
    private final gtj r;

    static {
        cke.a = new chp(0.0f);
    }

    public cke(Object object0) {
        this.n = new ParcelableSnapshotMutableState(object0, gul.a);
        this.o = new ParcelableSnapshotMutableState(object0, gul.a);
        this.b = object0;
        this.p = new cjr(this);
        this.r = new ParcelableSnapshotMutableFloatState(0.0f);
        this.k = new icta();
        this.f = new cjn();
        this.g = 0x8000000000000000L;
        this.l = new bzd(null);
        this.i = new cjs(this);
        this.q = new cjt(this);
    }

    @Override  // cma
    public final Object a() {
        return this.o.a();
    }

    @Override  // cma
    public final Object b() {
        return this.n.a();
    }

    @Override  // cma
    public final void c(Object object0) {
        this.o.b(object0);
    }

    public final float d() {
        return this.r.e();
    }

    @Override  // cma
    public final void e(clj clj0) {
        if(this.c != null && !ibuq.m(clj0, this.c)) {
            cjo.b(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.c + ", new instance: " + clj0));
        }
        this.c = clj0;
    }

    @Override  // cma
    public final void f() {
        this.c = null;
        clz.a().b(this);
    }

    public final Object g(ibrl ibrl0) {
        float f = cku.a(ibrl0.u());
        if((f <= 0.0f)) {
            this.l();
            return ibom.a;
        }
        this.j = f;
        Object object0 = gqv.c(this.q, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object h(ibrl ibrl0) {
        cjx cjx0;
        if((ibrl0 instanceof cjx)) {
            cjx0 = (cjx)ibrl0;
            int v = cjx0.c;
            if((v & 0x80000000) == 0) {
                cjx0 = new cjx(this, ibrl0);
            }
            else {
                cjx0.c = v - 0x80000000;
            }
        }
        else {
            cjx0 = new cjx(this, ibrl0);
        }
        Object object0 = cjx0.a;
        Object object1 = ibrx.a;
        switch(cjx0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.l.f() && this.h == null) {
                    return ibom.a;
                }
                if(cku.a(cjx0.u()) == 0.0f) {
                    this.l();
                    this.g = 0x8000000000000000L;
                    return ibom.a;
                }
                if(this.g == 0x8000000000000000L) {
                    cjx0.c = 1;
                    if(gqv.c(this.i, cjx0) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: 
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(!this.l.g() && this.h == null) {
                this.g = 0x8000000000000000L;
                return ibom.a;
            }
            cjx0.c = 2;
        }
        while(this.g(cjx0) != object1);
        return object1;
    }

    public final Object i(float f, Object object0, ibrl ibrl0) {
        if((f < 0.0f) || f > 1.0f) {
            cjo.a(("Expecting fraction between 0 and 1. Got " + f));
        }
        clj clj0 = this.c;
        if(clj0 != null) {
            cka cka0 = new cka(object0, this.b(), this, clj0, f, null);
            Object object1 = cjn.a(this.f, cka0, ibrl0);
            if(object1 == ibrx.a) {
                return object1;
            }
        }
        return ibom.a;
    }

    public final Object j(ibrl ibrl0) {
        Object object5;
        Object object2;
        ckc ckc0;
        if((ibrl0 instanceof ckc)) {
            ckc0 = (ckc)ibrl0;
            int v = ckc0.d;
            if((v & 0x80000000) == 0) {
                ckc0 = new ckc(this, ibrl0);
            }
            else {
                ckc0.d = v - 0x80000000;
            }
        }
        else {
            ckc0 = new ckc(this, ibrl0);
        }
        Object object0 = ckc0.b;
        Object object1 = ibrx.a;
        switch(ckc0.d) {
            case 0: {
                ibnx.b(object0);
                object2 = this.b();
                ckc0.a = object2;
                ckc0.d = 1;
                if(this.k.b(ckc0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                Object object3 = ckc0.a;
                ibnx.b(object0);
                object2 = object3;
            label_22:
                ckc0.a = object2;
                ckc0.d = 2;
                icbk icbk0 = new icbk(ibsc.c(ckc0), 1);
                icbk0.z();
                this.e = icbk0;
                this.k.d();
                Object object4 = icbk0.k();
                if(object4 == object1) {
                    ibsi.b(ckc0);
                }
                if(object4 != object1) {
                    object5 = object2;
                    object0 = object4;
                    break;
                }
                return object1;
            }
            case 2: {
                object5 = ckc0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibuq.m(object0, object5)) {
            return ibom.a;
        }
        this.g = 0x8000000000000000L;
        throw new CancellationException("targetState while waiting for composition");
    }

    public final Object k(ibrl ibrl0) {
        Object object5;
        Object object2;
        ckd ckd0;
        if((ibrl0 instanceof ckd)) {
            ckd0 = (ckd)ibrl0;
            int v = ckd0.d;
            if((v & 0x80000000) == 0) {
                ckd0 = new ckd(this, ibrl0);
            }
            else {
                ckd0.d = v - 0x80000000;
            }
        }
        else {
            ckd0 = new ckd(this, ibrl0);
        }
        Object object0 = ckd0.b;
        Object object1 = ibrx.a;
        switch(ckd0.d) {
            case 0: {
                ibnx.b(object0);
                object2 = this.b();
                ckd0.a = object2;
                ckd0.d = 1;
                if(this.k.b(ckd0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                Object object3 = ckd0.a;
                ibnx.b(object0);
                object2 = object3;
            label_22:
                if(ibuq.m(object2, this.b)) {
                    this.k.d();
                    return ibom.a;
                }
                ckd0.a = object2;
                ckd0.d = 2;
                icbk icbk0 = new icbk(ibsc.c(ckd0), 1);
                icbk0.z();
                this.e = icbk0;
                this.k.d();
                Object object4 = icbk0.k();
                if(object4 == object1) {
                    ibsi.b(ckd0);
                }
                if(object4 != object1) {
                    object5 = object2;
                    object0 = object4;
                    break;
                }
                return object1;
            }
            case 2: {
                object5 = ckd0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibuq.m(object0, object5)) {
            return ibom.a;
        }
        this.g = 0x8000000000000000L;
        throw new CancellationException(a.m(object5, object0, "snapTo() was canceled because state was changed to ", " instead of "));
    }

    public final void l() {
        clj clj0 = this.c;
        if(clj0 != null) {
            clj0.h();
        }
        this.l.k();
        if(this.h != null) {
            this.h = null;
            this.p(1.0f);
            this.o();
        }
    }

    public final void m() {
        clj clj0 = this.c;
        if(clj0 == null) {
            return;
        }
        cju cju0 = this.h;
        if(cju0 == null) {
            if(this.d <= 0L) {
                cju0 = null;
            }
            else if(this.d() == 1.0f) {
                cju0 = null;
            }
            else if(ibuq.m(this.a(), this.b())) {
                cju0 = null;
            }
            else {
                cju0 = new cju();
                cju0.d = this.d();
                cju0.g = this.d;
                cju0.h = ibvr.d(((double)this.d) * (1.0 - ((double)this.d())));
                float f = this.d();
                cju0.e.e(0, f);
            }
        }
        if(cju0 != null) {
            cju0.g = this.d;
            this.l.p(cju0);
            clj0.p(cju0);
        }
        this.h = null;
    }

    public final void n() {
        clz.a().c(this, clz.a, this.p);
    }

    public final void o() {
        clj clj0 = this.c;
        if(clj0 == null) {
            return;
        }
        clj0.o(ibvr.d(((double)this.d()) * ((double)clj0.d())));
    }

    public final void p(float f) {
        this.r.h(f);
    }

    public final void q(Object object0) {
        this.n.b(object0);
    }

    public static final void r(cke cke0) {
        cke0.g = 0x8000000000000000L;
    }

    public static final void s(cju cju0, long v) {
        long v1 = cju0.a + v;
        cju0.a = v1;
        long v2 = cju0.h;
        if(Long.compare(v1, v2) >= 0) {
            cju0.d = 1.0f;
            return;
        }
        float f = ((float)v1) / ((float)v2);
        cju0.d = cju0.e.a(0) * (1.0f - f) + f;
    }
}

