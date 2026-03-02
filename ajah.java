public final class ajah {
    public final boolean a;
    public final ggeo b;
    public final int c;

    public ajah() {
        throw null;
    }

    public ajah(boolean z, ggeo ggeo0, int v) {
        this.a = z;
        this.b = ggeo0;
        this.c = v;
    }

    public static ajag a() {
        ajag ajag0 = new ajag();
        ajag0.b(ggnf.a);
        ajag0.a = 1;
        ajag0.c(false);
        return ajag0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ajah) && this.a == ((ajah)object0).a && this.b.equals(((ajah)object0).b)) {
            int v = this.c;
            int v1 = ((ajah)object0).c;
            if(v != 0) {
                return v == v1;
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        aiye.b(this.c);
        return this.c ^ (((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ReadResult{hasAccessDeniedError=" + this.a + ", blockDataMap=" + this.b + ", resultType=" + aiye.a(this.c) + "}";
    }
}

