public final class jgm {
    public static final jgm a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final jhc g;
    public final jii h;

    static {
        jgm.a = new jgm(false, 0, true, 1, 1, null, jii.a);
    }

    public jgm(boolean z, int v, boolean z1, int v1, int v2, jhc jhc0, jii jii0) {
        this.b = z;
        this.c = v;
        this.d = z1;
        this.e = v1;
        this.f = v2;
        this.g = jhc0;
        this.h = jii0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jgm)) {
            return false;
        }
        if(this.b != ((jgm)object0).b) {
            return false;
        }
        if(!jgq.b(this.c, ((jgm)object0).c)) {
            return false;
        }
        if(this.d != ((jgm)object0).d) {
            return false;
        }
        if(!jgr.b(this.e, ((jgm)object0).e)) {
            return false;
        }
        if(!jgk.b(this.f, ((jgm)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((jgm)object0).g) ? ibuq.m(this.h, ((jgm)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return this.g == null ? ((((jgl.a(this.b) * 0x1F + this.c) * 0x1F + jgl.a(this.d)) * 0x1F + this.e) * 0x1F + this.f) * 0x1F * 0x1F + this.h.hashCode() : (((((jgl.a(this.b) * 0x1F + this.c) * 0x1F + jgl.a(this.d)) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=" + jgq.a(this.c) + ", autoCorrect=" + this.d + ", keyboardType=" + jgr.a(this.e) + ", imeAction=" + jgk.a(this.f) + ", platformImeOptions=" + this.g + ", hintLocales=" + this.h + ')';
    }
}

