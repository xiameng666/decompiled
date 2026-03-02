import java.util.ArrayList;
import java.util.List;

public final class hmps {
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;
    public int e;
    public int f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public int j;
    public int k;
    public hmpu l;
    public boolean m;
    public byte n;
    public byte[] o;
    public boolean p;
    public boolean q;
    hmpt r;
    public final List s;
    public int t;
    public hmnr u;
    public hmnr v;
    public hmnr w;

    public hmps() {
        this.c = null;
        this.g = new byte[16];
        this.h = new byte[6];
        this.i = new byte[4];
        this.o = null;
        this.t = 3;
        this.p = false;
        this.q = false;
        this.s = new ArrayList();
    }

    public final hmpt a() {
        hmpt hmpt0 = this.r;
        if(hmpt0 == null) {
            hmpt0 = new hmpt();
            this.r = hmpt0;
        }
        return hmpt0;
    }

    public final void b() {
        this.c();
        this.d();
        this.w = null;
        this.v = null;
        this.u = null;
        this.l = null;
        this.c = null;
    }

    public final void c() {
        this.j = 0;
        this.k = 0;
        this.f();
    }

    public final void d() {
        this.g = new byte[16];
    }

    public final void e() {
        this.r.f = null;
        this.r.g = null;
        this.r.b = null;
    }

    public final void f() {
        this.b = 0;
    }

    public final boolean g() {
        return this.e == 0x70;
    }

    public final byte[] h() {
        return hmpb.X(this.k);
    }

    public final byte[] i() {
        return (byte[])this.d.clone();
    }

    public final byte[] j() {
        return hmpb.X(this.j);
    }

    public final int k() {
        return this.h[0] == 1 ? 2 : 1;
    }

    public final void l() {
        ++this.k;
    }

    public final void m() {
        ++this.j;
    }
}

