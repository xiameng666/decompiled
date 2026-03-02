public final class dnkk {
    public final dxev a;
    public final String b;
    public final boolean c;

    public dnkk(dxev dxev0, String s, boolean z) {
        ibuq.f(dxev0, "paymentMethodData");
        ibuq.f(s, "defaultClientTokenId");
        super();
        this.a = dxev0;
        this.b = s;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dnkk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dnkk)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((dnkk)object0).b) ? this.c == ((dnkk)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v;
        dxev dxev0 = this.a;
        if(((ProtoLiteMessage)dxev0).isImmutable()) {
            v = ((ProtoLiteMessage)dxev0).s();
        }
        else {
            int v1 = dxev0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)dxev0).s();
                dxev0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = v * 0x1F + this.b.hashCode();
        return this.c ? v2 * 0x1F + 0x4CF : v2 * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "FopDetailsData(paymentMethodData=" + this.a + ", defaultClientTokenId=" + this.b + ", hasOtherCardFromSameSp=" + this.c + ")";
    }
}

