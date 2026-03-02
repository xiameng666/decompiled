public final class zhr {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public zhr(Integer integer0, String s, String s1, String s2, int v, int v1) {
        ibuq.f(s, "lightUrl");
        ibuq.f(s1, "darkUrl");
        ibuq.f(s2, "contentDescription");
        super();
        this.a = integer0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = v;
        this.f = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zhr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zhr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zhr)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zhr)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((zhr)object0).d)) {
            return false;
        }
        return this.e == ((zhr)object0).e ? this.f == ((zhr)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e) * 0x1F + this.f;
    }

    @Override
    public final String toString() {
        return "ASImage(placeholder=" + this.a + ", lightUrl=" + this.b + ", darkUrl=" + this.c + ", contentDescription=" + this.d + ", widthDp=" + this.e + ", heightDp=" + this.f + ")";
    }
}

