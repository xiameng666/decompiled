import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cqu implements cuu {
    public long a;
    public final csk b;
    public final gra c;
    public long d;
    public long e;
    private final jks f;
    private boolean g;
    private final iem h;
    private final hxj i;

    public cqu(Context context0, jks jks0, long v) {
        this.f = jks0;
        this.a = 0x7FC000007FC00000L;
        csk csk0 = new csk(context0, hln.b(v));
        this.b = csk0;
        this.c = new ParcelableSnapshotMutableState(ibom.a, gre.a);
        this.d = 0L;
        this.e = -1L;
        hxj hxj0 = new hxj(null, null, new cqt(this));
        this.i = hxj0;
        this.h = new cvw(hxj0, this, csk0);
    }

    @Override  // cuu
    public final long a(long v, int v1, ibts ibts0) {
        boolean z2;
        int v8;
        boolean z1;
        boolean z;
        float f4;
        float f3;
        float f2;
        float f1;
        int v2 = 1;
        if(hkf.h(this.d)) {
            return ((hjz)ibts0.a(new hjz(v))).a;
        }
        if(!this.g) {
            csk csk0 = this.b;
            if(csk0.n()) {
                this.j(0L);
            }
            if(csk0.q()) {
                this.k(0L);
            }
            if(csk0.t()) {
                this.l(0L);
            }
            if(csk0.k()) {
                this.i(0L);
            }
            this.g = true;
        }
        float f = v1 == 2 ? 4.0f : 1.0f;
        long v3 = hjz.e(v, f);
        if(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) == 0.0f) {
            f1 = 0.0f;
        }
        else {
            csk csk1 = this.b;
            if(csk1.t() && (Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) < 0.0f)) {
                f2 = this.l(v3);
                if(!csk1.t()) {
                    csk1.g().finish();
                }
                f1 = f2 == Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL))) ? Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) : f2 / f;
            }
            else if(csk1.k() && (Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) > 0.0f)) {
                f2 = this.i(v3);
                if(!csk1.k()) {
                    csk1.a().finish();
                }
                f1 = f2 == Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL))) ? Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) : f2 / f;
            }
            else {
                f1 = 0.0f;
            }
        }
        if(Float.intBitsToFloat(((int)(v >> 0x20))) == 0.0f) {
            f3 = 0.0f;
        }
        else {
            csk csk2 = this.b;
            if(csk2.n() && (Float.intBitsToFloat(((int)(v >> 0x20))) < 0.0f)) {
                f4 = this.j(v3);
                if(!csk2.n()) {
                    csk2.c().finish();
                }
                f3 = f4 == Float.intBitsToFloat(((int)(v3 >> 0x20))) ? Float.intBitsToFloat(((int)(v >> 0x20))) : f4 / f;
            }
            else if(csk2.q() && (Float.intBitsToFloat(((int)(v >> 0x20))) > 0.0f)) {
                f4 = this.k(v3);
                if(!csk2.q()) {
                    csk2.e().finish();
                }
                f3 = f4 == Float.intBitsToFloat(((int)(v3 >> 0x20))) ? Float.intBitsToFloat(((int)(v >> 0x20))) : f4 / f;
            }
            else {
                f3 = 0.0f;
            }
        }
        long v4 = ((long)Float.floatToRawIntBits(f3)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
        if(!hjz.g(v4, 0L)) {
            this.g();
        }
        long v5 = hjz.c(v, v4);
        long v6 = ((hjz)ibts0.a(new hjz(v5))).a;
        long v7 = hjz.c(v5, v6);
        if(Float.intBitsToFloat(((int)(v5 >> 0x20))) == 0.0f && Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL))) == 0.0f) {
        }
        else if(((Float.intBitsToFloat(((int)(v6 >> 0x20))) != 0.0f) || Float.intBitsToFloat(((int)(v6 & 0xFFFFFFFFL))) != 0.0f) && (this.b.n() || this.b.t() || this.b.q() || this.b.k())) {
            this.f();
        }
        if(v1 == 1) {
            if(Float.compare(Float.intBitsToFloat(((int)(v7 >> 0x20))), 0.5f) > 0) {
                this.j(v7);
                z = true;
            }
            else if((Float.intBitsToFloat(((int)(v7 >> 0x20))) < -0.5f)) {
                this.k(v7);
                z = true;
            }
            else {
                z = false;
            }
            if((Float.intBitsToFloat(((int)(v7 & 0xFFFFFFFFL))) > 0.5f)) {
                this.l(v7);
                z1 = true;
            }
            else if((Float.intBitsToFloat(((int)(v7 & 0xFFFFFFFFL))) < -0.5f)) {
                this.i(v7);
                z1 = true;
            }
            else {
                z1 = false;
            }
            v8 = z || z1 ? 1 : 0;
        }
        else {
            v8 = 0;
        }
        if(hjz.g(v5, 0L)) {
            v2 = v8;
        }
        else {
            csk csk3 = this.b;
            if(csk3.l() && (Float.intBitsToFloat(((int)(v >> 0x20))) < 0.0f)) {
                csk3.c().onRelease();
                z2 = csk3.l();
            }
            else {
                z2 = false;
            }
            if(csk3.o() && (Float.intBitsToFloat(((int)(v >> 0x20))) > 0.0f)) {
                csk3.e().onRelease();
                z2 = z2 || csk3.o();
            }
            if(csk3.r() && (Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) < 0.0f)) {
                csk3.g().onRelease();
                z2 = z2 || csk3.r();
            }
            if(csk3.i() && (Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) > 0.0f)) {
                csk3.a().onRelease();
                z2 = z2 || csk3.i();
            }
            if(!z2 && v8 == 0) {
                v2 = 0;
            }
        }
        if(v2 != 0) {
            this.g();
        }
        return hjz.d(v4, v6);
    }

    public final long b() {
        long v = (0x7FFFFFFF7FFFFFFFL & this.a) == 0x7FC000007FC00000L ? hkg.a(this.d) : this.a;
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / Float.intBitsToFloat(((int)(this.d & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) / Float.intBitsToFloat(((int)(this.d >> 0x20))))) << 0x20;
    }

    @Override  // cuu
    public final hfc c() {
        return hfc.e;
    }

    @Override  // cuu
    public final iem d() {
        return this.h;
    }

    @Override  // cuu
    public final Object e(long v, ibtw ibtw0, ibrl ibrl0) {
        long v3;
        float f1;
        float f;
        cqr cqr0;
        if((ibrl0 instanceof cqr)) {
            cqr0 = (cqr)ibrl0;
            int v1 = cqr0.d;
            if((v1 & 0x80000000) == 0) {
                cqr0 = new cqr(this, ibrl0);
            }
            else {
                cqr0.d = v1 - 0x80000000;
            }
        }
        else {
            cqr0 = new cqr(this, ibrl0);
        }
        Object object0 = cqr0.b;
        Object object1 = ibrx.a;
        switch(cqr0.d) {
            case 0: {
                ibnx.b(object0);
                if(hkf.h(this.d)) {
                    jls jls0 = new jls(v);
                    cqr0.d = 1;
                    return ibtw0.a(jls0, cqr0) == object1 ? object1 : ibom.a;
                }
                csk csk0 = this.b;
                if(csk0.n() && (jls.a(v) < 0.0f)) {
                    f = csi.c(csk0.c(), jls.a(v), Float.intBitsToFloat(((int)(this.d >> 0x20))), this.f);
                }
                else {
                    f = !csk0.q() || !(jls.a(v) > 0.0f) ? 0.0f : -csi.c(csk0.e(), -jls.a(v), Float.intBitsToFloat(((int)(this.d >> 0x20))), this.f);
                }
                if(csk0.t() && (jls.b(v) < 0.0f)) {
                    f1 = csi.c(csk0.g(), jls.b(v), Float.intBitsToFloat(((int)(0xFFFFFFFFL & this.d))), this.f);
                }
                else {
                    f1 = !csk0.k() || !(jls.b(v) > 0.0f) ? 0.0f : -csi.c(csk0.a(), -jls.b(v), Float.intBitsToFloat(((int)(0xFFFFFFFFL & this.d))), this.f);
                }
                long v2 = jlt.a(f, f1);
                if(!jls.h(v2)) {
                    this.g();
                }
                v3 = jls.c(v, v2);
                jls jls1 = new jls(v3);
                cqr0.a = v3;
                cqr0.d = 2;
                object0 = ibtw0.a(jls1, cqr0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                return ibom.a;
            }
            case 2: {
                v3 = cqr0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        long v4 = jls.c(v3, ((jls)object0).a);
        this.g = false;
        if((jls.a(v4) > 0.0f)) {
            this.b.c().onAbsorb(ibvr.c(jls.a(v4)));
        }
        else if((jls.a(v4) < 0.0f)) {
            this.b.e().onAbsorb(-ibvr.c(jls.a(v4)));
        }
        if((jls.b(v4) > 0.0f)) {
            this.b.g().onAbsorb(ibvr.c(jls.b(v4)));
        }
        else if((jls.b(v4) < 0.0f)) {
            this.b.a().onAbsorb(-ibvr.c(jls.b(v4)));
        }
        this.f();
        return ibom.a;
    }

    public final void f() {
        int v1;
        csk csk0 = this.b;
        EdgeEffect edgeEffect0 = csk0.b;
        int v = 0;
        if(edgeEffect0 == null) {
            v1 = 0;
        }
        else {
            edgeEffect0.onRelease();
            v1 = edgeEffect0.isFinished() ^ 1;
        }
        EdgeEffect edgeEffect1 = csk0.c;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            v1 = !edgeEffect1.isFinished() || v1 != 0 ? 1 : 0;
        }
        EdgeEffect edgeEffect2 = csk0.d;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            v1 = !edgeEffect2.isFinished() || v1 != 0 ? 1 : 0;
        }
        EdgeEffect edgeEffect3 = csk0.e;
        if(edgeEffect3 == null) {
            v = v1;
        }
        else {
            edgeEffect3.onRelease();
            if(!edgeEffect3.isFinished() || v1 != 0) {
                v = 1;
            }
        }
        if(v != 0) {
            this.g();
        }
    }

    public final void g() {
        this.c.b(ibom.a);
    }

    @Override  // cuu
    public final boolean h() {
        csk csk0 = this.b;
        EdgeEffect edgeEffect0 = csk0.b;
        if(edgeEffect0 != null && csi.a(edgeEffect0) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect1 = csk0.c;
        if(edgeEffect1 != null && csi.a(edgeEffect1) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = csk0.d;
        if(edgeEffect2 != null) {
            if(csi.a(edgeEffect2) == 0.0f) {
                return csk0.e == null ? false : csi.a(csk0.e) != 0.0f;
            }
            return true;
        }
        return csk0.e == null ? false : csi.a(csk0.e) != 0.0f;
    }

    private final float i(long v) {
        float f = Float.intBitsToFloat(((int)(this.b() >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / Float.intBitsToFloat(((int)(this.d & 0xFFFFFFFFL)));
        EdgeEffect edgeEffect0 = this.b.a();
        float f2 = -csi.b(edgeEffect0, -f1, 1.0f - f) * Float.intBitsToFloat(((int)(this.d & 0xFFFFFFFFL)));
        return csi.a(edgeEffect0) == 0.0f ? f2 : Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    private final float j(long v) {
        float f = Float.intBitsToFloat(((int)(this.b() & 0xFFFFFFFFL)));
        float f1 = Float.intBitsToFloat(((int)(v >> 0x20))) / Float.intBitsToFloat(((int)(this.d >> 0x20)));
        EdgeEffect edgeEffect0 = this.b.c();
        float f2 = csi.b(edgeEffect0, f1, 1.0f - f) * Float.intBitsToFloat(((int)(this.d >> 0x20)));
        return csi.a(edgeEffect0) == 0.0f ? f2 : Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    private final float k(long v) {
        float f = Float.intBitsToFloat(((int)(this.b() & 0xFFFFFFFFL)));
        float f1 = Float.intBitsToFloat(((int)(v >> 0x20))) / Float.intBitsToFloat(((int)(this.d >> 0x20)));
        EdgeEffect edgeEffect0 = this.b.e();
        float f2 = -csi.b(edgeEffect0, -f1, f) * Float.intBitsToFloat(((int)(this.d >> 0x20)));
        return csi.a(edgeEffect0) == 0.0f ? f2 : Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    private final float l(long v) {
        float f = Float.intBitsToFloat(((int)(this.b() >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) / Float.intBitsToFloat(((int)(this.d & 0xFFFFFFFFL)));
        EdgeEffect edgeEffect0 = this.b.g();
        float f2 = csi.b(edgeEffect0, f1, f) * Float.intBitsToFloat(((int)(0xFFFFFFFFL & this.d)));
        return csi.a(edgeEffect0) == 0.0f ? f2 : Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }
}

