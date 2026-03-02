public final class jbn {
    public static final jbn a;
    public final jat b;
    public final ixo c;
    public final ixt d;

    static {
        jbn.a = new jbn(0L, 0L, null, null, 0L, null, 0, 0L, 0, 0xFFFFFF);
    }

    public jbn(long v, long v1, jeu jeu0, jdz jdz0, long v2, jjz jjz0, int v3, long v4, int v5, int v6) {
        this(new jat(((v6 & 1) == 0 ? v : hll.i), ((v6 & 2) == 0 ? v1 : jlp.a), ((v6 & 4) == 0 ? jeu0 : null), null, null, ((v6 & 0x20) == 0 ? jdz0 : null), null, ((v6 & 0x80) == 0 ? v2 : jlp.a), null, null, null, ((v6 & 0x800) == 0 ? 0L : hll.i), ((v6 & 0x1000) == 0 ? jjz0 : null), null), new ixo(((0x8000 & v6) == 0 ? v3 : 0), 0, ((0x20000 & v6) == 0 ? v4 : jlp.a), null, null, null, 0, ((v6 & 0x400000) == 0 ? v5 : 0), null), null);
    }

    public jbn(jat jat0, ixo ixo0) {
        this(jat0, ixo0, (jat0.o != null || ixo0.e != null ? new ixt(jat0.o, ixo0.e) : null));
    }

    public jbn(jat jat0, ixo ixo0, ixt ixt0) {
        this.b = jat0;
        this.c = ixo0;
        this.d = ixt0;
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jbn)) {
            return false;
        }
        if(!ibuq.m(this.b, ((jbn)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((jbn)object0).c) ? ibuq.m(this.d, ((jbn)object0).d) : false;
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F + this.c.hashCode();
        return this.d == null ? v * 0x1F : v * 0x1F + this.d.hashCode();
    }

    public final long i() {
        return this.c.c;
    }

    public final hlf j() {
        return this.b.c();
    }

    public final hmt k() {
        return this.b.n;
    }

    public final hpe l() {
        return this.b.p;
    }

    public final jbn m(jbn jbn0) {
        return jbn0 == null || ibuq.m(jbn0, jbn.a) ? this : new jbn(this.b.d(jbn0.b), this.c.a(jbn0.c));
    }

    public final jdz n() {
        return this.b.f;
    }

    public final jem o() {
        return this.b.d;
    }

    public final jen p() {
        return this.b.e;
    }

    public final jeu q() {
        return this.b.c;
    }

    public final jii r() {
        return this.b.k;
    }

    public final jjw s() {
        return this.c.f;
    }

    public final jjz t() {
        return this.b.m;
    }

    @Override
    public final String toString() {
        return "TextStyle(color=" + hll.g(this.f()) + ", brush=" + this.j() + ", alpha=" + this.a() + ", fontSize=" + jlp.d(this.g()) + ", fontWeight=" + this.q() + ", fontStyle=" + this.o() + ", fontSynthesis=" + this.p() + ", fontFamily=" + this.n() + ", fontFeatureSettings=" + this.b.g + ", letterSpacing=" + jlp.d(this.h()) + ", baselineShift=" + this.b.i + ", textGeometricTransform=" + this.b.j + ", localeList=" + this.r() + ", background=" + hll.g(this.e()) + ", textDecoration=" + this.t() + ", shadow=" + this.k() + ", drawStyle=" + this.l() + ", textAlign=" + jjy.a(this.c()) + ", textDirection=" + jka.a(this.d()) + ", lineHeight=" + jlp.d(this.i()) + ", textIndent=" + this.u() + ", platformStyle=" + this.d + ", lineHeightStyle=" + this.s() + ", lineBreak=" + jjr.a(this.b()) + ", hyphens=" + jjn.a(this.c.h) + ", textMotion=" + this.v() + ')';
    }

    public final jki u() {
        return this.c.d;
    }

    public final jkk v() {
        return this.c.i;
    }

    public final boolean w(jbn jbn0) {
        return this == jbn0 || this.b.f(jbn0.b);
    }

    public final boolean x(jbn jbn0) {
        return this == jbn0 ? true : ibuq.m(this.c, jbn0.c) && this.b.e(jbn0.b);
    }

    public static jbn y(jbn jbn0, long v, long v1, jeu jeu0, jdz jdz0, String s, long v2, jjz jjz0, int v3, long v4, ixt ixt0, jjw jjw0, int v5, int v6, jkk jkk0, int v7) {
        jkk jkk1;
        int v20;
        int v19;
        jjw jjw2;
        jjw jjw1;
        long v17;
        ixt ixt1;
        jki jki1;
        long v16;
        hmt hmt1;
        hpe hpe1;
        int v15;
        int v14;
        int v13;
        long v8 = (v7 & 1) == 0 ? v : jbn0.b.b();
        long v9 = (v7 & 2) == 0 ? v1 : jbn0.b.b;
        jeu jeu1 = (v7 & 4) == 0 ? jeu0 : jbn0.b.c;
        jem jem0 = (v7 & 8) == 0 ? null : jbn0.b.d;
        jen jen0 = (v7 & 16) == 0 ? null : jbn0.b.e;
        jdz jdz1 = (v7 & 0x20) == 0 ? jdz0 : jbn0.b.f;
        String s1 = (v7 & 0x40) == 0 ? s : jbn0.b.g;
        long v10 = (v7 & 0x80) == 0 ? v2 : jbn0.b.h;
        jjk jjk0 = (v7 & 0x100) == 0 ? null : jbn0.b.i;
        jkh jkh0 = (v7 & 0x200) == 0 ? null : jbn0.b.j;
        jii jii0 = (v7 & 0x400) == 0 ? null : jbn0.b.k;
        long v11 = (v7 & 0x800) == 0 ? 0L : jbn0.b.l;
        jjz jjz1 = (v7 & 0x1000) == 0 ? jjz0 : jbn0.b.m;
        hmt hmt0 = (v7 & 0x2000) == 0 ? null : jbn0.b.n;
        hpe hpe0 = (v7 & 0x4000) == 0 ? null : jbn0.b.p;
        int v12 = (v7 & 0x8000) == 0 ? v3 : jbn0.c.a;
        if((v7 & 0x10000) == 0) {
            v13 = v12;
            v14 = 0;
        }
        else {
            v13 = v12;
            v14 = jbn0.c.b;
        }
        if((v7 & 0x20000) == 0) {
            v15 = v14;
            hpe1 = hpe0;
            hmt1 = hmt0;
            v16 = v4;
        }
        else {
            v15 = v14;
            hpe1 = hpe0;
            hmt1 = hmt0;
            v16 = jbn0.c.c;
        }
        jki jki0 = (v7 & 0x40000) == 0 ? null : jbn0.c.d;
        if((v7 & 0x80000) == 0) {
            jki1 = jki0;
            ixt1 = ixt0;
        }
        else {
            jki1 = jki0;
            ixt1 = jbn0.d;
        }
        if((v7 & 0x100000) == 0) {
            v17 = v16;
            jjw1 = jjw0;
        }
        else {
            v17 = v16;
            jjw1 = jbn0.c.f;
        }
        int v18 = (v7 & 0x200000) == 0 ? v5 : jbn0.c.g;
        if((v7 & 0x400000) == 0) {
            jjw2 = jjw1;
            v19 = v6;
        }
        else {
            jjw2 = jjw1;
            v19 = jbn0.c.h;
        }
        if((v7 & 0x800000) == 0) {
            v20 = v19;
            jkk1 = jkk0;
        }
        else {
            v20 = v19;
            jkk1 = jbn0.c.i;
        }
        jat jat0 = new jat((ibog.c(v8, jbn0.b.b()) ? jbn0.b.a : jke.a(v8)), v9, jeu1, jem0, jen0, jdz1, s1, v10, jjk0, jkh0, jii0, v11, jjz1, hmt1, (ixt1 == null ? null : ixt1.a), hpe1);
        return ixt1 == null ? new jbn(jat0, new ixo(v13, v15, v17, jki1, null, jjw2, v18, v20, jkk1), null) : new jbn(jat0, new ixo(v13, v15, v17, jki1, ixt1.b, jjw2, v18, v20, jkk1), ixt1);
    }

    public static jbn z(jbn jbn0, long v, long v1, jeu jeu0, jem jem0, jdz jdz0, long v2, jjz jjz0, int v3, long v4, int v5) {
        jat jat0 = jav.b(jbn0.b, ((v5 & 1) == 0 ? v : hll.i), null, NaNf, ((v5 & 2) == 0 ? v1 : jlp.a), ((v5 & 4) == 0 ? jeu0 : null), ((v5 & 8) == 0 ? jem0 : null), null, ((v5 & 0x20) == 0 ? jdz0 : null), null, ((v5 & 0x80) == 0 ? v2 : jlp.a), null, null, null, ((v5 & 0x800) == 0 ? 0L : hll.i), ((v5 & 0x1000) == 0 ? jjz0 : null), null, null, null);
        ixo ixo0 = ixp.a(jbn0.c, ((0x8000 & v5) == 0 ? v3 : 0), 0, ((v5 & 0x20000) == 0 ? v4 : jlp.a), null, null, null, 0, 0, null);
        return jbn0.b != jat0 || jbn0.c != ixo0 ? new jbn(jat0, ixo0) : jbn0;
    }
}

