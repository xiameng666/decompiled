import java.util.ArrayList;
import java.util.Arrays;

public final class jrd {
    public static boolean a = false;
    public static long b;
    public boolean c;
    int d;
    jrb[] e;
    public boolean f;
    public boolean g;
    int h;
    int i;
    public final jrc j;
    private int k;
    private int l;
    private int m;
    private boolean[] n;
    private int o;
    private jri[] p;
    private int q;
    private final jrb r;
    private jrb s;

    static {
    }

    public jrd() {
        this.k = 1000;
        this.c = false;
        this.d = 0;
        this.l = 0x20;
        this.m = 0x20;
        this.f = false;
        this.g = false;
        this.n = new boolean[0x20];
        this.h = 1;
        this.i = 0;
        this.o = 0x20;
        this.p = new jri[1000];
        this.q = 0;
        this.e = new jrb[0x20];
        this.t();
        jrc jrc0 = new jrc();
        this.j = jrc0;
        this.r = new jrh(jrc0);
        this.s = new jrb(jrc0);
    }

    public final jrb a() {
        jrc jrc0 = this.j;
        jrb jrb0 = (jrb)jrc0.b.a();
        if(jrb0 == null) {
            jrb0 = new jrb(jrc0);
            ++jrd.b;
        }
        else {
            jrb0.a = null;
            jrb0.e.f();
            jrb0.b = 0.0f;
            jrb0.d = false;
        }
        ++jri.a;
        return jrb0;
    }

    public final jri b(Object object0) {
        if(object0 == null) {
            return null;
        }
        if(this.h + 1 >= this.m) {
            this.s();
        }
        jri jri0 = ((jrn)object0).h;
        if(jri0 == null) {
            ((jrn)object0).m();
            jri0 = ((jrn)object0).h;
        }
        int v = jri0.c;
        if(v != -1) {
            if(v <= this.d && this.j.a[v] != null) {
                return jri0;
            }
            if(v != -1) {
                jri0.c();
            }
        }
        int v1 = this.d + 1;
        this.d = v1;
        ++this.h;
        jri0.c = v1;
        jri0.n = 1;
        this.j.a[v1] = jri0;
        return jri0;
    }

    public final jri c() {
        if(this.h + 1 >= this.m) {
            this.s();
        }
        jri jri0 = this.v(3);
        int v = this.d + 1;
        this.d = v;
        ++this.h;
        jri0.c = v;
        this.j.a[v] = jri0;
        return jri0;
    }

    public final void d(jri jri0, jri jri1, int v, float f, jri jri2, jri jri3, int v1, int v2) {
        jrb jrb0 = this.a();
        if(jri1 == jri2) {
            jrb0.e.g(jri0, 1.0f);
            jrb0.e.g(jri3, 1.0f);
            jrb0.e.g(jri1, -2.0f);
        }
        else if(Float.compare(f, 0.5f) == 0) {
            jrb0.e.g(jri0, 1.0f);
            jrb0.e.g(jri1, -1.0f);
            jrb0.e.g(jri2, -1.0f);
            jrb0.e.g(jri3, 1.0f);
            if(v > 0 || v1 > 0) {
                jrb0.b = (float)(-v + v1);
            }
        }
        else if((f <= 0.0f)) {
            jrb0.e.g(jri0, -1.0f);
            jrb0.e.g(jri1, 1.0f);
            jrb0.b = (float)v;
        }
        else if((f >= 1.0f)) {
            jrb0.e.g(jri3, -1.0f);
            jrb0.e.g(jri2, 1.0f);
            jrb0.b = (float)(-v1);
        }
        else {
            jrb0.e.g(jri0, 1.0f - f);
            jrb0.e.g(jri1, -(1.0f - f));
            jrb0.e.g(jri2, -f);
            jrb0.e.g(jri3, f);
            if(v > 0 || v1 > 0) {
                jrb0.b = ((float)(-v)) * (1.0f - f) + ((float)v1) * f;
            }
        }
        if(v2 != 8) {
            jrb0.f(this, v2);
        }
        this.e(jrb0);
    }

