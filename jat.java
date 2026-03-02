public final class jat implements iwd {
    public final jkg a;
    public final long b;
    public final jeu c;
    public final jem d;
    public final jen e;
    public final jdz f;
    public final String g;
    public final long h;
    public final jjk i;
    public final jkh j;
    public final jii k;
    public final long l;
    public final jjz m;
    public final hmt n;
    public final ixs o;
    public final hpe p;

    public jat(long v, long v1, jeu jeu0, jem jem0, jen jen0, jdz jdz0, String s, long v2, jjk jjk0, jkh jkh0, jii jii0, long v3, jjz jjz0, hmt hmt0) {
        this(jke.a(v), v1, jeu0, jem0, jen0, jdz0, s, v2, jjk0, jkh0, jii0, v3, jjz0, hmt0, null, null);
    }

    public jat(long v, long v1, jeu jeu0, jem jem0, jen jen0, jdz jdz0, String s, long v2, jjk jjk0, jkh jkh0, jii jii0, long v3, jjz jjz0, hmt hmt0, int v4) {
        this(((v4 & 1) == 0 ? v : hll.i), ((v4 & 2) == 0 ? v1 : jlp.a), ((v4 & 4) == 0 ? jeu0 : null), ((v4 & 8) == 0 ? jem0 : null), ((v4 & 16) == 0 ? jen0 : null), ((v4 & 0x20) == 0 ? jdz0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : jlp.a), ((v4 & 0x100) == 0 ? jjk0 : null), ((v4 & 0x200) == 0 ? jkh0 : null), ((v4 & 0x400) == 0 ? jii0 : null), ((v4 & 0x800) == 0 ? v3 : hll.i), ((v4 & 0x1000) == 0 ? jjz0 : null), ((v4 & 0x2000) == 0 ? hmt0 : null));
    }

    public jat(jkg jkg0, long v, jeu jeu0, jem jem0, jen jen0, jdz jdz0, String s, long v1, jjk jjk0, jkh jkh0, jii jii0, long v2, jjz jjz0, hmt hmt0, ixs ixs0, hpe hpe0) {
        this.a = jkg0;
        this.b = v;
        this.c = jeu0;
        this.d = jem0;
        this.e = jen0;
        this.f = jdz0;
        this.g = s;
        this.h = v1;
        this.i = jjk0;
        this.j = jkh0;
        this.k = jii0;
        this.l = v2;
        this.m = jjz0;
        this.n = hmt0;
        this.o = ixs0;
        this.p = hpe0;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final hlf c() {
        return this.a.c();
    }

    public final jat d(jat jat0) {
        return jat0 == null ? this : jav.b(this, jat0.a.b(), jat0.a.c(), jat0.a.a(), jat0.b, jat0.c, jat0.d, jat0.e, jat0.f, jat0.g, jat0.h, jat0.i, jat0.j, jat0.k, jat0.l, jat0.m, jat0.n, jat0.o, jat0.p);
    }

    public final boolean e(jat jat0) {
        if(this == jat0) {
            return true;
        }
        if(!jlp.e(this.b, jat0.b)) {
            return false;
        }
        if(!ibuq.m(this.c, jat0.c)) {
            return false;
        }
        if(!ibuq.m(this.d, jat0.d)) {
            return false;
        }
        if(!ibuq.m(this.e, jat0.e)) {
            return false;
        }
        if(!ibuq.m(this.f, jat0.f)) {
            return false;
        }
        if(!ibuq.m(this.g, jat0.g)) {
            return false;
        }
        if(!jlp.e(this.h, jat0.h)) {
            return false;
        }
        if(!ibuq.m(this.i, jat0.i)) {
            return false;
        }
        if(!ibuq.m(this.j, jat0.j)) {
            return false;
        }
        if(!ibuq.m(this.k, jat0.k)) {
            return false;
        }
        return ibog.c(this.l, jat0.l) ? ibuq.m(this.o, jat0.o) : false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jat) ? this.e(((jat)object0)) && this.f(((jat)object0)) : false;
    }

    public final boolean f(jat jat0) {
        if(!ibuq.m(this.a, jat0.a)) {
            return false;
        }
        if(!ibuq.m(this.m, jat0.m)) {
            return false;
        }
        return ibuq.m(this.n, jat0.n) ? ibuq.m(this.p, jat0.p) : false;
    }

    public static jat g(jat jat0, long v, jjz jjz0, int v1) {
        long v2 = (v1 & 1) == 0 ? v : jat0.b();
        long v3 = 0L;
        long v4 = (v1 & 2) == 0 ? 0L : jat0.b;
        jii jii0 = null;
        jeu jeu0 = (v1 & 4) == 0 ? null : jat0.c;
        jem jem0 = (v1 & 8) == 0 ? null : jat0.d;
        jen jen0 = (v1 & 16) == 0 ? null : jat0.e;
        jdz jdz0 = (v1 & 0x20) == 0 ? null : jat0.f;
        String s = (v1 & 0x40) == 0 ? null : jat0.g;
        long v5 = (v1 & 0x80) == 0 ? 0L : jat0.h;
        jjk jjk0 = (v1 & 0x100) == 0 ? null : jat0.i;
        jkh jkh0 = (v1 & 0x200) == 0 ? null : jat0.j;
        if((v1 & 0x400) != 0) {
            jii0 = jat0.k;
        }
        if((v1 & 0x800) != 0) {
            v3 = jat0.l;
        }
        jjz jjz1 = (v1 & 0x1000) == 0 ? jjz0 : jat0.m;
        return ibog.c(v2, jat0.b()) ? new jat(jat0.a, v4, jeu0, jem0, jen0, jdz0, s, v5, jjk0, jkh0, jii0, v3, jjz1, jat0.n, jat0.o, jat0.p) : new jat(jke.a(v2), v4, jeu0, jem0, jen0, jdz0, s, v5, jjk0, jkh0, jii0, v3, jjz1, jat0.n, jat0.o, jat0.p);
    }

    @Override
    public final int hashCode() {
        int v = ibof.a(this.b());
        hlf hlf0 = this.c();
        int v1 = 0;
        int v2 = (((((((((((((v * 0x1F + (hlf0 == null ? 0 : hlf0.hashCode())) * 0x1F + Float.floatToIntBits(this.a())) * 0x1F + jlo.a(this.b)) * 0x1F + (this.c == null ? 0 : this.c.l)) * 0x1F + (this.d == null ? 0 : this.d.a)) * 0x1F + (this.e == null ? 0 : this.e.a)) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + jlo.a(this.h)) * 0x1F + (this.i == null ? 0 : Float.floatToIntBits(this.i.a))) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F + ibof.a(this.l)) * 0x1F;
        int v3 = this.m == null ? 0 : this.m.d;
        int v4 = this.n == null ? 0 : this.n.hashCode();
        int v5 = this.o == null ? 0 : this.o.hashCode();
        hpe hpe0 = this.p;
        if(hpe0 != null) {
            v1 = hpe0.hashCode();
        }
        return (((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SpanStyle(color=" + hll.g(this.b()) + ", brush=" + this.c() + ", alpha=" + this.a() + ", fontSize=" + jlp.d(this.b) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + jlp.d(this.h) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + hll.g(this.l) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }
}

