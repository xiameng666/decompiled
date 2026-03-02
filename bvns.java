public final class bvns {
    public final String a;
    public final hgoc b;
    public final String c;
    public final String d;
    public final Integer e;

    public bvns(String s, hgoc hgoc0, String s1, String s2, Integer integer0, int v) {
        if((v & 2) != 0) {
            hgoc0 = hgod.a(((ProtoLiteMessage)hgoc.a).v_newBuilder()).a();
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 16) != 0) {
            integer0 = null;
        }
        ibuq.f(s, "accountName");
        ibuq.f(hgoc0, "campaignContext");
        super();
        this.a = s;
        this.b = hgoc0;
        this.c = s1;
        this.d = s2;
        this.e = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvns)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bvns)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bvns)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((bvns)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((bvns)object0).d) ? ibuq.m(this.e, ((bvns)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() * 0x1F;
        hgoc hgoc0 = this.b;
        if(((ProtoLiteMessage)hgoc0).isImmutable()) {
            v1 = ((ProtoLiteMessage)hgoc0).s();
        }
        else {
            int v2 = hgoc0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)hgoc0).s();
                hgoc0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = 0;
        int v4 = this.c == null ? 0 : this.c.hashCode();
        int v5 = this.d == null ? 0 : this.d.hashCode();
        Integer integer0 = this.e;
        if(integer0 != null) {
            v3 = integer0.hashCode();
        }
        return (((v + v1) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3;
    }

    @Override
    public final String toString() {
        return "FlexagonRequestMetadata(accountName=" + this.a + ", campaignContext=" + this.b + ", requestedCampaignId=" + this.c + ", entryPoint=" + this.d + ", sessionId=" + this.e + ")";
    }
}

