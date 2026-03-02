public final class rgb {
    public final int a;
    private final ByteString b;
    private final boolean c;
    private final ByteString d;

    public rgb(ByteString hfsf0, boolean z, int v, ByteString hfsf1) {
        this.b = hfsf0;
        this.c = z;
        this.a = v;
        this.d = hfsf1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rgb)) {
            return false;
        }
        if(!ibuq.m(this.b, ((rgb)object0).b)) {
            return false;
        }
        if(this.c != ((rgb)object0).c) {
            return false;
        }
        return this.a == ((rgb)object0).a ? ibuq.m(this.d, ((rgb)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        int v1 = this.d == null ? 0 : this.d.hashCode();
        return this.c ? ((v + 0x4CF) * 0x1F + rgk.b(this.a)) * 0x1F + v1 : ((v + 0x4D5) * 0x1F + rgk.b(this.a)) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "RootOfTrust(verifiedBootKey=" + this.b + ", deviceLocked=" + this.c + ", verifiedBootState=" + rgk.a(this.a) + ", verifiedBootHash=" + this.d + ")";
    }
}