    public final void e(jrb jrb0) {
        boolean z4;
        boolean z3;
        if(this.i + 1 >= this.o || this.h + 1 >= this.m) {
            this.s();
        }
        if(!jrb0.d) {
            if(this.e.length != 0) {
                boolean z = false;
                while(!z) {
                    int v = jrb0.e.a;
                    for(int v1 = 0; v1 < v; ++v1) {
                        jri jri0 = jrb0.e.d(v1);
                        if(jri0.d != -1 || jri0.g) {
                            jrb0.c.add(jri0);
                        }
                    }
                    ArrayList arrayList0 = jrb0.c;
                    int v2 = arrayList0.size();
                    if(v2 > 0) {
                        for(int v3 = 0; v3 < v2; ++v3) {
                            jri jri1 = (jri)arrayList0.get(v3);
                            if(jri1.g) {
                                jrb0.c(this, jri1, true);
                            }
                            else {
                                jrb0.d(this, this.e[jri1.d], true);
                            }
                        }
                        arrayList0.clear();
                    }
                    else {
                        z = true;
                    }
                }
                if(jrb0.a != null && jrb0.e.a == 0) {
                    jrb0.d = true;
                    this.c = true;
                }
            }
            if(jrb0.e()) {
                return;
            }
            float f = jrb0.b;
            if((f < 0.0f)) {
                jrb0.b = -f;
                jra jra0 = jrb0.e;
                int v4 = jra0.f;
                for(int v5 = 0; v4 != -1 && v5 < jra0.a; ++v5) {
                    jra0.e[v4] = -jra0.e[v4];
                    v4 = jra0.d[v4];
                }
            }
            int v6 = jrb0.e.a;
            float f1 = 0.0f;
            float f2 = 0.0f;
            jri jri2 = null;
            jri jri3 = null;
            boolean z1 = false;
            boolean z2 = false;
            for(int v7 = 0; v7 < v6; ++v7) {
                float f3 = jrb0.e.b(v7);
                jri jri4 = jrb0.e.d(v7);
                if(jri4.n != 1) {
                    if(jri2 == null) {
                        if((f3 < 0.0f)) {
                            if(jri3 == null) {
                                z2 = jrb.l(jri4);
                                jri3 = jri4;
                                jri2 = null;
                                f2 = f3;
                                continue;
                            }
                            else if((f2 > f3)) {
                                z2 = jrb.l(jri4);
                                jri3 = jri4;
                                jri2 = null;
                                f2 = f3;
                                continue;
                            }
                            else if(!z2 && jrb.l(jri4)) {
                                z2 = true;
                                jri3 = jri4;
                                jri2 = null;
                                f2 = f3;
                                continue;
                            }
                        }
                        jri2 = null;
                    }
                }
                else if(jri2 == null) {
                    z1 = jrb.l(jri4);
                    jri2 = jri4;
                    f1 = f3;
                }
                else if((f1 > f3)) {
                    z1 = jrb.l(jri4);
                    jri2 = jri4;
                    f1 = f3;
                }
                else if(!z1 && jrb.l(jri4)) {
                    z1 = true;
                    jri2 = jri4;
                    f1 = f3;
                }
            }
            if(jri2 == null) {
                jri2 = jri3;
            }
            if(jri2 == null) {
                z3 = true;
            }
            else {
                jrb0.b(jri2);
                z3 = false;
            }
            if(jrb0.e.a == 0) {
                jrb0.d = true;
            }
            if(z3) {
                if(this.h + 1 >= this.m) {
                    this.s();
                }
                jri jri5 = this.v(3);
                int v8 = this.d + 1;
                this.d = v8;
                ++this.h;
                jri5.c = v8;
                jrc jrc0 = this.j;
                jrc0.a[v8] = jri5;
                jrb0.a = jri5;
                int v9 = this.i;
                this.q(jrb0);
                if(this.i == v9 + 1) {
                    jrb jrb1 = this.s;
                    jrb1.a = null;
                    jrb1.e.f();
                    for(int v10 = 0; true; ++v10) {
                        jra jra1 = jrb0.e;
                        if(v10 >= jra1.a) {
                            break;
                        }
                        jrb1.e.e(jra1.d(v10), jrb0.e.b(v10), true);
                    }
                    this.u(this.s);
                    if(jri5.d == -1) {
                        if(jrb0.a == jri5) {
                            jri jri6 = jrb0.a(null, jri5);
                            if(jri6 != null) {
                                jrb0.b(jri6);
                            }
                        }
                        if(!jrb0.d) {
                            jrb0.a.e(this, jrb0);
                        }
                        jrc0.b.b(jrb0);
                        --this.i;
                    }
                    z4 = true;
                }
                else {
                    z4 = false;
                }
            }
            else {
                z4 = false;
            }
            if((jrb0.a == null || jrb0.a.n != 1 && jrb0.b < 0.0f) || z4) {
                return;
            }
        }
        this.q(jrb0);
    }

