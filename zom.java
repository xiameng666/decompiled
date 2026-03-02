public final class zom {
    public final String a;
    public final zht b;

    public zom(String s, zht zht0) {
        ibuq.f(s, "text");
        super();
        this.a = s;
        this.b = zht0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zom)) {
            return false;
        }
        return ibuq.m(this.a, ((zom)object0).a) ? ibuq.m(this.b, ((zom)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ASFooterItem(text=" + this.a + ", link=" + this.b + ")";
    }
}

