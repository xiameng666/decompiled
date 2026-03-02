public final class bcrj {
    public final String a;
    public final String b;
    public final String c;
    public final gged_interceptors d;

    public bcrj() {
        throw null;
    }

    public bcrj(String s, String s1, String s2, gged_interceptors gged0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        if(gged0 == null) {
            throw new NullPointerException("Null telephonyPhoneNumbers");
        }
        this.d = gged0;
    }

    public static bcrj a(String s, String s1, String s2, gged_interceptors gged0) {
        if(gged0 == null) {
            gged0 = ggna.a;
        }
        if(s2 == null) {
            s2 = "";
        }
        if(s1 == null) {
            s1 = "";
        }
        if(s == null) {
            s = "";
        }
        return new bcrj(s, s1, s2, gged0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bcrj) && this.a.equals(((bcrj)object0).a) && this.b.equals(((bcrj)object0).b) && this.c.equals(((bcrj)object0).c) && ggia.i(this.d, ((bcrj)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "TipInfo{imsi=" + this.a + ", number=" + this.b + ", iccid=" + this.c + ", telephonyPhoneNumbers=" + this.d.toString() + "}";
    }
}

