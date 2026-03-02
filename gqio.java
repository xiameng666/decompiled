public final class gqio {
    public final gqgf a;
    public final boolean b;
    public final boolean c;

    public gqio() {
        throw null;
    }

    public gqio(gqgf gqgf0, boolean z, boolean z1) {
        this.a = gqgf0;
        this.b = z;
        this.c = z1;
    }

    public static gqin a() {
        gqin gqin0 = new gqin();
        gqin0.a = null;
        gqin0.b(false);
        gqin0.b = true;
        gqin0.c = (byte)(gqin0.c | 2);
        return gqin0;
    }

    public static gqio b() {
        return gqio.a().a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gqio)) {
            gqgf gqgf0 = this.a;
            if(gqgf0 == null) {
                return ((gqio)object0).a == null ? this.b == ((gqio)object0).b && this.c == ((gqio)object0).c : false;
            }
            return gqgf0.equals(((gqio)object0).a) ? this.b == ((gqio)object0).b && this.c == ((gqio)object0).c : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        int v1 = 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(this.c) {
            v1 = 0x4CF;
        }
        return ((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "ParsingOptions{defaultRegion=" + this.a + ", keepRawInput=" + this.b + ", stripNationalPrefixAfterCountryCode=" + this.c + "}";
    }
}

