public final class znv implements zoe {
    public final String a;
    public final zhr b;
    public final zhx c;
    public final zhx d;

    public znv(String s, zhr zhr0, zhx zhx0, zhx zhx1) {
        ibuq.f(s, "label");
        super();
        this.a = s;
        this.b = zhr0;
        this.c = zhx0;
        this.d = zhx1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znv)) {
            return false;
        }
        if(!ibuq.m(this.a, ((znv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((znv)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((znv)object0).c) ? ibuq.m(this.d, ((znv)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        zhx zhx0 = this.d;
        if(zhx0 != null) {
            v1 = zhx0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Expansion(label=" + this.a + ", icon=" + this.b + ", foregroundColor=" + this.c + ", backgroundColor=" + this.d + ")";
    }
}

