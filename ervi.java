public final class ervi {
    public final String a;
    public final String b;
    public final String c;
    public final ibth d;
    public final boolean e;
    public final String f;

    public ervi(String s, String s1, String s2, ibth ibth0) {
        this(s, s1, s2, ibth0, false, null);
    }

    public ervi(String s, String s1, String s2, ibth ibth0, boolean z, String s3) {
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(s2, "action");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = ibth0;
        this.e = z;
        this.f = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ervi)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ervi)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ervi)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((ervi)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((ervi)object0).d)) {
            return false;
        }
        return this.e == ((ervi)object0).e ? ibuq.m(this.f, ((ervi)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        int v1 = this.f == null ? 0 : this.f.hashCode();
        return this.e ? (v * 0x1F + 0x4CF) * 0x1F + v1 : (v * 0x1F + 0x4D5) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "RecoveryOption(title=" + this.a + ", description=" + this.b + ", action=" + this.c + ", onAction=" + this.d + ", isWarning=" + this.e + ", iconContentDescriptor=" + this.f + ")";
    }
}

