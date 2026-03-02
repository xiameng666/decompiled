public final class dcwv {
    public final String a;
    public final int b;
    public final boolean c;
    private final int d;

    public dcwv() {
        throw null;
    }

    public dcwv(String s, int v, int v1, boolean z) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = s;
        this.b = v;
        this.d = v1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof dcwv) && this.a.equals(((dcwv)object0).a) && this.b == ((dcwv)object0).b && this.d == ((dcwv)object0).d && this.c == ((dcwv)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.c ? (this.d ^ (v * 1000003 ^ this.b) * 1000003) * 1000003 ^ 0x4CF : (this.d ^ (v * 1000003 ^ this.b) * 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "VendorMetadata{packageName=" + this.a + ", vendorId=" + this.b + ", uxVersion=" + this.d + ", uxReplacement=" + this.c + "}";
    }
}

