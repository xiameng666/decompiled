public final class ixo implements iwd {
    public final int a;
    public final int b;
    public final long c;
    public final jki d;
    public final ixr e;
    public final jjw f;
    public final int g;
    public final int h;
    public final jkk i;

    public ixo(int v, int v1, long v2, jki jki0, ixr ixr0, jjw jjw0, int v3, int v4, jkk jkk0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = jki0;
        this.e = ixr0;
        this.f = jjw0;
        this.g = v3;
        this.h = v4;
        this.i = jkk0;
        if(!jlp.e(v2, jlp.a) && jlp.a(v2) < 0.0f) {
            jie.b(("lineHeight can\'t be negative (" + jlp.a(v2) + ')'));
        }
    }

    public ixo(int v, jki jki0, int v1) {
        long v2 = (v1 & 4) == 0 ? 0L : jlp.a;
        if(1 == (v1 & 1)) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            jki0 = null;
        }
        this(v, 0, v2, jki0, null, null, 0, 0, null);
    }

    public final ixo a(ixo ixo0) {
        return ixo0 == null ? this : ixp.a(this, ixo0.a, ixo0.b, ixo0.c, ixo0.d, ixo0.e, ixo0.f, ixo0.g, ixo0.h, ixo0.i);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ixo)) {
            return false;
        }
        if(!jjy.b(this.a, ((ixo)object0).a)) {
            return false;
        }
        if(!jka.b(this.b, ((ixo)object0).b)) {
            return false;
        }
        if(!jlp.e(this.c, ((ixo)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ixo)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((ixo)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((ixo)object0).f)) {
            return false;
        }
        if(!jjr.b(this.g, ((ixo)object0).g)) {
            return false;
        }
        return jjn.b(this.h, ((ixo)object0).h) ? ibuq.m(this.i, ((ixo)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((this.a * 0x1F + this.b) * 0x1F + jlo.a(this.c)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + this.g) * 0x1F + this.h) * 0x1F;
        jkk jkk0 = this.i;
        if(jkk0 != null) {
            v = jkk0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "ParagraphStyle(textAlign=" + jjy.a(this.a) + ", textDirection=" + jka.a(this.b) + ", lineHeight=" + jlp.d(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + jjr.a(this.g) + ", hyphens=" + jjn.a(this.h) + ", textMotion=" + this.i + ')';
    }
}

