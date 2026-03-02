public final class fkrn {
    public final long a;
    public final String b;
    public final fkjt c;
    public final int d;

    static {
        fkrn.a().a();
    }

    public fkrn() {
        throw null;
    }

    public fkrn(long v, String s, int v1, fkjt fkjt0) {
        this.a = v;
        this.b = s;
        this.d = v1;
        this.c = fkjt0;
    }

    public static fkrm a() {
        fkrm fkrm0 = new fkrm();
        fkrm0.b(0L);
        fkrm0.a = "";
        fkrm0.b = 2;
        fkrm0.c(fkjt.a);
        return fkrm0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fkrn) && this.a == ((fkrn)object0).a && this.b.equals(((fkrn)object0).b)) {
            int v = this.d;
            int v1 = ((fkrn)object0).d;
            if(v != 0) {
                return v == v1 && this.c.equals(((fkrn)object0).c);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode();
        int v1 = this.d;
        if(v1 != 0) {
            return this.c.hashCode() ^ (v * 1000003 ^ v1) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        return this.d == 0 ? "MoonLanderSettings{buildId=" + this.a + ", variantId=" + this.b + ", lookupReason=" + "null" + ", offlineLookupStrategy=" + this.c + "}" : "MoonLanderSettings{buildId=" + this.a + ", variantId=" + this.b + ", lookupReason=" + Integer.toString(this.d - 2) + ", offlineLookupStrategy=" + this.c + "}";
    }
}

