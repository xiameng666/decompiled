public final class bxxd {
    public final String a;
    public final String b;
    public final byfq c;
    private final String d;

    public bxxd(String s, String s1, String s2, byfq byfq0) {
        ibuq.f(s, "packageKey");
        ibuq.f(s1, "packageName");
        ibuq.f(s2, "type");
        ibuq.f(byfq0, "entry");
        super();
        this.a = s;
        this.b = s1;
        this.d = s2;
        this.c = byfq0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bxxd)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bxxd)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bxxd)object0).b)) {
            return false;
        }
        return ibuq.m(this.d, ((bxxd)object0).d) ? ibuq.m(this.c, ((bxxd)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.d.hashCode();
        byfq byfq0 = this.c;
        if(((ProtoLiteMessage)byfq0).isImmutable()) {
            return v * 0x1F + ((ProtoLiteMessage)byfq0).s();
        }
        int v1 = byfq0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)byfq0).s();
            byfq0.memoizedHashCode = v1;
        }
        return v * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "PerTypeRegistryEntry(packageKey=" + this.a + ", packageName=" + this.b + ", type=" + this.d + ", entry=" + this.c + ")";
    }
}

