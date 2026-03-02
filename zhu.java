public final class zhu {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public zhu(String s, String s1, int v, boolean z) {
        ibuq.f(s, "accountName");
        ibuq.f(s1, "displayName");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zhu)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zhu)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zhu)object0).b)) {
            return false;
        }
        return this.c == ((zhu)object0).c ? this.d == ((zhu)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.d ? (v * 0x1F + this.c) * 0x1F + 0x4CF : (v * 0x1F + this.c) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "ASParticleDiscData(accountName=" + this.a + ", displayName=" + this.b + ", avatarUrlHash=" + this.c + ", isGoogleOneUser=" + this.d + ")";
    }
}

