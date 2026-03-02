public final class jff {
    public final jdz a;
    public final jeu b;
    public final int c;
    public final int d;
    public final Object e;

    public jff(jdz jdz0, jeu jeu0, int v, int v1) {
        this.a = jdz0;
        this.b = jeu0;
        this.c = v;
        this.d = v1;
        this.e = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jff)) {
            return false;
        }
        if(!ibuq.m(this.a, ((jff)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((jff)object0).b)) {
            return false;
        }
        if(!jem.b(this.c, ((jff)object0).c)) {
            return false;
        }
        return jen.b(this.d, ((jff)object0).d) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? ((this.b.l * 0x1F + this.c) * 0x1F + this.d) * 0x1F : (((this.a.hashCode() * 0x1F + this.b.l) * 0x1F + this.c) * 0x1F + this.d) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + jem.a(this.c) + ", fontSynthesis=" + jen.a(this.d) + ", resourceLoaderCacheKey=null)";
    }
}