    public final void f(jri jri0, int v) {
        int v1 = jri0.d;
        if(v1 == -1) {
            jri0.d(this, ((float)v));
            for(int v2 = 0; v2 < this.d + 1; ++v2) {
                jri jri1 = this.j.a[v2];
            }
            return;
        }
        if(v1 != -1) {
            jrb jrb0 = this.e[v1];
            if(jrb0.d) {
                jrb0.b = (float)v;
                return;
            }
            if(jrb0.e.a == 0) {
                jrb0.d = true;
                jrb0.b = (float)v;
                return;
            }
            jrb jrb1 = this.a();
            if(v < 0) {
                jrb1.b = (float)(-v);
                jrb1.e.g(jri0, 1.0f);
            }
            else {
                jrb1.b = (float)v;
                jrb1.e.g(jri0, -1.0f);
            }
            this.e(jrb1);
            return;
        }
        jrb jrb2 = this.a();
        jrb2.a = jri0;
        jri0.f = (float)v;
        jrb2.b = (float)v;
        jrb2.d = true;
        this.e(jrb2);
    }

    public final void g(jri jri0, jri jri1, int v, int v1) {
        jrb jrb0 = this.a();
        jri jri2 = this.c();
        jri2.e = 0;
        jrb0.h(jri0, jri1, jri2, v);
        if(v1 != 8) {
            this.i(jrb0, ((int)(-jrb0.e.a(jri2))), v1);
        }
        this.e(jrb0);
    }

    public final void h(jri jri0, jri jri1, int v, int v1) {
        jrb jrb0 = this.a();
        jri jri2 = this.c();
        jri2.e = 0;
        jrb0.i(jri0, jri1, jri2, v);
        if(v1 != 8) {
            this.i(jrb0, ((int)(-jrb0.e.a(jri2))), v1);
        }
        this.e(jrb0);
    }

    final void i(jrb jrb0, int v, int v1) {
        jri jri0 = this.p(v1);
        jrb0.e.g(jri0, ((float)v));
    }

    public final void j() {
        jrb jrb0 = this.r;
        if(jrb0.e()) {
            this.r();
            return;
        }
        if(this.g) {
            for(int v = 0; v < this.i; ++v) {
                if(!this.e[v].d) {
                    this.l(jrb0);
                    return;
                }
            }
            this.r();
            return;
        }
        this.l(jrb0);
    }

    public final void k() {
        jrc jrc0;
        for(int v = 0; true; ++v) {
            jrc0 = this.j;
            jri[] arr_jri = jrc0.a;
            if(v >= arr_jri.length) {
                break;
            }
            jri jri0 = arr_jri[v];
            if(jri0 != null) {
                jri0.c();
            }
        }
        jre jre0 = jrc0.c;
        jri[] arr_jri1 = this.p;
        int v1 = this.q <= arr_jri1.length ? this.q : arr_jri1.length;
        for(int v2 = 0; v2 < v1; ++v2) {
            jri jri1 = arr_jri1[v2];
            int v3 = jre0.b;
            if(v3 < 0x100) {
                jre0.a[v3] = jri1;
                jre0.b = v3 + 1;
            }
        }
        this.q = 0;
        Arrays.fill(jrc0.a, null);
        this.d = 0;
        ((jrh)this.r).f = 0;
        ((jrh)this.r).b = 0.0f;
        this.h = 1;
        for(int v4 = 0; v4 < this.i; ++v4) {
            jrb jrb0 = this.e[v4];
        }
        this.t();
        this.i = 0;
        this.s = new jrb(jrc0);
    }

