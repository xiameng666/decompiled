public final class aivt {
    public final gged_interceptors a;
    public final int b;
    public final int c;
    public final aiwg d;
    public final aiwl e;
    public final aiwn f;

    public aivt() {
        throw null;
    }

    public aivt(gged_interceptors gged0, int v, int v1, aiwg aiwg0, aiwl aiwl0, aiwn aiwn0) {
        this.a = gged0;
        this.b = v;
        this.c = v1;
        this.d = aiwg0;
        this.e = aiwl0;
        this.f = aiwn0;
    }

    public static aivs a() {
        aivs aivs0 = new aivs();
        aivs0.c(0);
        aivs0.e(0);
        aivs0.f(aiwg.a);
        aivs0.a = null;
        aivs0.d(aiwn.c);
        return aivs0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aivt) && ggia.i(this.a, ((aivt)object0).a) && this.b == ((aivt)object0).b && this.c == ((aivt)object0).c && this.d.equals(((aivt)object0).d)) {
            aiwl aiwl0 = this.e;
            if(aiwl0 == null) {
                return ((aivt)object0).e == null ? this.f.equals(((aivt)object0).f) : false;
            }
            return aiwl0.equals(((aivt)object0).e) ? this.f.equals(((aivt)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode();
        return this.e == null ? this.f.hashCode() ^ v * 1000003 * 1000003 : this.f.hashCode() ^ (v * 1000003 ^ this.e.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CloudSyncRestoreResult{bytes=" + this.a + ", downloadedNumBytes=" + this.b + ", numSourceDevices=" + this.c + ", resultType=" + this.d + ", syncResult=" + this.e + ", encryption=" + this.f + "}";
    }
}

