public final class atlo {
    public final String a;
    public final Long b;
    public final int c;

    public atlo() {
        throw null;
    }

    public atlo(String s, int v, Long long0) {
        this.a = s;
        this.c = v;
        this.b = long0;
    }

    static atlo a(String s, Long long0, int v) {
        atln atln0 = new atln();
        atln0.c(long0);
        if(s == null) {
            throw new NullPointerException("Null pkg");
        }
        atln0.a = s;
        atln0.b(v);
        return atln0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof atlo) && this.a.equals(((atlo)object0).a)) {
            int v = this.c;
            int v1 = ((atlo)object0).c;
            if(v != 0) {
                return v == v1 && this.b.equals(((atlo)object0).b);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = this.c;
        if(v1 != 0) {
            return this.b.hashCode() ^ (v * 1000003 ^ v1) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        return "PostD2dAppTransferInfo{pkg=" + this.a + ", appState=" + atlm.a(this.c) + ", firstOpenTimestamp=" + this.b + "}";
    }
}

