import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class jro {
    public int A;
    public float B;
    int C;
    float D;
    public final int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final jrn K;
    public final jrn L;
    public final jrn M;
    public final jrn N;
    public final jrn O;
    final jrn P;
    final jrn Q;
    public final jrn R;
    public final jrn[] S;
    protected final ArrayList T;
    public final boolean[] U;
    public jro V;
    int W;
    public int X;
    public float Y;
    public int Z;
    private boolean a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public float af;
    public float ag;
    public Object ah;
    public int ai;
    public String aj;
    public int ak;
    public int al;
    public final float[] am;
    protected final jro[] an;
    protected final jro[] ao;
    public int ap;
    public int aq;
    public final int[] ar;
    public boolean e;
    public jrz f;
    public jrz g;
    public jsi h;
    public jsk i;
    public final boolean[] j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public int w;
    public int x;
    public float y;
    public int z;

    public jro() {
        this.e = false;
        this.h = null;
        this.i = null;
        this.j = new boolean[]{true, true};
        this.k = true;
        this.l = -1;
        this.m = -1;
        new HashMap();
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = new int[2];
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.F = NaNf;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        jrn jrn0 = new jrn(this, 2);
        this.K = jrn0;
        jrn jrn1 = new jrn(this, 3);
        this.L = jrn1;
        jrn jrn2 = new jrn(this, 4);
        this.M = jrn2;
        jrn jrn3 = new jrn(this, 5);
        this.N = jrn3;
        jrn jrn4 = new jrn(this, 6);
        this.O = jrn4;
        jrn jrn5 = new jrn(this, 8);
        this.P = jrn5;
        jrn jrn6 = new jrn(this, 9);
        this.Q = jrn6;
        jrn jrn7 = new jrn(this, 7);
        this.R = jrn7;
        this.S = new jrn[]{jrn0, jrn2, jrn1, jrn3, jrn4, jrn7};
        ArrayList arrayList0 = new ArrayList();
        this.T = arrayList0;
        this.U = new boolean[2];
        this.ar = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ai = 0;
        this.aj = null;
        this.ak = 0;
        this.al = 0;
        this.am = new float[]{-1.0f, -1.0f};
        this.an = new jro[]{0, 0};
        this.ao = new jro[]{0, 0};
        this.ap = -1;
        this.aq = -1;
        arrayList0.add(jrn0);
        arrayList0.add(jrn1);
        arrayList0.add(jrn2);
        arrayList0.add(jrn3);
        arrayList0.add(jrn5);
        arrayList0.add(jrn6);
        arrayList0.add(jrn7);
        arrayList0.add(jrn4);
    }

    public final void A(int v) {
        this.X = v;
        int v1 = this.ae;
        if(v < v1) {
            this.X = v1;
        }
    }

    protected final void B(int v, boolean z) {
        this.U[v] = z;
    }

    public final void C(int v, int v1) {
        this.I = v;
        this.J = v1;
        this.k = false;
    }

    public final void D(int v) {
        if(v < 0) {
            this.ae = 0;
            return;
        }
        this.ae = v;
    }

    public final void E(int v) {
        if(v < 0) {
            this.ad = 0;
            return;
        }
        this.ad = v;
    }

    public final void F(int v) {
        this.W = v;
        int v1 = this.ad;
        if(v < v1) {
            this.W = v1;
        }
    }

    public void G(boolean z, boolean z1) {
        int v = ((int)z) & this.h.h;
        int v1 = ((int)z1) & this.i.h;
        int v2 = this.h.i.f;
        int v3 = this.i.i.f;
        int v4 = this.h.j.f;
        int v5 = this.i.j.f;
        if(v4 - v2 < 0 || v5 - v3 < 0 || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF) || (v4 == 0x80000000 || v4 == 0x7FFFFFFF) || (v5 == 0x80000000 || v5 == 0x7FFFFFFF)) {
            v4 = 0;
            v5 = 0;
            v2 = 0;
            v3 = 0;
        }
        if(v != 0) {
            this.aa = v2;
        }
        if(v1 != 0) {
            this.ab = v3;
        }
        if(this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if(v != 0) {
            int v6 = v4 - v2;
            if(this.ar[0] == 1) {
                int v7 = this.W;
                if(v6 < v7) {
                    v6 = v7;
                }
            }
            this.W = v6;
            int v8 = this.ad;
            if(v6 < v8) {
                this.W = v8;
            }
        }
        if(v1 != 0) {
            int v9 = v5 - v3;
            if(this.ar[1] == 1) {
                int v10 = this.X;
                if(v9 < v10) {
                    v9 = v10;
                }
            }
            this.X = v9;
            int v11 = this.ae;
            if(v9 < v11) {
                this.X = v11;
            }
        }
    }

    final boolean H() {
        return (this instanceof jrv) || (this instanceof jrs);
    }

    public final boolean I(int v) {
        return v == 0 ? (this.K.e == null ? 0 : 1) + (this.M.e == null ? 0 : 1) < 2 : (this.L.e == null ? 0 : 1) + (this.N.e == null ? 0 : 1) + (this.O.e == null ? 0 : 1) < 2;
    }

    public final boolean J(int v, int v1) {
        if(v == 0) {
            jrn jrn0 = this.K;
            if(jrn0.e != null && jrn0.e.c) {
                jrn jrn1 = this.M;
                jrn jrn2 = jrn1.e;
                if(jrn2 != null && jrn2.c) {
                    int v2 = jrn0.b();
                    return jrn2.a() - jrn1.b() - (jrn0.e.a() + v2) >= v1;
                }
            }
        }
        else {
            jrn jrn3 = this.L;
            if(jrn3.e != null && jrn3.e.c) {
                jrn jrn4 = this.N;
                jrn jrn5 = jrn4.e;
                if(jrn5 != null && jrn5.c) {
                    int v3 = jrn3.b();
                    return jrn5.a() - jrn4.b() - (jrn3.e.a() + v3) >= v1;
                }
            }
        }
        return false;
    }

    public final boolean K() {
        jrn jrn0 = this.K.e;
        if(jrn0 == null || jrn0.e != this.K) {
            jrn jrn1 = this.M.e;
            return jrn1 != null && jrn1.e == this.M;
        }
        return true;
    }

    public final boolean L() {
        jrn jrn0 = this.L.e;
        if(jrn0 == null || jrn0.e != this.L) {
            jrn jrn1 = this.N.e;
            return jrn1 != null && jrn1.e == this.N;
        }
        return true;
    }

    public final boolean M() {
        return this.k && this.ai != 8;
    }

    public jrn N(int v) {
        switch(v - 1) {
            case 1: {
                return this.K;
            }
            case 2: {
                return this.L;
            }
            case 3: {
                return this.M;
            }
            case 4: {
                return this.N;
            }
            case 5: {
                return this.O;
            }
            case 6: {
                return this.R;
            }
            case 7: {
                return this.P;
            }
            default: {
                return this.Q;
            }
        }
    }

    public final int O(int v) {
        return v == 0 ? this.P() : this.Q();
    }

    public final int P() {
        return this.ar[0];
    }

    public final int Q() {
        return this.ar[1];
    }

    public final void R(int v, jro jro0, int v1, int v2) {
        int v4;
        boolean z1;
        int v3 = 4;
        if(v == 7) {
            if(v1 != 7) {
                goto label_34;
            }
            jrn jrn0 = this.N(2);
            jrn jrn1 = this.N(4);
            jrn jrn2 = this.N(3);
            jrn jrn3 = this.N(5);
            boolean z = true;
            if(jrn0 != null && jrn0.j()) {
                z1 = false;
            }
            else if(jrn1 == null || !jrn1.j()) {
                this.R(2, jro0, 2, 0);
                this.R(4, jro0, 4, 0);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(jrn2 != null && jrn2.j()) {
                z = false;
            }
            else if(jrn3 == null || !jrn3.j()) {
                this.R(3, jro0, 3, 0);
                this.R(5, jro0, 5, 0);
            }
            else {
                z = false;
            }
            if(z1 && z) {
                this.N(7).l(jro0.N(7), 0);
                return;
            }
            if(z1) {
                this.N(8).l(jro0.N(8), 0);
                return;
            }
            if(z) {
                this.N(9).l(jro0.N(9), 0);
                return;
            label_34:
                switch(v1) {
                    case 2: {
                        v1 = 2;
                        this.R(2, jro0, v1, 0);
                        this.R(4, jro0, v1, 0);
                        this.N(7).l(jro0.N(v1), 0);
                        return;
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        this.R(2, jro0, v1, 0);
                        this.R(4, jro0, v1, 0);
                        this.N(7).l(jro0.N(v1), 0);
                        return;
                    }
                    case 5: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                this.R(3, jro0, v1, 0);
                this.R(5, jro0, v1, 0);
                this.N(7).l(jro0.N(v1), 0);
            }
        }
        else {
            if(v == 8) {
                switch(v1) {
                    case 2: {
                        v4 = 2;
                        break;
                    }
                    case 4: {
                        v4 = 4;
                        break;
                    }
                    default: {
                        v = 8;
                        goto label_60;
                    }
                }
                jrn jrn4 = this.N(2);
                jrn jrn5 = jro0.N(v4);
                jrn jrn6 = this.N(4);
                jrn4.l(jrn5, 0);
                jrn6.l(jrn5, 0);
                this.N(8).l(jrn5, 0);
                return;
            }
        label_60:
            if(v == 9 && (v1 == 3 || v1 == 5)) {
                jrn jrn7 = jro0.N(v1);
                this.N(3).l(jrn7, 0);
                this.N(5).l(jrn7, 0);
                this.N(9).l(jrn7, 0);
                return;
            }
            if(v == 8 && v1 == 8) {
                this.N(2).l(jro0.N(2), 0);
                this.N(4).l(jro0.N(4), 0);
                this.N(8).l(jro0.N(8), 0);
                return;
            }
            if(v == 9 && v1 == 9) {
                this.N(3).l(jro0.N(3), 0);
                this.N(5).l(jro0.N(5), 0);
                this.N(9).l(jro0.N(9), 0);
                return;
            }
            jrn jrn8 = this.N(v);
            jrn jrn9 = jro0.N(v1);
            if(jrn8.k(jrn9)) {
                if(v == 6) {
                    jrn jrn10 = this.N(3);
                    jrn jrn11 = this.N(5);
                    if(jrn10 != null) {
                        jrn10.e();
                    }
                    if(jrn11 != null) {
                        jrn11.e();
                    }
                }
                else if(v != 3 && v != 5) {
                    switch(v) {
                        case 2: {
                            v3 = 2;
                            break;
                        }
                        case 4: {
                            break;
                        }
                        default: {
                            goto label_111;
                        }
                    }
                    jrn jrn12 = this.N(7);
                    if(jrn12.e != jrn9) {
                        jrn12.e();
                    }
                    jrn jrn13 = this.N(v3).c();
                    jrn jrn14 = this.N(8);
                    if(jrn14.j()) {
                        jrn13.e();
                        jrn14.e();
                    }
                }
                else {
                    jrn jrn15 = this.N(6);
                    if(jrn15 != null) {
                        jrn15.e();
                    }
                    jrn jrn16 = this.N(7);
                    if(jrn16.e != jrn9) {
                        jrn16.e();
                    }
                    jrn jrn17 = this.N(v).c();
                    jrn jrn18 = this.N(9);
                    if(jrn18.j()) {
                        jrn17.e();
                        jrn18.e();
                    }
                }
            label_111:
                jrn8.l(jrn9, v2);
            }
        }
    }

    public final void S(int v, jro jro0, int v1, int v2, int v3) {
        this.N(v).n(jro0.N(v1), v2, v3, true);
    }

    public final void T(int v) {
        this.ar[0] = v;
    }

    public final void U(int v) {
        this.ar[1] = v;
    }

    public void V(boolean z) {
        int v = jrd.o(this.K);
        int v1 = jrd.o(this.L);
        int v2 = jrd.o(this.M);
        int v3 = jrd.o(this.N);
        if(z) {
            jsi jsi0 = this.h;
            if(jsi0 != null) {
                jsc jsc0 = jsi0.i;
                if(jsc0.i) {
                    jsc jsc1 = jsi0.j;
                    if(jsc1.i) {
                        v = jsc0.f;
                        v2 = jsc1.f;
                    }
                }
            }
        }
        if(z) {
            jsk jsk0 = this.i;
            if(jsk0 != null) {
                jsc jsc2 = jsk0.i;
                if(jsc2.i) {
                    jsc jsc3 = jsk0.j;
                    if(jsc3.i) {
                        v1 = jsc2.f;
                        v3 = jsc3.f;
                    }
                }
            }
        }
        if(v2 - v < 0 || v3 - v1 < 0 || (v == 0x80000000 || v == 0x7FFFFFFF) || (v1 == 0x80000000 || v1 == 0x7FFFFFFF) || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF)) {
            v = 0;
            v1 = 0;
            v2 = 0;
            v3 = 0;
        }
        this.aa = v;
        this.ab = v1;
        if(this.ai == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int v4 = v2 - v;
        int[] arr_v = this.ar;
        int v5 = arr_v[0];
        if(v5 == 1) {
            int v6 = this.W;
            if(v4 < v6) {
                v4 = v6;
            }
            v5 = 1;
        }
        int v7 = v3 - v1;
        if(arr_v[1] == 1) {
            int v8 = this.X;
            if(v7 < v8) {
                v7 = v8;
            }
        }
        this.W = v4;
        this.X = v7;
        int v9 = this.ae;
        if(v7 < v9) {
            this.X = v9;
        }
        int v10 = this.ad;
        if(v4 < v10) {
            this.W = v10;
        }
        else {
            v10 = v4;
        }
        int v11 = this.x;
        if(v11 > 0 && v5 == 3) {
            this.W = Math.min(v10, v11);
        }
        int v12 = this.A;
        if(v12 > 0 && arr_v[1] == 3) {
            this.X = Math.min(this.X, v12);
        }
        int v13 = this.W;
        if(v4 != v13) {
            this.l = v13;
        }
        int v14 = this.X;
        if(v7 != v14) {
            this.m = v14;
        }
    }

    private final boolean a(int v) {
        jrn[] arr_jrn = this.S;
        int v1 = v + v;
        jrn jrn0 = arr_jrn[v1];
        if(jrn0.e != null && jrn0.e.e != jrn0) {
            jrn jrn1 = arr_jrn[v1 + 1];
            return jrn1.e != null && jrn1.e.e == jrn1;
        }
        return false;
    }

    public void b(jrd jrd0, boolean z) {
        jrd jrd2;
        jri jri21;
        jri jri20;
        jrn jrn13;
        boolean z18;
        jri jri18;
        jri jri17;
        jri jri16;
        boolean z17;
        jrn jrn12;
        boolean z16;
        int v26;
        int[] arr_v1;
        boolean z14;
        int v25;
        jri jri13;
        boolean z13;
        jri jri12;
        jri jri11;
        jrn jrn11;
        boolean z12;
        jrn jrn10;
        jrn jrn9;
        boolean z11;
        jri jri10;
        jri jri9;
        jrn jrn8;
        int v22;
        int v21;
        boolean z7;
        int v20;
        int v19;
        int v18;
        jri jri7;
        int v17;
        float f1;
        int v15;
        jrn jrn6;
        int v14;
        int v13;
        int v12;
        jri jri6;
        boolean z6;
        jri jri5;
        boolean z5;
        boolean z4;
        boolean z3;
        jro jro3;
        jrn jrn5;
        boolean z2;
        boolean z1;
        jrd jrd1 = jrd0;
        jrn jrn0 = this.K;
        jrn jrn1 = this.L;
        jri jri0 = jrd1.b(jrn0);
        jrn jrn2 = this.M;
        jri jri1 = jrd1.b(jrn2);
        jri jri2 = jrd1.b(jrn1);
        jrn jrn3 = this.N;
        jri jri3 = jrd1.b(jrn3);
        jrn jrn4 = this.O;
        jri jri4 = jrd1.b(jrn4);
        jro jro0 = this.V;
        if(jro0 == null) {
            jrn5 = jrn4;
            z2 = false;
            z1 = false;
        }
        else {
            z1 = jro0.ar[0] == 2;
            z2 = jro0.ar[1] == 2;
            jrn5 = jrn4;
            int v = this.s;
            switch(v) {
                case 1: {
                    z2 = false;
                    break;
                }
                case 2: {
                    z1 = false;
                    break;
                }
                default: {
                    if(v == 3) {
                        z2 = false;
                        z1 = false;
                    }
                }
            }
        }
        if(this.ai == 8) {
            ArrayList arrayList0 = this.T;
            int v1 = arrayList0.size();
            int v2 = 0;
            while(v2 < v1) {
                if(((jrn)arrayList0.get(v2)).i()) {
                    goto label_39;
                }
                ++v2;
            }
            if(!this.U[0] && !this.U[1]) {
                return;
            }
        }
    label_39:
        if(this.a) {
            jrd1.f(jri0, this.aa);
            jrd1.f(jri1, this.aa + this.W);
            if(z1) {
                jro jro1 = this.V;
                if(jro1 != null) {
                    WeakReference weakReference0 = ((jrp)jro1).aD;
                    if(weakReference0 == null || weakReference0.get() == null || jrn0.a() > ((jrn)((jrp)jro1).aD.get()).a()) {
                        ((jrp)jro1).aD = new WeakReference(jrn0);
                    }
                    WeakReference weakReference1 = ((jrp)jro1).aF;
                    if(weakReference1 == null || weakReference1.get() == null || jrn2.a() > ((jrn)((jrp)jro1).aF.get()).a()) {
                        ((jrp)jro1).aF = new WeakReference(jrn2);
                    }
                }
            }
        label_53:
            if(this.n) {
                jrd1.f(jri2, this.ab);
                jrd1.f(jri3, this.ab + this.X);
                if(jrn5.i()) {
                    jrd1.f(jri4, this.ab + this.ac);
                }
                if(z2) {
                    jro jro2 = this.V;
                    if(jro2 != null) {
                        WeakReference weakReference2 = ((jrp)jro2).aC;
                        if(weakReference2 == null || weakReference2.get() == null || jrn1.a() > ((jrn)((jrp)jro2).aC.get()).a()) {
                            ((jrp)jro2).aC = new WeakReference(jrn1);
                        }
                        WeakReference weakReference3 = ((jrp)jro2).aE;
                        if(weakReference3 == null || weakReference3.get() == null || jrn3.a() > ((jrn)((jrp)jro2).aE.get()).a()) {
                            ((jrp)jro2).aE = new WeakReference(jrn3);
                        }
                    }
                }
            }
            if(this.a && this.n) {
                jro3 = this;
            }
            else {
            label_70:
                if(z) {
                    jsi jsi0 = this.h;
                    if(jsi0 == null) {
                        z3 = z2;
                        goto label_99;
                    }
                    else {
                        jsk jsk0 = this.i;
                        if(jsk0 == null) {
                            z3 = z2;
                            goto label_99;
                        }
                        else {
                            jsc jsc0 = jsi0.i;
                            z3 = z2;
                            if(jsc0.i && jsi0.j.i && jsk0.i.i && jsk0.j.i) {
                                jrd1.f(jri0, jsc0.f);
                                jrd1.f(jri1, this.h.j.f);
                                jrd1.f(jri2, this.i.i.f);
                                jrd1.f(jri3, this.i.j.f);
                                jrd1.f(jri4, this.i.a.f);
                                if(this.V != null) {
                                    if(z1 && this.j[0] && !this.K()) {
                                        jrd1.g(jrd1.b(this.V.M), jri1, 0, 8);
                                    }
                                    if(z3 && this.j[1] && !this.L()) {
                                        jrd1.g(jrd1.b(this.V.N), jri3, 0, 8);
                                    }
                                }
                                jro3 = this;
                            }
                            else {
                                goto label_99;
                            }
                        }
                    }
                }
                else {
                    z3 = z2;
                label_99:
                    if(this.V == null) {
                        jri5 = jri2;
                        z6 = false;
                        z5 = false;
                    }
                    else {
                        if(this.a(0)) {
                            ((jrp)this.V).a(this, 0);
                            z4 = true;
                        }
                        else {
                            z4 = this.K();
                        }
                        if(this.a(1)) {
                            ((jrp)this.V).a(this, 1);
                            z5 = true;
                        }
                        else {
                            z5 = this.L();
                        }
                        if(!z4 && z1 && this.ai != 8 && jrn0.e == null && jrn2.e == null) {
                            jri5 = jri2;
                            jrd1.g(jrd1.b(this.V.M), jri1, 0, 1);
                        }
                        else {
                            jri5 = jri2;
                        }
                        if(z5) {
                            z6 = z4;
                        }
                        else if(z3) {
                            if(this.ai != 8 && jrn1.e == null && jrn3.e == null && jrn5 == null) {
                                jrd1.g(jrd1.b(this.V.N), jri3, 0, 1);
                            }
                            z6 = z4;
                            z3 = true;
                        }
                        else {
                            z6 = z4;
                            z3 = false;
                        }
                    }
                    int v3 = this.W;
                    int v4 = v3 < this.ad ? this.ad : v3;
                    int v5 = this.X;
                    int v6 = v5 < this.ae ? this.ae : v5;
                    int[] arr_v = this.ar;
                    int v7 = arr_v[0];
                    int v8 = arr_v[1];
                    int v9 = this.Z;
                    this.C = v9;
                    this.D = this.Y;
                    float f = this.Y;
                    int v10 = this.t;
                    int v11 = this.u;
                    if(Float.compare(f, 0.0f) > 0) {
                        jri6 = jri4;
                        if(this.ai == 8) {
                            goto label_277;
                        }
                        else {
                            if(v7 != 3) {
                                v13 = v7;
                                v12 = v10;
                            }
                            else if(v10 == 0) {
                                v12 = 3;
                                v13 = 3;
                            }
                            else {
                                v13 = 3;
                                v12 = v10;
                            }
                            if(v8 != 3) {
                                jrn6 = jrn0;
                                v15 = v8;
                                v14 = v11;
                            }
                            else if(v11 == 0) {
                                v14 = 3;
                                jrn6 = jrn0;
                                v15 = 3;
                            }
                            else {
                                jrn6 = jrn0;
                                v14 = v11;
                                v15 = 3;
                            }
                            if(v13 != 3 || v15 != 3 || v12 != 3) {
                                v22 = v12;
                                v21 = v22;
                            label_226:
                                if(v13 == 3 && v22 == 3) {
                                    this.C = 0;
                                    int v23 = (int)(f * ((float)v5));
                                    if(v15 == 3) {
                                        v17 = v14;
                                        jri7 = jri5;
                                        v4 = v23;
                                        v18 = v21;
                                        v20 = 0;
                                        v9 = 0;
                                        z7 = true;
                                        v19 = v6;
                                    }
                                    else {
                                        v17 = v14;
                                        jri7 = jri5;
                                        v4 = v23;
                                        v19 = v6;
                                        v20 = 0;
                                        v9 = 0;
                                        v18 = 4;
                                        goto label_283;
                                    }
                                }
                                else if(v15 == 3 && v14 == 3) {
                                    this.C = 1;
                                    if(v9 == -1) {
                                        f1 = 1.0f / f;
                                        this.D = f1;
                                    }
                                    else {
                                        f1 = f;
                                    }
                                    if(v13 == 3) {
                                        v17 = 3;
                                        jri7 = jri5;
                                        v18 = v21;
                                        v20 = 1;
                                        z7 = true;
                                    }
                                    else {
                                        jri7 = jri5;
                                        v18 = v21;
                                        v20 = 1;
                                        v17 = 4;
                                        z7 = false;
                                    }
                                    v19 = (int)(f1 * ((float)v3));
                                    v9 = 1;
                                }
                                else {
                                    v17 = v14;
                                    jri7 = jri5;
                                    v20 = v9;
                                    v18 = v21;
                                    z7 = true;
                                    v19 = v6;
                                }
                            }
                            else if(v14 == 3) {
                                switch(v9) {
                                    case -1: {
                                        if(v7 != 3 && v8 == 3) {
                                            this.C = 0;
                                            goto label_180;
                                        }
                                        else {
                                            if(v7 == 3 && v8 != 3) {
                                                this.C = 1;
                                                this.D = 1.0f / f;
                                            }
                                            goto label_183;
                                        }
                                        break;
                                    }
                                    case 0: {
                                    label_180:
                                        if(!jrn1.j() || !jrn3.j()) {
                                            this.C = 1;
                                        }
                                        else {
                                        label_183:
                                            if(this.C == 1 && (!jrn6.j() || !jrn2.j())) {
                                                this.C = 0;
                                            }
                                        }
                                        break;
                                    }
                                    default: {
                                        goto label_183;
                                    }
                                }
                                if(this.C == -1 && (!jrn1.j() || !jrn3.j() || !jrn6.j() || !jrn2.j())) {
                                    if(jrn1.j() && jrn3.j()) {
                                        this.C = 0;
                                    }
                                    else if(jrn6.j() && jrn2.j()) {
                                        this.D = 1.0f / this.D;
                                        this.C = 1;
                                    }
                                }
                                v9 = this.C;
                                if(v9 == -1) {
                                    int v16 = this.w;
                                    if(v16 > 0 && this.z == 0) {
                                        this.C = 0;
                                        v17 = 3;
                                        jri7 = jri5;
                                        v18 = 3;
                                        v19 = v6;
                                        v20 = 0;
                                        v9 = 0;
                                    }
                                    else {
                                        if(v16 == 0 && this.z > 0) {
                                            this.D = 1.0f / this.D;
                                            this.C = 1;
                                            v17 = 3;
                                            jri7 = jri5;
                                            v18 = 3;
                                            v19 = v6;
                                            v20 = 1;
                                            v9 = 1;
                                            goto label_219;
                                        }
                                        goto label_214;
                                    }
                                }
                                else {
                                label_214:
                                    v17 = 3;
                                    jri7 = jri5;
                                    v18 = 3;
                                    v20 = v9;
                                    v19 = v6;
                                }
                            label_219:
                                z7 = true;
                            }
                            else {
                                v21 = 3;
                                v22 = 3;
                                goto label_226;
                            }
                        }
                    }
                    else {
                        jri6 = jri4;
                    label_277:
                        jrn6 = jrn0;
                        v20 = v9;
                        jri7 = jri5;
                        v19 = v6;
                        v18 = v10;
                        v17 = v11;
                    label_283:
                        z7 = false;
                    }
                    this.v[0] = v18;
                    this.v[1] = v17;
                    boolean z8 = arr_v[0] == 2 && (this instanceof jrp);
                    if(z8) {
                        v4 = 0;
                    }
                    jrn jrn7 = this.R;
                    int v24 = jrn7.j() ^ 1;
                    boolean z9 = this.U[0];
                    boolean z10 = this.U[1];
                    jri jri8 = null;
                    if(this.q == 2 || this.a) {
                        jrn8 = jrn7;
                    label_370:
                        jri9 = jri0;
                        jri10 = jri7;
                        z11 = z5;
                        z16 = z1;
                        jrn9 = jrn5;
                        jrn10 = jrn1;
                        z12 = z6;
                        jrn11 = jrn3;
                        jri11 = jri3;
                        jri12 = jri6;
                        jri13 = jri1;
                        v25 = v24;
                        z14 = z3;
                        arr_v1 = arr_v;
                        v26 = v18;
                        z13 = z16;
                    }
                    else if(z) {
                        jsi jsi1 = this.h;
                        if(jsi1 == null) {
                            jrn8 = jrn7;
                            goto label_337;
                        }
                        else {
                            jsc jsc1 = jsi1.i;
                            jrn8 = jrn7;
                            if(jsc1.i && jsi1.j.i) {
                                jrd1.f(jri0, jsc1.f);
                                jrd1.f(jri1, this.h.j.f);
                                if(this.V == null) {
                                    goto label_370;
                                }
                                else {
                                    if(z1) {
                                        if(this.j[0] && !this.K()) {
                                            jrd1.g(jrd1.b(this.V.M), jri1, 0, 8);
                                        }
                                        jri9 = jri0;
                                        jri10 = jri7;
                                        z11 = z5;
                                        jrn9 = jrn5;
                                        jrn10 = jrn1;
                                        z12 = z6;
                                        jrn11 = jrn3;
                                        jri11 = jri3;
                                        jri12 = jri6;
                                        z13 = true;
                                    }
                                    else {
                                        jri9 = jri0;
                                        jri10 = jri7;
                                        z11 = z5;
                                        jrn9 = jrn5;
                                        jrn10 = jrn1;
                                        z12 = z6;
                                        jrn11 = jrn3;
                                        jri11 = jri3;
                                        jri12 = jri6;
                                        z13 = false;
                                    }
                                    jri13 = jri1;
                                    v25 = v24;
                                    z14 = z3;
                                    arr_v1 = arr_v;
                                    v26 = v18;
                                }
                            }
                            else {
                                goto label_337;
                            }
                        }
                    }
                    else {
                        jrn8 = jrn7;
                    label_337:
                        jri jri14 = this.V == null ? null : jrd1.b(this.V.M);
                        jri jri15 = this.V == null ? null : jrd1.b(this.V.K);
                        boolean z15 = this.j[0];
                        z12 = z6;
                        v25 = v24;
                        int v27 = arr_v[0];
                        z11 = z5;
                        int v28 = this.aa;
                        jri9 = jri0;
                        z16 = z1;
                        int v29 = this.ad;
                        int v30 = this.E[0];
                        float f2 = this.af;
                        if(arr_v[1] == 3) {
                            jrn12 = jrn5;
                            z17 = true;
                        }
                        else {
                            jrn12 = jrn5;
                            z17 = false;
                        }
                        jrn10 = jrn1;
                        jri10 = jri7;
                        jrn11 = jrn3;
                        jri11 = jri3;
                        jri12 = jri6;
                        jrn9 = jrn12;
                        jri13 = jri1;
                        z14 = z3;
                        arr_v1 = arr_v;
                        v26 = v18;
                        jrd1 = jrd0;
                        this.c(jrd1, true, z16, z14, z15, jri15, jri14, v27, z8, jrn6, jrn2, v28, v4, v29, v30, f2, z7 && (v9 == -1 || v9 == 0), z17, z12, z11, z9, v26, v17, this.w, this.x, this.y, ((boolean)v25));
                        z13 = z16;
                    }
                    if(z) {
                        jsk jsk1 = this.i;
                        if(jsk1 != null) {
                            jsc jsc2 = jsk1.i;
                            if(jsc2.i && jsk1.j.i) {
                                jri16 = jri10;
                                jrd1.f(jri16, jsc2.f);
                                jri17 = jri11;
                                jrd1.f(jri17, this.i.j.f);
                                jri18 = jri12;
                                jrd1.f(jri18, this.i.a.f);
                                jro jro4 = this.V;
                                if(jro4 != null && !z11 && z14 && this.j[1]) {
                                    jrd1.g(jrd1.b(jro4.N), jri17, 0, 8);
                                }
                                z18 = false;
                                goto label_406;
                            }
                        }
                        goto label_402;
                    }
                    else {
                    label_402:
                        jri16 = jri10;
                        jri17 = jri11;
                        jri18 = jri12;
                        z18 = true;
                    }
                label_406:
                    if(this.r != 2 && (z18 && !this.n)) {
                        boolean z19 = arr_v1[1] == 2 && (this instanceof jrp);
                        jri jri19 = this.V == null ? null : jrd1.b(this.V.N);
                        jro jro5 = this.V;
                        if(jro5 != null) {
                            jri8 = jrd1.b(jro5.L);
                        }
                        int v31 = this.ac;
                        if(v31 <= 0 && this.ai != 8) {
                            jrn13 = jrn11;
                        }
                        else if(jrn9.e == null) {
                            jrn13 = jrn11;
                            if(this.ai == 8) {
                                jrd1.m(jri18, jri16, jrn9.b(), 8);
                            }
                            else {
                                jrd1.m(jri18, jri16, v31, 8);
                            }
                        }
                        else {
                            jrd1.m(jri18, jri16, v31, 8);
                            jrd1.m(jri18, jrd1.b(jrn9.e), jrn9.b(), 8);
                            if(z14) {
                                jrn13 = jrn11;
                                jrd1.g(jri19, jrd1.b(jrn13), 0, 5);
                            }
                            else {
                                jrn13 = jrn11;
                            }
                            v25 = 0;
                        }
                        jri20 = jri16;
                        jri21 = jri17;
                        this.c(jrd0, false, z14, z13, this.j[1], jri8, jri19, arr_v1[1], z19, jrn10, jrn13, this.ab, (z19 ? 0 : v19), this.ae, this.E[1], this.ag, z7 && (v20 == -1 || v20 == 1), arr_v1[0] == 3, z11, z12, z10, v17, v26, this.z, this.A, this.B, ((boolean)v25));
                        jro3 = this;
                    }
                    else {
                        jro3 = this;
                        jri20 = jri16;
                        jri21 = jri17;
                    }
                    if(!z7) {
                    }
                    else if(jro3.C == 1) {
                        jrd0.n(jri21, jri20, jri13, jri9, jro3.D);
                    }
                    else {
                        jrd0.n(jri13, jri9, jri21, jri20, jro3.D);
                    }
                    jrd2 = jrd0;
                    if(jrn8.j()) {
                        jro jro6 = jrn8.e.d;
                        float f3 = (float)Math.toRadians(jro3.F + 90.0f);
                        int v32 = jrn8.b();
                        jri jri22 = jrd2.b(jro3.N(2));
                        jri jri23 = jrd2.b(jro3.N(3));
                        jri jri24 = jrd2.b(jro3.N(4));
                        jri jri25 = jrd2.b(jro3.N(5));
                        jri jri26 = jrd2.b(jro6.N(2));
                        jri jri27 = jrd2.b(jro6.N(3));
                        jri jri28 = jrd2.b(jro6.N(4));
                        jri jri29 = jrd2.b(jro6.N(5));
                        jrb jrb0 = jrd2.a();
                        jrb0.j(jri23, jri25, jri27, jri29, ((float)(Math.sin(f3) * ((double)v32))));
                        jrd2.e(jrb0);
                        jrb jrb1 = jrd2.a();
                        jrb1.j(jri22, jri24, jri26, jri28, ((float)(Math.cos(f3) * ((double)v32))));
                        jrd2.e(jrb1);
                    }
                }
            }
        }
        else if(this.n) {
            goto label_53;
        }
        else {
            goto label_70;
        }
        jro3.a = false;
        jro3.n = false;
    }

    private final void c(jrd jrd0, boolean z, boolean z1, boolean z2, boolean z3, jri jri0, jri jri1, int v, boolean z4, jrn jrn0, jrn jrn1, int v1, int v2, int v3, int v4, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int v5, int v6, int v7, int v8, float f1, boolean z10) {
        int v27;
        boolean z15;
        boolean z14;
        int v43;
        int v42;
        int v41;
        jri jri13;
        int v40;
        jri jri12;
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        int v34;
        int v33;
        int v32;
        int v31;
        int v30;
        int v29;
        int v50;
        int v49;
        boolean z17;
        jro jro5;
        jro jro4;
        int v48;
        jri jri14;
        int v47;
        int v46;
        jro jro3;
        int v45;
        boolean z16;
        jri jri11;
        jri jri10;
        int v26;
        int v25;
        int v22;
        jri jri9;
        jri jri8;
        int v21;
        int v20;
        boolean z13;
        jri jri7;
        int v19;
        jri jri6;
        int v13;
        int v12;
        jrd jrd1 = jrd0;
        jri jri2 = jrd1.b(jrn0);
        jri jri3 = jrd1.b(jrn1);
        jri jri4 = jrd1.b(jrn0.e);
        int v9 = jrn0.j();
        boolean z11 = jrn1.j();
        jri jri5 = jrd1.b(jrn1.e);
        boolean z12 = this.R.j();
        int v10 = z11 ? v9 + 1 : v9;
        if(z12) {
            ++v10;
        }
        int v11 = z5 ? 3 : v5;
        if(v == 0) {
            throw null;
        }
        if(v - 1 == 2) {
            v12 = v11;
            v13 = v12 == 4 ? 0 : 1;
        }
        else {
            v12 = v11;
            v13 = 0;
        }
        int v14 = this.l;
        if(v14 != -1 && z) {
            this.l = -1;
            v2 = v14;
            v13 = 0;
        }
        int v15 = this.m;
        if(v15 != -1 && !z) {
            this.m = -1;
            v13 = 0;
        }
        else {
            v15 = v2;
        }
        int v16 = this.ai;
        int v17 = v16 == 8 ? 0 : v15;
        if(z10) {
            if(v9 == 0 && !z11 && !z12) {
                jrd1.f(jri2, v1);
            }
            else if(v9 != 0 && !z11) {
                jrd1.m(jri2, jri4, jrn0.b(), 8);
            }
        }
        int v18 = (v16 == 8 ? 0 : 1) & v13;
        if(v18 == 0) {
            if(z4) {
                jri6 = jri4;
                jrd1.m(jri3, jri2, 0, 3);
                if(v3 > 0) {
                    jrd1.g(jri3, jri2, v3, 8);
                }
                if(v4 < 0x7FFFFFFF) {
                    jrd1.h(jri3, jri2, v4, 8);
                }
            }
            else {
                jri6 = jri4;
                jrd1.m(jri3, jri2, v17, 8);
            }
            v19 = v8;
            jri7 = jri3;
            z13 = z3;
            v20 = v7;
            v21 = v12;
            jri8 = jri5;
            jri9 = jri6;
        }
        else {
            if(v10 != 2 && !z5) {
                switch(v12) {
                    case 0: {
                        v22 = 0;
                        break;
                    }
                    case 1: {
                        v22 = 1;
                        break;
                    }
                    default: {
                        goto label_77;
                    }
                }
                jrd1.m(jri3, jri2, (v8 <= 0 ? Math.max(v7, v17) : Math.min(v8, Math.max(v7, v17))), 8);
                v19 = v8;
                jri7 = jri3;
                z13 = z3;
                v21 = v22;
                v20 = v7;
                jri8 = jri5;
                jri9 = jri4;
                v18 = 0;
                goto label_139;
            }
        label_77:
            int v23 = v7 == -2 ? v17 : v7;
            int v24 = v8 == -2 ? v17 : v8;
            if(v17 > 0 && v12 != 1) {
                v17 = 0;
            }
            if(v23 > 0) {
                jrd1.g(jri3, jri2, v23, 8);
                v17 = Math.max(v17, v23);
            }
            if(v24 > 0) {
                if(((int)z1) && v12 == 1) {
                    v25 = 1;
                }
                else {
                    jrd1.h(jri3, jri2, v24, 8);
                    v25 = v12;
                }
                v17 = Math.min(v17, v24);
                v26 = v25;
            }
            else {
                v26 = v12;
            }
            if(v12 == 1) {
                if(((int)z1)) {
                    jrd1.m(jri3, jri2, v17, 8);
                }
                else {
                    if(!z7) {
                    }
                    jrd1.m(jri3, jri2, v17, 5);
                    jrd1.h(jri3, jri2, v17, 8);
                }
                jri7 = jri3;
                jri8 = jri5;
                jri9 = jri4;
                v21 = v26;
                v19 = v24;
                v20 = v23;
                z13 = z3;
            }
            else if(v12 == 2) {
                if(jrn0.i != 3 && jrn0.i != 5) {
                    jri10 = jrd1.b(this.V.N(2));
                    jri11 = jrd1.b(this.V.N(4));
                }
                else {
                    jri10 = jrd1.b(this.V.N(3));
                    jri11 = jrd1.b(this.V.N(5));
                }
                jri7 = jri3;
                jrb jrb0 = jrd1.a();
                jri9 = jri4;
                jrb0.g(jri7, jri2, jri11, jri10, f1);
                jrd1.e(jrb0);
                v19 = v24;
                v20 = v23;
                v10 = v10;
                v21 = v26;
                z13 = z3;
                v18 = ((int)z1) ^ 1;
                jri8 = jri5;
            }
            else {
                jri7 = jri3;
                jri8 = jri5;
                jri9 = jri4;
                v19 = v24;
                v20 = v23;
                v21 = v26;
                z13 = true;
            }
        }
    label_139:
        if(z10 && !z7) {
            if(v9 == 0 && !z11 && !z12) {
            label_434:
                z14 = (int)z1;
                z15 = z13;
                v27 = 5;
            label_437:
                if(z14 && z15) {
                    int v52 = jrn1.e == null ? 0 : jrn1.b();
                    if(jri8 != jri1) {
                        jrd1.g(jri1, jri7, v52, v27);
                    }
                }
            }
            else if(v9 == 0 || z11) {
                if(v9 == 0 && z11) {
                    jrd1.m(jri7, jri8, -jrn1.b(), 8);
                    if(((int)z1)) {
                        jrd1.g(jri2, jri0, 0, 5);
                    }
                    goto label_434;
                }
                else if(v9 != 0 && z11) {
                    jro jro0 = jrn0.e.d;
                    jro jro1 = jrn1.e.d;
                    jro jro2 = this.V;
                    int v28 = 6;
                    if(v18 == 0) {
                        if(jri9.g && jri8.g) {
                            jrd0.d(jri2, jri9, jrn0.b(), f, jri8, jri7, jrn1.b(), 8);
                            if(((int)z1) && z13) {
                                int v44 = jrn1.e == null ? 0 : jrn1.b();
                                if(jri8 != jri1) {
                                    jrd0.g(jri1, jri7, v44, 5);
                                }
                            }
                        }
                        else {
                            jrd1 = jrd0;
                            jri12 = jri9;
                            jri13 = jri1;
                            v35 = v20;
                            z15 = z13;
                            v41 = 6;
                            v40 = 4;
                            v39 = 1;
                            v33 = 1;
                            v37 = 0;
                            v36 = v21;
                            v38 = 5;
                        label_353:
                            if(v33 != 0 && jri12 == jri8 && jro0 != jro2) {
                                z16 = false;
                                v45 = 0;
                            }
                            else {
                                v45 = v33;
                                z16 = true;
                            }
                            if(v39 == 0) {
                                jro4 = jro1;
                                jri14 = jri12;
                                jro5 = jro0;
                                v48 = v18;
                                z17 = z8;
                                z14 = (int)z1;
                            }
                            else {
                                if(v18 == 0 && !z6 && !z8 && jri12 == jri0 && jri8 == jri13) {
                                    jro3 = jro0;
                                    v46 = 8;
                                    z14 = false;
                                    v47 = 8;
                                    z16 = false;
                                }
                                else {
                                    v47 = v38;
                                    jro3 = jro0;
                                    v46 = v41;
                                    z14 = (int)z1;
                                }
                                jri14 = jri12;
                                v48 = v18;
                                jro4 = jro1;
                                jro5 = jro3;
                                z17 = z8;
                                jrd1.d(jri2, jri14, jrn0.b(), f, jri8, jri7, jrn1.b(), v46);
                                jri8 = jri8;
                                jri7 = jri7;
                                jri2 = jri2;
                                v38 = v47;
                            }
                            if(this.ai != 8 || jrn1.i()) {
                                if(v45 != 0) {
                                    if(z14 && jri14 != jri8 && v48 == 0 && ((jro5 instanceof jrk) || (jro4 instanceof jrk))) {
                                        v38 = 6;
                                    }
                                    jrd1.g(jri2, jri14, jrn0.b(), v38);
                                    jrd1.h(jri7, jri8, -jrn1.b(), v38);
                                }
                                if(z14 && z9 && !(jro5 instanceof jrk) && !(jro4 instanceof jrk) && jro4 != jro2) {
                                    v49 = 6;
                                    v38 = 6;
                                    z16 = true;
                                }
                                else {
                                    v49 = v40;
                                }
                                if(z16) {
                                    if(v37 != 0 && (!z17 || z2)) {
                                        if(jro5 != jro2 && jro4 != jro2) {
                                            v28 = v49;
                                        }
                                        if((jro5 instanceof jrs) || (jro4 instanceof jrs)) {
                                            v28 = 5;
                                        }
                                        if((jro5 instanceof jrk) || (jro4 instanceof jrk)) {
                                            v28 = 5;
                                        }
                                        v49 = Math.max((z17 ? 5 : v28), v49);
                                    }
                                    if(z14) {
                                        v49 = Math.min(v38, v49);
                                        v50 = z5 && !z17 && (jro5 == jro2 || jro4 == jro2) ? 4 : v49;
                                    }
                                    else {
                                        v50 = v49;
                                    }
                                    jrd1.m(jri2, jri14, jrn0.b(), v50);
                                    jrd1.m(jri7, jri8, -jrn1.b(), v50);
                                }
                                if(z14) {
                                    int v51 = jri14 == jri0 ? jrn0.b() : 0;
                                    if(jri14 != jri0) {
                                        jrd1.g(jri2, jri0, v51, 5);
                                    }
                                }
                                if(z14 && v48 != 0 && v3 == 0 && v35 == 0) {
                                    if(v36 == 3) {
                                        jrd1.g(jri7, jri2, 0, 8);
                                    }
                                    else {
                                        jrd1.g(jri7, jri2, 0, 5);
                                    }
                                }
                                v27 = 5;
                                goto label_437;
                            }
                        }
                    }
                    else if(v21 == 0) {
                        if(v19 == 0 && v20 == 0) {
                            if(jri9.g && jri8.g) {
                                jrd1.m(jri2, jri9, jrn0.b(), 8);
                                jrd1.m(jri7, jri8, -jrn1.b(), 8);
                                return;
                            }
                            v29 = 8;
                            v30 = 8;
                            v31 = 0;
                            v32 = 1;
                            v33 = 0;
                            v34 = 0;
                        }
                        else {
                            v34 = v20;
                            v29 = 5;
                            v30 = 5;
                            v31 = 1;
                            v32 = 0;
                            v33 = 1;
                        }
                        if(!(jro0 instanceof jrk) && !(jro1 instanceof jrk)) {
                            jrd1 = jrd0;
                            z15 = z13;
                            v35 = v34;
                            v36 = 0;
                            v37 = v32;
                            v38 = v29;
                            v39 = v31;
                            jri12 = jri9;
                            v40 = v30;
                            jri13 = jri1;
                            v41 = 6;
                        }
                        else {
                            jrd1 = jrd0;
                            z15 = z13;
                            v41 = 6;
                            v35 = v34;
                            v36 = 0;
                            v37 = v32;
                            v38 = v29;
                            v39 = v31;
                            v40 = 4;
                            jri12 = jri9;
                            jri13 = jri1;
                        }
                        goto label_353;
                    }
                    else {
                        switch(v21) {
                            case 1: {
                                jrd1 = jrd0;
                                v35 = v20;
                                jri12 = jri9;
                                z15 = z13;
                                v41 = 6;
                                v40 = 4;
                                v39 = 1;
                                v33 = 1;
                                v37 = 0;
                                jri13 = jri1;
                                v36 = 1;
                                v38 = 8;
                                goto label_353;
                            }
                            case 2: {
                                if(!(jro0 instanceof jrk) && !(jro1 instanceof jrk)) {
                                    jrd1 = jrd0;
                                    v35 = v20;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v40 = 5;
                                }
                                else {
                                    jrd1 = jrd0;
                                    v35 = v20;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v40 = 4;
                                }
                                v39 = 1;
                                v33 = 1;
                                v37 = 0;
                                jri13 = jri1;
                                v36 = 2;
                                v38 = 5;
                                goto label_353;
                            }
                            case 3: {
                                if(this.C == -1) {
                                    jrd1 = jrd0;
                                    v35 = v20;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v38 = 8;
                                    v36 = 3;
                                    if(!z8) {
                                        v41 = 8;
                                    }
                                    else if(((int)z1) != 0) {
                                        v41 = 5;
                                    }
                                    else {
                                        v41 = 4;
                                    }
                                    v40 = 5;
                                    goto label_329;
                                }
                                else if(z5) {
                                    if(v6 != 1 && v6 != 2) {
                                        v42 = 8;
                                        v43 = 5;
                                    }
                                    else {
                                        v42 = 5;
                                        v43 = 4;
                                    }
                                    v35 = v20;
                                    v38 = v42;
                                    v40 = v43;
                                    z15 = z13;
                                    v41 = 6;
                                    v36 = 3;
                                    v39 = 1;
                                    v33 = 1;
                                    v37 = 1;
                                    jrd1 = jrd0;
                                    jri12 = jri9;
                                }
                                else if(v19 > 0) {
                                    jrd1 = jrd0;
                                    v35 = v20;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v38 = 5;
                                    v36 = 3;
                                    v40 = 5;
                                    goto label_329;
                                }
                                else if(v19 != 0 || v20 != 0) {
                                    jrd1 = jrd0;
                                    v35 = v20;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v38 = 5;
                                    v36 = 3;
                                    v40 = 4;
                                label_329:
                                    v39 = 1;
                                    v33 = 1;
                                    v37 = 1;
                                }
                                else if(!z8) {
                                    jrd1 = jrd0;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v38 = 5;
                                    v36 = 3;
                                    v40 = 8;
                                    v39 = 1;
                                    v33 = 1;
                                    v37 = 1;
                                    v35 = 0;
                                }
                                else {
                                    v38 = jro0 == jro2 || jro1 == jro2 ? 5 : 4;
                                    jri12 = jri9;
                                    z15 = z13;
                                    v41 = 6;
                                    v36 = 3;
                                    v40 = 4;
                                    v39 = 1;
                                    v33 = 1;
                                    v37 = 1;
                                    v35 = 0;
                                    jrd1 = jrd0;
                                }
                                jri13 = jri1;
                                goto label_353;
                            }
                            default: {
                                jrd1 = jrd0;
                                v35 = v20;
                                jri12 = jri9;
                                z15 = z13;
                                v41 = 6;
                                v40 = 4;
                                v39 = 0;
                                v33 = 0;
                                v37 = 0;
                                jri13 = jri1;
                                v36 = v21;
                                v38 = 5;
                                goto label_353;
                            }
                        }
                    }
                }
                else {
                    z15 = z13;
                    z14 = (int)z1;
                    v27 = 5;
                    goto label_437;
                }
            }
            else if(((int)z1) && (jrn0.e.d instanceof jrk)) {
                z14 = (int)z1;
                z15 = z13;
                v27 = 8;
                goto label_437;
            }
            else {
                goto label_434;
            }
        }
        else if(v10 < 2 && ((int)z1) && z13) {
            jrd1.g(jri2, jri0, 0, 8);
            boolean z18 = z || this.O.e == null;
            if(z) {
            label_451:
                if(z18) {
                    jrd1.g(jri1, jri7, 0, 8);
                }
            }
            else {
                jrn jrn2 = this.O.e;
                if(jrn2 == null) {
                    goto label_451;
                }
                else if(jrn2.d.Y != 0.0f && (jrn2.d.ar[0] == 3 && jrn2.d.ar[1] == 3)) {
                    jrd1.g(jri1, jri7, 0, 8);
                }
            }
        }
    }

    public boolean d() {
        return this.ai != 8;
    }

    public boolean e() {
        return this.a ? true : this.K.c && this.M.c;
    }

    public boolean f() {
        return this.n ? true : this.L.c && this.N.c;
    }

    public final int g() {
        return this.l() + this.X;
    }

    public final int h() {
        return this.ai == 8 ? 0 : this.X;
    }

    public final int i() {
        return this.k() + this.W;
    }

    public final int j() {
        return this.ai == 8 ? 0 : this.W;
    }

    public final int k() {
        return this.V == null ? this.aa : ((jrp)this.V).at + this.aa;
    }

    public final int l() {
        return this.V == null ? this.ab : ((jrp)this.V).au + this.ab;
    }

    public final jro m(int v) {
        jrn jrn0;
        if(v == 0) {
            jrn0 = this.M.e;
            return jrn0 == null || jrn0.e != this.M ? null : jrn0.d;
        }
        if(v == 1) {
            jrn0 = this.N.e;
            return jrn0 == null || jrn0.e != this.N ? null : jrn0.d;
        }
        return null;
    }

    public final jro n(int v) {
        jrn jrn0;
        if(v == 0) {
            jrn0 = this.K.e;
            return jrn0 == null || jrn0.e != this.K ? null : jrn0.d;
        }
        if(v == 1) {
            jrn0 = this.L.e;
            return jrn0 == null || jrn0.e != this.L ? null : jrn0.d;
        }
        return null;
    }

    public final jsn o(int v) {
        if(v == 0) {
            return this.h;
        }
        return v == 1 ? this.i : null;
    }

    public final void p(jrp jrp0, jrd jrd0, HashSet hashSet0, int v, boolean z) {
        if(!z) {
        label_5:
            if(v == 0) {
                HashSet hashSet1 = this.K.a;
                if(hashSet1 != null) {
                    for(Object object0: hashSet1) {
                        ((jrn)object0).d.p(jrp0, jrd0, hashSet0, 0, true);
                    }
                }
                HashSet hashSet2 = this.M.a;
                if(hashSet2 != null) {
                    for(Object object1: hashSet2) {
                        ((jrn)object1).d.p(jrp0, jrd0, hashSet0, 0, true);
                    }
                }
            }
            else {
                HashSet hashSet3 = this.L.a;
                if(hashSet3 != null) {
                    for(Object object2: hashSet3) {
                        ((jrn)object2).d.p(jrp0, jrd0, hashSet0, 1, true);
                    }
                }
                HashSet hashSet4 = this.N.a;
                if(hashSet4 != null) {
                    for(Object object3: hashSet4) {
                        ((jrn)object3).d.p(jrp0, jrd0, hashSet0, 1, true);
                    }
                }
                HashSet hashSet5 = this.O.a;
                if(hashSet5 != null) {
                    for(Object object4: hashSet5) {
                        ((jrn)object4).d.p(jrp0, jrd0, hashSet0, 1, true);
                    }
                }
            }
        }
        else if(hashSet0.contains(this)) {
            jru.a(jrp0, jrd0, this);
            hashSet0.remove(this);
            this.b(jrd0, jrp0.Z(0x40));
            goto label_5;
        }
    }

    public final void q(jrn jrn0, jrn jrn1, int v) {
        if(jrn0.d == this) {
            this.R(jrn0.i, jrn1.d, jrn1.i, v);
        }
    }

    public final void r(jrd jrd0) {
        jrd0.b(this.K);
        jrd0.b(this.L);
        jrd0.b(this.M);
        jrd0.b(this.N);
        if(this.ac > 0) {
            jrd0.b(this.O);
        }
    }

    public final void s() {
        if(this.h == null) {
            this.h = new jsi(this);
        }
        if(this.i == null) {
            this.i = new jsk(this);
        }
    }

    public void t() {
        this.K.e();
        this.L.e();
        this.M.e();
        this.N.e();
        this.O.e();
        this.P.e();
        this.Q.e();
        this.R.e();
        this.V = null;
        this.F = NaNf;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.af = 0.5f;
        this.ag = 0.5f;
        this.ar[0] = 1;
        this.ar[1] = 1;
        this.ah = null;
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        this.am[0] = -1.0f;
        this.am[1] = -1.0f;
        this.q = -1;
        this.r = -1;
        this.E[0] = 0x7FFFFFFF;
        this.E[1] = 0x7FFFFFFF;
        this.t = 0;
        this.u = 0;
        this.y = 1.0f;
        this.B = 1.0f;
        this.x = 0x7FFFFFFF;
        this.A = 0x7FFFFFFF;
        this.w = 0;
        this.z = 0;
        this.C = -1;
        this.D = 1.0f;
        this.j[0] = true;
        this.j[1] = true;
        this.H = false;
        this.U[0] = false;
        this.U[1] = false;
        this.k = true;
        this.v[0] = 0;
        this.v[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    @Override
    public String toString() {
        String s = "";
        StringBuilder stringBuilder0 = new StringBuilder("");
        if(this.aj != null) {
            s = "id: " + this.aj + " ";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        stringBuilder0.append(this.aa);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.ab);
        stringBuilder0.append(") - (");
        stringBuilder0.append(this.W);
        stringBuilder0.append(" x ");
        stringBuilder0.append(this.X);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public final void u() {
        ArrayList arrayList0 = this.T;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((jrn)arrayList0.get(v1)).e();
        }
    }

    public final void v() {
        this.a = false;
        this.n = false;
        this.o = false;
        this.p = false;
        ArrayList arrayList0 = this.T;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jrn jrn0 = (jrn)arrayList0.get(v1);
            jrn0.c = false;
            jrn0.b = 0;
        }
    }

    public void w(jrc jrc0) {
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.O.m();
        this.R.m();
        this.P.m();
        this.Q.m();
    }

    public final void x(int v) {
        this.ac = v;
        this.G = v > 0;
    }

    public final void y(int v, int v1) {
        if(this.a) {
            return;
        }
        this.K.f(v);
        this.M.f(v1);
        this.aa = v;
        this.W = v1 - v;
        this.a = true;
    }

    public final void z(int v, int v1) {
        if(this.n) {
            return;
        }
        this.L.f(v);
        this.N.f(v1);
        this.ab = v;
        this.X = v1 - v;
        if(this.G) {
            this.O.f(v + this.ac);
        }
        this.n = true;
    }
}

