import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class cqq extends iep implements huh, hun, iek, iid, ijc, ije, ijm {
    private long E;
    private hjz F;
    private der G;
    private dgg H;
    private boolean I;
    private final Object J;
    public static final cpz a;
    public dgg b;
    public boolean c;
    public ibth d;
    public ctp e;
    public dgj f;
    public dgc g;
    public dgj h;
    public iced i;
    public hxj j;
    public final byd k;
    private ctp l;
    private boolean m;
    private String n;
    private its o;
    private final csu p;
    private iem q;

    static {
        cqq.a = new cpz();
    }

    public cqq(dgg dgg0, ctp ctp0, boolean z, boolean z1, String s, its its0, ibth ibth0) {
        this.b = dgg0;
        this.l = ctp0;
        this.m = z;
        this.n = s;
        this.o = its0;
        this.c = z1;
        this.d = ibth0;
        this.p = new csu(this.b, 0, new cqc(this));
        this.k = new byd(null);
        this.E = 0L;
        this.H = this.b;
        this.I = this.U();
        this.J = cqq.a;
    }

    @Override  // hun
    public final boolean A(KeyEvent keyEvent0) {
        return false;
    }

    @Override  // ijc
    public final boolean B() {
        return false;
    }

    public abstract hxj C();

    @Override  // huh
    public final boolean D(hue hue0) {
        float f;
        this.k();
        if(this.c) {
            if(this.G == null) {
                this.G = new der();
            }
            int v = hue0.c;
            int v1 = hue0.d;
            der der0 = this.G;
            ibuq.c(der0);
            long v2 = der0.a(hue0, null);
            if(v != 1) {
                switch(v) {
                    case 2: {
                        hjz hjz0 = this.F;
                        if(hjz0 != null) {
                            this.i(hjz0.a, true);
                            this.d.a();
                            this.F = null;
                            return true;
                        }
                        break;
                    }
                    case 3: {
                        hjz hjz1 = this.F;
                        if(hjz1 != null) {
                            long v3 = hjz.c(v2, hjz1.a);
                            if(v1 == 1) {
                                f = Float.intBitsToFloat(((int)(v3 >> 0x20)));
                            }
                            else {
                                f = v1 == 2 ? Float.intBitsToFloat(((int)(0xFFFFFFFFL & v3))) : hjz.a(v3);
                            }
                            if((Math.abs(f) > ((iqy)iel.a(this, ipa.m)).d())) {
                                this.F = null;
                                this.h(true);
                                return false;
                            }
                        }
                        break;
                    }
                    default: {
                        this.h(true);
                        this.F = null;
                        return false;
                    }
                }
            }
            else if(this.F == null) {
                this.F = new hjz(v2);
                this.j(v2, true);
                return false;
            }
        }
        return false;
    }

    @Override  // ijc
    public final void E() {
    }

    protected abstract void F(KeyEvent arg1);

    protected abstract void G(KeyEvent arg1);

    @Override  // huh
    public final void H() {
    }

    private final boolean U() {
        return this.H == null;
    }

    @Override  // hfb
    public final void dH() {
        ijb.a(this);
    }

    @Override  // ije
    public final void dJ(ivj ivj0) {
        its its0 = this.o;
        if(its0 != null) {
            ivf.p(ivj0, its0.a);
        }
        ivf.f(ivj0, this.n, new cpy(this));
        if(this.c) {
            this.p.dJ(ivj0);
        }
        else {
            ivf.b(ivj0);
        }
        this.e(ivj0);
    }

    @Override  // ijm
    public final Object dK() {
        return this.J;
    }

    @Override  // hfb
    public final void dO() {
        this.o();
        if(!this.I) {
            this.k();
        }
        if(this.c) {
            this.T(this.p);
        }
    }

    @Override  // ijc
    public final long dQ() {
        return ijk.a;
    }

    @Override  // hfb
    public final void dR() {
        this.g();
        if(this.H == null) {
            this.b = null;
        }
        iem iem0 = this.q;
        if(iem0 != null) {
            this.S(iem0);
        }
        this.q = null;
    }

    public void e(ivj ivj0) {
    }

    protected final void g() {
        dgg dgg0 = this.b;
        if(dgg0 != null) {
            dgj dgj0 = this.f;
            if(dgj0 != null) {
                dgg0.c(new dgi(dgj0));
            }
            dgj dgj1 = this.h;
            if(dgj1 != null) {
                dgg0.c(new dgi(dgj1));
            }
            dgc dgc0 = this.g;
            if(dgc0 != null) {
                dgg0.c(new dgd(dgc0));
            }
            Object[] arr_object = this.k.c;
            long[] arr_v = this.k.a;
            int v = arr_v.length - 2;
            if(v < 0) {
                goto label_30;
            }
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
                            dgg0.c(new dgi(((dgj)arr_object[(v1 << 3) + v3])));
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_27;
                    }
                    break;
                }
            label_27:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    label_30:
        this.f = null;
        this.h = null;
        this.F = null;
        this.g = null;
        this.k.d();
    }

    protected final void h(boolean z) {
        dgg dgg0 = this.b;
        if(dgg0 != null) {
            if(this.i != null && this.i.y()) {
                iced iced0 = this.i;
                if(iced0 != null) {
                    iceb.a(iced0);
                }
            }
            else {
                dgj dgj0 = z ? this.h : this.f;
                if(dgj0 != null) {
                    icbb.b(this.J(), null, null, new cqf(dgj0, dgg0, null), 3);
                }
            }
            if(z) {
                this.h = null;
                return;
            }
            this.f = null;
        }
    }

    protected final void i(long v, boolean z) {
        cqq cqq0;
        dgg dgg0 = this.b;
        if(dgg0 != null) {
            if(this.i != null && this.i.y()) {
                cqq0 = this;
                icbb.b(this.J(), null, null, new cqg(cqq0, v, dgg0, null), 3);
            }
            else {
                cqq0 = this;
                dgj dgj0 = z ? cqq0.h : cqq0.f;
                if(dgj0 != null) {
                    icbb.b(cqq0.J(), null, null, new cqh(dgj0, dgg0, null), 3);
                }
            }
            if(z) {
                cqq0.h = null;
                return;
            }
            cqq0.f = null;
        }
    }

    protected final void j(long v, boolean z) {
        dgg dgg0 = this.b;
        if(dgg0 != null) {
            dgj dgj0 = new dgj(v);
            if(this.u()) {
                this.i = icbb.b(this.J(), null, null, new cqi(dgg0, dgj0, z, this, null), 3);
                return;
            }
            if(z) {
                this.h = dgj0;
            }
            else {
                this.f = dgj0;
            }
            icbb.b(this.J(), null, null, new cqj(dgg0, dgj0, null), 3);
        }
    }

    public final void k() {
        if(this.q == null) {
            ctp ctp0 = this.m ? this.e : this.l;
            if(ctp0 != null) {
                if(this.b == null) {
                    this.b = new dgh();
                }
                this.p.i(this.b);
                dgg dgg0 = this.b;
                ibuq.c(dgg0);
                iem iem0 = ctp0.a(dgg0);
                this.T(iem0);
                this.q = iem0;
            }
        }
    }

    protected void l() {
    }

    @Override  // ijc
    public void n() {
        dgg dgg0 = this.b;
        if(dgg0 != null) {
            dgc dgc0 = this.g;
            if(dgc0 != null) {
                dgg0.c(new dgd(dgc0));
            }
        }
        this.g = null;
        hxj hxj0 = this.j;
        if(hxj0 != null) {
            hxj0.n();
        }
    }

    @Override  // iid
    public final void o() {
        if(this.m) {
            iie.a(this, new cpx(this));
        }
    }

    @Override  // ijc
    public void q(hvt hvt0, hvv hvv0, long v) {
        long v1 = v << 0x20 >> 33 & 0xFFFFFFFFL | v >> 33 << 0x20;
        this.E = ((long)Float.floatToRawIntBits(jlf.b(v1))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jlf.a(v1))) << 0x20;
        this.k();
        if(this.c && hvv0 == hvv.b) {
            int v2 = hvt0.e;
            if(v2 == 4) {
                icbb.b(this.J(), null, null, new cqo(this, null), 3);
            }
            else if(v2 == 5) {
                icbb.b(this.J(), null, null, new cqp(this, null), 3);
            }
        }
        if(this.j == null) {
            hxj hxj0 = this.C();
            if(hxj0 != null) {
                this.T(hxj0);
                this.j = hxj0;
            }
        }
        hxj hxj1 = this.j;
        if(hxj1 != null) {
            hxj1.q(hvt0, hvv0, v);
        }
    }

    @Override  // ijc
    public final void r() {
        ijb.b(this);
    }

    public final void s() {
        iem iem0 = this.q;
        if(iem0 == null && this.I) {
            return;
        }
        if(iem0 != null) {
            this.S(iem0);
        }
        this.q = null;
        this.k();
    }

    public final void t(dgg dgg0, ctp ctp0, boolean z, boolean z1, String s, its its0, ibth ibth0) {
        int v1;
        int v = 1;
        if(ibuq.m(this.H, dgg0)) {
            v1 = 0;
        }
        else {
            this.g();
            this.H = dgg0;
            this.b = dgg0;
            v1 = 1;
        }
        if(!ibuq.m(this.l, ctp0)) {
            this.l = ctp0;
            v1 = 1;
        }
        if(this.m == z) {
            v = v1;
        }
        else {
            this.m = z;
            if(z) {
                this.o();
            }
        }
        if(this.c != z1) {
            if(z1) {
                this.T(this.p);
            }
            else {
                this.S(this.p);
                this.g();
            }
            ijf.a(this);
            this.c = z1;
        }
        if(!ibuq.m(this.n, s)) {
            this.n = s;
            ijf.a(this);
        }
        if(!ibuq.m(this.o, its0)) {
            this.o = its0;
            ijf.a(this);
        }
        this.d = ibth0;
        if(this.I == this.U()) {
        label_38:
            if(v != 0) {
                this.s();
            }
        }
        else {
            boolean z2 = this.U();
            this.I = z2;
            if(!z2 && this.q == null) {
                this.s();
                goto label_40;
            }
            goto label_38;
        }
    label_40:
        this.p.i(this.b);
    }

    public final boolean u() {
        ibuz ibuz0 = new ibuz();
        crq crq0 = new crq(ibuz0);
        ijn.c(this, dch.a, crq0);
        if(!ibuz0.a) {
            for(ViewParent viewParent0 = ieo.a(this).getParent(); viewParent0 != null && (viewParent0 instanceof ViewGroup); viewParent0 = ((ViewGroup)viewParent0).getParent()) {
                if(((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override  // hfb
    public final boolean v() {
        return false;
    }

    @Override  // ije
    public final boolean w() {
        return false;
    }

    @Override  // ije
    public final boolean x() {
        return true;
    }

    @Override  // ije
    public final boolean y() {
        return true;
    }

    @Override  // hun
    public final boolean z(KeyEvent keyEvent0) {
        boolean z;
        this.k();
        long v = hul.b(keyEvent0);
        if(this.c && huk.a(hul.a(keyEvent0), 2) && cru.b(keyEvent0)) {
            byd byd0 = this.k;
            if(byd0.b(v)) {
                z = false;
            }
            else {
                dgj dgj0 = new dgj(this.E);
                byd0.e(v, dgj0);
                if(this.b != null) {
                    icbb.b(this.J(), null, null, new cqm(this, dgj0, null), 3);
                }
                z = true;
            }
            this.G(keyEvent0);
            return z;
        }
        if(this.c && huk.a(hul.a(keyEvent0), 1) && cru.b(keyEvent0)) {
            dgj dgj1 = (dgj)this.k.c(v);
            if(dgj1 != null) {
                if(this.b != null) {
                    icbb.b(this.J(), null, null, new cqn(this, dgj1, null), 3);
                }
                this.F(keyEvent0);
            }
            return dgj1 != null;
        }
        return false;
    }
}

