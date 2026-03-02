import android.os.Build.VERSION;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class ipm implements iil {
    public ibtw a;
    private hpn b;
    private final ili c;
    private ibth d;
    private long e;
    private boolean f;
    private final float[] g;
    private float[] h;
    private boolean i;
    private jks j;
    private jlm k;
    private final hoz l;
    private int m;
    private long n;
    private hmg o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final ibts t;
    private final hkm u;

    public ipm(hpn hpn0, hkm hkm0, ili ili0, ibtw ibtw0, ibth ibth0) {
        this.b = hpn0;
        this.u = hkm0;
        this.c = ili0;
        this.a = ibtw0;
        this.d = ibth0;
        this.e = 0x7FFFFFFF7FFFFFFFL;
        this.g = hmb.f();
        this.j = new jkt(1.0f, 1.0f);
        this.k = jlm.a;
        this.l = new hoz();
        this.n = hnd.a;
        this.r = true;
        this.t = new ipl(this);
    }

    @Override  // iil
    public final long a(long v, boolean z) {
        float[] arr_f;
        if(z) {
            arr_f = this.p();
            if(arr_f == null) {
                return 0x7F8000007F800000L;
            }
        }
        else {
            arr_f = this.q();
        }
        return this.r ? v : hmb.a(arr_f, v);
    }

    @Override  // iil
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        this.n(false);
        hkm hkm0 = this.u;
        if(hkm0 != null) {
            hkm0.c(this.b);
            this.c.M.a();
            WeakReference weakReference0 = new WeakReference(this, this.c.M.b);
            this.c.M.a.n(weakReference0);
            this.c.r.remove(this);
        }
    }

    @Override  // iil
    public final void c(hli hli0, hpn hpn0) {
        this.j();
        this.s = this.b.b() > 0.0f;
        this.l.b.e(hli0);
        this.l.b.a = hpn0;
        hpo.a(this.l, this.b);
    }

    @Override  // iil
    public final void d(float[] arr_f) {
        float[] arr_f1 = this.p();
        if(arr_f1 != null) {
            hmb.e(arr_f, arr_f1);
        }
    }

    @Override  // iil
    public final void e(hjw hjw0, boolean z) {
        float[] arr_f = z ? this.p() : this.q();
        if(!this.r) {
            if(arr_f == null) {
                hjw0.c(0.0f, 0.0f);
                return;
            }
            hmb.b(arr_f, hjw0);
        }
    }

    @Override  // iil
    public final void f(long v) {
        ili ili0 = this.c;
        if(ili0.f) {
            ili0.x(-4.0f);
        }
        hpn hpn0 = this.b;
        if(!jlf.f(hpn0.d, v)) {
            hpn0.d = v;
            hpn0.l(v, hpn0.e);
        }
        this.o();
    }

    @Override  // iil
    public final void g(long v) {
        if(!jlk.c(v, this.e)) {
            ili ili0 = this.c;
            if(ili0.f) {
                ili0.x(-4.0f);
            }
            this.e = v;
            this.invalidate();
        }
    }

    @Override  // iil
    public final void h(ibtw ibtw0, ibth ibth0) {
        hkm hkm0 = this.u;
        if(hkm0 != null) {
            if(!this.b.c) {
                hxt.c("layer should have been released before reuse");
            }
            this.b = hkm0.a();
            this.f = false;
            this.a = ibtw0;
            this.d = ibth0;
            this.p = false;
            this.q = false;
            this.r = true;
            hmb.c(this.g);
            float[] arr_f = this.h;
            if(arr_f != null) {
                hmb.c(arr_f);
            }
            this.n = hnd.a;
            this.s = false;
            this.e = 0x7FFFFFFF7FFFFFFFL;
            this.o = null;
            this.m = 0;
            return;
        }
        hxt.b("currently reuse is only supported when we manage the layer lifecycle");
        throw new ibnm();
    }

    @Override  // iil
    public final void i(float[] arr_f) {
        hmb.e(arr_f, this.q());
    }

    @Override  // iil
    public final void invalidate() {
        if(!this.i && !this.f) {
            this.c.invalidate();
            this.n(true);
        }
    }

    @Override  // iil
    public final void j() {
        if(this.i) {
            if(!hnd.d(this.n, hnd.a)) {
                hpn hpn0 = this.b;
                if(!jlk.c(hpn0.e, this.e)) {
                    hpn0.k(((long)Float.floatToRawIntBits(hnd.b(this.n) * ((float)(((int)(this.e & 0xFFFFFFFFL)))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(hnd.a(this.n) * ((float)(((int)(this.e >> 0x20)))))) << 0x20);
                }
            }
            this.b.i(this.j, this.k, this.e, this.t);
            this.n(false);
        }
    }

    @Override  // iil
    public final void k(hmr hmr0) {
        int v = hmr0.a | this.m;
        this.k = hmr0.r;
        this.j = hmr0.q;
        if((v & 0x1000) != 0) {
            this.n = hmr0.l;
        }
        if((v & 1) != 0) {
            float f = hmr0.b;
            hpp hpp0 = this.b.h;
            if(hpp0.h != f) {
                hpp0.h = f;
                hpp0.c.setScaleX(f);
            }
        }
        if((v & 2) != 0) {
            float f1 = hmr0.c;
            hpp hpp1 = this.b.h;
            if(hpp1.i != f1) {
                hpp1.i = f1;
                hpp1.c.setScaleY(f1);
            }
        }
        if((v & 4) != 0) {
            this.b.j(hmr0.d);
        }
        if((v & 8) != 0) {
            float f2 = hmr0.e;
            hpp hpp2 = this.b.h;
            if(hpp2.j != f2) {
                hpp2.j = f2;
                hpp2.c.setTranslationX(f2);
            }
        }
        if((v & 16) != 0) {
            float f3 = hmr0.f;
            hpp hpp3 = this.b.h;
            if(hpp3.k != f3) {
                hpp3.k = f3;
                hpp3.c.setTranslationY(f3);
            }
        }
        boolean z = true;
        if((v & 0x20) != 0) {
            hpn hpn0 = this.b;
            float f4 = hmr0.g;
            hpp hpp4 = hpn0.h;
            if(hpp4.l != f4) {
                hpp4.l = f4;
                hpp4.c.setElevation(f4);
                hpn0.a = true;
                hpn0.e();
            }
            if((hmr0.g > 0.0f) && !this.s) {
                ibth ibth0 = this.d;
                if(ibth0 != null) {
                    ibth0.a();
                }
            }
        }
        if((v & 0x40) != 0) {
            long v1 = hmr0.h;
            hpp hpp5 = this.b.h;
            if(!ibog.c(v1, hpp5.m)) {
                hpp5.m = v1;
                int v2 = hln.b(v1);
                hpp5.c.setAmbientShadowColor(v2);
            }
        }
        if((v & 0x80) != 0) {
            long v3 = hmr0.i;
            hpp hpp6 = this.b.h;
            if(!ibog.c(v3, hpp6.n)) {
                hpp6.n = v3;
                int v4 = hln.b(v3);
                hpp6.c.setSpotShadowColor(v4);
            }
        }
        if((v & 0x400) != 0) {
            float f5 = hmr0.j;
            hpp hpp7 = this.b.h;
            if(hpp7.o != f5) {
                hpp7.o = f5;
                hpp7.c.setRotationZ(f5);
            }
        }
        if((v & 0x800) != 0) {
            float f6 = hmr0.k;
            hpp hpp8 = this.b.h;
            if(hpp8.p != f6) {
                hpp8.p = f6;
                hpp8.c.setCameraDistance(f6);
            }
        }
        if((v & 0x1000) != 0) {
            if(hnd.d(this.n, hnd.a)) {
                this.b.k(0x7FC000007FC00000L);
            }
            else {
                this.b.k(((long)Float.floatToRawIntBits(hnd.b(this.n) * ((float)(((int)(this.e & 0xFFFFFFFFL)))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(hnd.a(this.n) * ((float)(((int)(this.e >> 0x20)))))) << 0x20);
            }
        }
        if((v & 0x4000) != 0) {
            hpn hpn1 = this.b;
            boolean z1 = hmr0.n;
            if(hpn1.g != z1) {
                hpn1.g = z1;
                hpn1.a = true;
                hpn1.e();
            }
        }
        if((0x20000 & v) != 0) {
            hpp hpp9 = this.b.h;
            if(!ibuq.m(null, null)) {
                hpp9.c.setRenderEffect(null);
            }
        }
        if((0x40000 & v) != 0) {
            hpp hpp10 = this.b.h;
            if(!ibuq.m(null, null)) {
                hpp10.a().setColorFilter(null);
                hpp10.d();
            }
        }
        if((0x80000 & v) != 0) {
            int v5 = hmr0.s;
            hpp hpp11 = this.b.h;
            if(hpp11.g != v5) {
                hpp11.g = v5;
                hpp11.a().setBlendMode(hkh.a(v5));
                hpp11.d();
            }
        }
        if((0x8000 & v) != 0) {
            int v6 = 2;
            hpn hpn2 = this.b;
            int v7 = hmr0.o;
            if(v7 == 0) {
                v6 = 0;
            }
            else {
                switch(v7) {
                    case 1: {
                        v6 = 1;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Not supported composition strategy");
                    }
                }
            }
            hpp hpp12 = hpn2.h;
            if(hpp12.q != v6) {
                hpp12.q = v6;
                hpp12.d();
            }
        }
        if((v & 0x1F1B) != 0) {
            this.p = true;
            this.q = true;
        }
        if(ibuq.m(this.o, hmr0.t)) {
            z = false;
        }
        else {
            hmg hmg0 = hmr0.t;
            this.o = hmg0;
            if(hmg0 != null) {
                hpn hpn3 = this.b;
                if((hmg0 instanceof hme)) {
                    hpn3.m(((long)Float.floatToRawIntBits(((hme)hmg0).a.b)) << 0x20 | ((long)Float.floatToRawIntBits(((hme)hmg0).a.c)) & 0xFFFFFFFFL, ((long)Float.floatToRawIntBits(((hme)hmg0).a.d - ((hme)hmg0).a.b)) << 0x20 | ((long)Float.floatToRawIntBits(((hme)hmg0).a.e - ((hme)hmg0).a.c)) & 0xFFFFFFFFL, 0.0f);
                }
                else if((hmg0 instanceof hmd)) {
                    hpn3.n(((hmd)hmg0).a);
                }
                else {
                    if(!(hmg0 instanceof hmf)) {
                        throw new ibnq();
                    }
                    hks hks0 = ((hmf)hmg0).b;
                    if(hks0 == null) {
                        hpn3.m(((long)Float.floatToRawIntBits(((hmf)hmg0).a.a)) << 0x20 | ((long)Float.floatToRawIntBits(((hmf)hmg0).a.b)) & 0xFFFFFFFFL, ((long)Float.floatToRawIntBits(((hmf)hmg0).a.b())) << 0x20 | ((long)Float.floatToRawIntBits(((hmf)hmg0).a.a())) & 0xFFFFFFFFL, Float.intBitsToFloat(((int)(((hmf)hmg0).a.h >> 0x20))));
                    }
                    else {
                        hpn3.n(hks0);
                    }
                }
                if((hmg0 instanceof hmd) && Build.VERSION.SDK_INT < 33) {
                    ibth ibth1 = this.d;
                    if(ibth1 != null) {
                        ibth1.a();
                    }
                }
            }
        }
        this.m = hmr0.a;
        if(v != 0 || z) {
            this.o();
        }
    }

    @Override  // iil
    public final boolean l(long v) {
        float f = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        hpn hpn0 = this.b;
        if(hpn0.g) {
            hmg hmg0 = hpn0.c();
            if((hmg0 instanceof hme)) {
                hka hka0 = ((hme)hmg0).a;
                return hka0.b <= f && f < hka0.d && hka0.c <= f1 && f1 < hka0.e;
            }
            if((hmg0 instanceof hmf)) {
                hkc hkc0 = ((hmf)hmg0).a;
                float f2 = hkc0.a;
                if(f >= f2) {
                    float f3 = hkc0.c;
                    if(f < f3) {
                        float f4 = hkc0.b;
                        if(f1 >= f4) {
                            float f5 = hkc0.d;
                            if((f1 >= f5)) {
                                return false;
                            }
                            long v1 = hkc0.e;
                            long v2 = hkc0.f;
                            if((Float.intBitsToFloat(((int)(v1 >> 0x20))) + Float.intBitsToFloat(((int)(v2 >> 0x20))) <= hkc0.b())) {
                                long v3 = hkc0.h;
                                long v4 = hkc0.g;
                                if((Float.intBitsToFloat(((int)(v3 >> 0x20))) + Float.intBitsToFloat(((int)(v4 >> 0x20))) <= hkc0.b()) && (Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL))) <= hkc0.a()) && (Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL))) <= hkc0.a())) {
                                    float f6 = f2 + Float.intBitsToFloat(((int)(v1 >> 0x20)));
                                    float f7 = Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + f4;
                                    float f8 = f3 - Float.intBitsToFloat(((int)(v2 >> 0x20)));
                                    float f9 = Float.intBitsToFloat(((int)(v2 & 0xFFFFFFFFL))) + f4;
                                    float f10 = f3 - Float.intBitsToFloat(((int)(v4 >> 0x20)));
                                    float f11 = f5 - Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL)));
                                    float f12 = f5 - Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL)));
                                    float f13 = f2 + Float.intBitsToFloat(((int)(v3 >> 0x20)));
                                    if((f < f6) && (f1 < f7)) {
                                        return iqm.a(f, f1, v1, f6, f7);
                                    }
                                    if((f < f13) && (f1 > f12)) {
                                        return iqm.a(f, f1, v3, f13, f12);
                                    }
                                    if((f > f8) && (f1 < f9)) {
                                        return iqm.a(f, f1, v2, f8, f9);
                                    }
                                    return !(f > f10) || !(f1 > f11) ? true : iqm.a(f, f1, v4, f10, f11);
                                }
                            }
                            hks hks0 = new hks(null);
                            hmj.c(hks0, hkc0);
                            return iqm.b(hks0, f, f1);
                        }
                    }
                }
                return false;
            }
            if((hmg0 instanceof hmd)) {
                return iqm.b(((hmd)hmg0).a, f, f1);
            }
            throw new ibnq();
        }
        return true;
    }

    @Override  // iil
    public final float[] m() {
        return this.q();
    }

    private final void n(boolean z) {
        if(z != this.i) {
            this.i = z;
            ili ili0 = this.c;
            if(z) {
                if(!ili0.t) {
                    ili0.r.add(this);
                    return;
                }
                List list1 = ili0.s;
                if(list1 == null) {
                    list1 = new ArrayList();
                    ili0.s = list1;
                }
                list1.add(this);
            }
            else if(!ili0.t) {
                ili0.r.remove(this);
                List list0 = ili0.s;
                if(list0 != null) {
                    list0.remove(this);
                }
            }
        }
    }

    private final void o() {
        ili ili0 = this.c;
        ViewParent viewParent0 = ili0.getParent();
        if(viewParent0 != null) {
            viewParent0.onDescendantInvalidated(ili0, ili0);
        }
    }

    private final float[] p() {
        float[] arr_f = this.h;
        if(arr_f == null) {
            arr_f = hmb.f();
            this.h = arr_f;
        }
        if(!this.q) {
            return Float.isNaN(arr_f[0]) ? null : arr_f;
        }
        this.q = false;
        float[] arr_f1 = this.q();
        if(this.r) {
            return arr_f1;
        }
        if(!ipx.a(arr_f1, arr_f)) {
            arr_f[0] = NaNf;
            return null;
        }
        return arr_f;
    }

    private final float[] q() {
        if(this.p) {
            long v = (0x7FFFFFFF7FFFFFFFL & this.b.f) == 0x7FC000007FC00000L ? hkg.a(jll.b(this.e)) : this.b.f;
            float f = Float.intBitsToFloat(((int)(v >> 0x20)));
            float f1 = (float)Math.sin(0.0);
            float f2 = (float)Math.cos(0.0);
            float f3 = this.b.h.k * f2;
            float f4 = this.b.h.k * f1;
            float f5 = (float)Math.sin(0.0);
            float f6 = (float)Math.cos(0.0);
            float f7 = this.b.h.j * f6;
            float f8 = Float.intBitsToFloat(((int)(0xFFFFFFFFL & v)));
            double f9 = ((double)this.b.h.o) * 0.017453;
            float f10 = (float)Math.sin(f9);
            float f11 = -this.b.h.j;
            float f12 = (float)Math.cos(f9);
            float f13 = f1 * f5;
            float f14 = (f12 * f6 + f10 * f13) * this.b.h.h;
            float f15 = f10 * f2 * this.b.h.h;
            float f16 = f1 * f6;
            float f17 = (f12 * -f5 + f10 * f16) * this.b.h.h;
            float f18 = (-f10 * f6 + f13 * f12) * this.b.h.i;
            float f19 = f2 * f12 * this.b.h.i;
            float f20 = (-f10 * -f5 + f12 * f16) * this.b.h.i;
            this.g[0] = f14;
            this.g[1] = f15;
            this.g[2] = f17;
            this.g[3] = 0.0f;
            this.g[4] = f18;
            this.g[5] = f19;
            this.g[6] = f20;
            this.g[7] = 0.0f;
            this.g[8] = f2 * f5;
            this.g[9] = -f1;
            this.g[10] = f2 * f6;
            this.g[11] = 0.0f;
            float f21 = f4 + f2;
            this.g[12] = f14 * -f - f18 * f8 + (f7 + f21 * f5) + f;
            this.g[13] = f15 * -f - f8 * f19 + (f3 - f1) + f8;
            this.g[14] = -f * f17 - f20 * f8 + (f11 * f5 + f21 * f6);
            this.g[15] = 1.0f;
            this.p = false;
            this.r = hmc.a(this.g);
        }
        return this.g;
    }
}