    final void l(jrb jrb0) {
        int v10;
        for(int v = 0; v < this.i; ++v) {
            jrb jrb1 = this.e[v];
            if(jrb1.a.n != 1 && (jrb1.b < 0.0f)) {
                int v1 = 0;
                for(int v2 = 0; v2 == 0; v2 = (v1 <= this.h / 2 ? 1 : 0) ^ 1 | v10) {
                    ++v1;
                    float f = 3.402823E+38f;
                    int v3 = -1;
                    int v4 = -1;
                    int v6 = 0;
                    for(int v5 = 0; v5 < this.i; ++v5) {
                        jrb jrb2 = this.e[v5];
                        if(jrb2.a.n != 1 && !jrb2.d && (jrb2.b < 0.0f)) {
                            int v7 = jrb2.e.a;
                            for(int v8 = 0; v8 < v7; ++v8) {
                                jri jri0 = jrb2.e.d(v8);
                                float f1 = jrb2.e.a(jri0);
                                if(f1 > 0.0f) {
                                    for(int v9 = 0; v9 < 9; ++v9) {
                                        float f2 = jri0.h[v9] / f1;
                                        if((f2 < f) && v9 == v6 || v9 > v6) {
                                            v4 = jri0.c;
                                            v6 = v9;
                                            f = f2;
                                            v3 = v5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v3 == -1) {
                        v10 = 1;
                    }
                    else {
                        jrb jrb3 = this.e[v3];
                        jrb3.a.d = -1;
                        jrb3.b(this.j.a[v4]);
                        jrb3.a.d = v3;
                        jrb3.a.e(this, jrb3);
                        v10 = 0;
                    }
                }
                break;
            }
        }
        this.u(jrb0);
        this.r();
    }

    public final void m(jri jri0, jri jri1, int v, int v1) {
        boolean z;
        if(v1 == 8) {
            if(jri1.g && jri0.d == -1) {
                jri0.d(this, jri1.f + ((float)v));
                return;
            }
            v1 = 8;
        }
        jrb jrb0 = this.a();
        if(v == 0) {
            jrb0.e.g(jri0, -1.0f);
            jrb0.e.g(jri1, 1.0f);
        }
        else {
            if(v < 0) {
                v = -v;
                z = true;
            }
            else {
                z = false;
            }
            jrb0.b = (float)v;
            if(z) {
                jrb0.e.g(jri0, 1.0f);
                jrb0.e.g(jri1, -1.0f);
            }
            else {
                jrb0.e.g(jri0, -1.0f);
                jrb0.e.g(jri1, 1.0f);
            }
        }
        if(v1 != 8) {
            jrb0.f(this, v1);
        }
        this.e(jrb0);
    }

    public final void n(jri jri0, jri jri1, jri jri2, jri jri3, float f) {
        jrb jrb0 = this.a();
        jrb0.g(jri0, jri1, jri2, jri3, f);
        this.e(jrb0);
    }

    public static final int o(Object object0) {
        jri jri0 = ((jrn)object0).h;
        return jri0 == null ? 0 : ((int)(jri0.f + 0.5f));
    }

    public final jri p(int v) {
        if(this.h + 1 >= this.m) {
            this.s();
        }
        jri jri0 = this.v(4);
        int v1 = this.d + 1;
        this.d = v1;
        ++this.h;
        jri0.c = v1;
        jri0.e = v;
        this.j.a[v1] = jri0;
        ((jrh)this.r).g.a = jri0;
        Arrays.fill(((jrh)this.r).g.a.i, 0.0f);
        jri0.i[jri0.e] = 1.0f;
        ((jrh)this.r).m(jri0);
        return jri0;
    }

    private final void q(jrb jrb0) {
        int v4;
        if(jrb0.d) {
            jrb0.a.d(this, jrb0.b);
        }
        else {
            int v = this.i;
            this.e[v] = jrb0;
            jrb0.a.d = v;
            this.i = v + 1;
            jrb0.a.e(this, jrb0);
        }
        if(this.c) {
            for(int v1 = 0; v1 < this.i; ++v1) {
                if(this.e[v1] == null) {
                    System.out.println("WTF");
                }
                jrb jrb1 = this.e[v1];
                if(jrb1 != null && jrb1.d) {
                    jrb1.a.d(this, jrb1.b);
                    this.j.b.b(jrb1);
                    this.e[v1] = null;
                    int v2 = v1 + 1;
                    int v3 = v2;
                    while(true) {
                        v4 = this.i;
                        if(v2 >= v4) {
                            break;
                        }
                        jrb[] arr_jrb = this.e;
                        jrb jrb2 = arr_jrb[v2];
                        arr_jrb[v2 - 1] = jrb2;
                        jri jri0 = jrb2.a;
                        if(jri0.d == v2) {
                            jri0.d = v2 - 1;
                        }
                        v3 = v2;
                        ++v2;
                    }
                    if(v3 < v4) {
                        this.e[v3] = null;
                    }
                    this.i = v4 - 1;
                    --v1;
                }
            }
            this.c = false;
        }
    }

    private final void r() {
        for(int v = 0; v < this.i; ++v) {
            jrb jrb0 = this.e[v];
            jrb0.a.f = jrb0.b;
        }
    }

    private final void s() {
        int v = this.l + this.l;
        this.l = v;
        this.e = (jrb[])Arrays.copyOf(this.e, v);
        this.j.a = (jri[])Arrays.copyOf(this.j.a, this.l);
        int v1 = this.l;
        this.n = new boolean[v1];
        this.m = v1;
        this.o = v1;
    }

    private final void t() {
        for(int v = 0; v < this.i; ++v) {
            jrb jrb0 = this.e[v];
            if(jrb0 != null) {
                this.j.b.b(jrb0);
            }
            this.e[v] = null;
        }
    }

    // This method was un-flattened
    private final void u(jrb jrb0) {
        for(int v = 0; v < this.h; ++v) {
            this.n[v] = false;
        }
        int v1 = 0;
        while(true) {
            ++v1;
            if(v1 >= this.h + this.h) {
                break;
            }
            jri jri0 = jrb0.a;
            if(jri0 != null) {
                this.n[jri0.c] = true;
            }
            jri jri1 = jrb0.k(this.n);
            if(jri1 != null) {
                boolean[] arr_z = this.n;
                int v2 = jri1.c;
                if(arr_z[v2]) {
                    break;
                }
                arr_z[v2] = true;
            }
            if(jri1 == null) {
                return;
            }
            float f = 3.402823E+38f;
            int v4 = -1;
            for(int v3 = 0; v3 < this.i; ++v3) {
                jrb jrb1 = this.e[v3];
                if(jrb1.a.n != 1 && !jrb1.d) {
                    jra jra0 = jrb1.e;
                    int v5 = jra0.f;
                    if(v5 != -1) {
                        for(int v6 = 0; v5 != -1 && v6 < jra0.a; ++v6) {
                            if(jra0.c[v5] == jri1.c) {
                                float f1 = jrb1.e.a(jri1);
                                if((f1 < 0.0f)) {
                                    float f2 = -jrb1.b / f1;
                                    if((f2 < f)) {
                                        v4 = v3;
                                        f = f2;
                                    }
                                }
                                break;
                            }
                            v5 = jra0.d[v5];
                        }
                    }
                }
            }
            if(v4 >= 0) {
                jrb jrb2 = this.e[v4];
                jrb2.a.d = -1;
                jrb2.b(jri1);
                jrb2.a.d = v4;
                jrb2.a.e(this, jrb2);
            }
        }
    }

    private final jri v(int v) {
        jri jri0 = (jri)this.j.c.a();
        if(jri0 == null) {
            jri0 = new jri(v);
        }
        else {
            jri0.c();
        }
        jri0.n = v;
        int v1 = this.k;
        if(this.q >= v1) {
            int v2 = v1 + v1;
            this.k = v2;
            this.p = (jri[])Arrays.copyOf(this.p, v2);
        }
        int v3 = this.q;
        this.q = v3 + 1;
        this.p[v3] = jri0;
        return jri0;
    }
}

