public final class zny implements zoe {
    public final zhu a;
    public final String b;

    public zny(zhu zhu0, String s) {
        ibuq.f(s, "accessibilityLabel");
        super();
        this.a = zhu0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zny)) {
            return false;
        }
        return ibuq.m(this.a, ((zny)object0).a) ? ibuq.m(this.b, ((zny)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ProfilePicture(particleDiscData=" + this.a + ", accessibilityLabel=" + this.b + ")";
    }
}

