public final class eivu {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    public eivu() {
        throw null;
    }

    public eivu(String s, String s1, String s2, int v, boolean z, boolean z1, boolean z2, boolean z3) {
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        this.a = s;
        this.b = s1;
        if(s2 == null) {
            throw new NullPointerException("Null versionPackage");
        }
        this.c = s2;
        this.d = v;
        this.h = z;
        this.e = z1;
        this.f = z2;
        this.g = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eivu) && this.a.equals(((eivu)object0).a) && this.b.equals(((eivu)object0).b) && this.c.equals(((eivu)object0).c) && this.d == ((eivu)object0).d && this.h == ((eivu)object0).h && this.e == ((eivu)object0).e && this.f == ((eivu)object0).f && this.g == ((eivu)object0).g;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ (this.h ? 0x4CF : 0x4D5)) * 1000003;
        int v2 = this.e ? 0x4CF : 0x4D5;
        int v3 = this.f ? 0x4CF : 0x4D5;
        if(this.g) {
            v = 0x4CF;
        }
        return ((v1 ^ v2) * 1000003 ^ v3) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "Namespace{name=" + this.a + ", configPackage=" + this.b + ", versionPackage=" + this.c + ", version=" + this.d + ", native=" + this.h + ", bootCommit=" + this.e + ", global=" + this.f + ", bootStable=" + this.g + "}";
    }
}

