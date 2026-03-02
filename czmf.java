public final class czmf {
    public final dafz a;
    public final String b;
    public final int c;

    public czmf() {
        throw null;
    }

    public czmf(dafz dafz0, String s, int v) {
        this.a = dafz0;
        this.b = s;
        this.c = v;
    }

    public static czme a() {
        czme czme0 = new czme();
        czme0.b(0);
        return czme0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czmf)) {
            dafz dafz0 = this.a;
            if(dafz0 != null) {
                if(dafz0.equals(((czmf)object0).a)) {
                label_8:
                    String s = this.b;
                    if(s == null) {
                        return ((czmf)object0).b == null ? this.c == ((czmf)object0).c : false;
                    }
                    return s.equals(((czmf)object0).b) ? this.c == ((czmf)object0).c : false;
                }
            }
            else if(((czmf)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return this.c ^ ((v1 ^ 1000003) * 1000003 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "WifiAwareConnectMetadata{wifiAwarePeer=" + this.a + ", password=" + this.b + ", connectionMode=" + this.c + "}";
    }
}

