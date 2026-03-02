public final class dmyz {
    public final dxev a;
    public final String b;
    private final boolean c;

    public dmyz(dxev dxev0, String s) {
        ibuq.f(s, "defaultClientTokenId");
        super();
        this.a = dxev0;
        this.b = s;
        this.c = false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmyz)) {
            return false;
        }
        return ibuq.m(this.a, ((dmyz)object0).a) ? ibuq.m(this.b, ((dmyz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        dxev dxev0 = this.a;
        if(((ProtoLiteMessage)dxev0).isImmutable()) {
            return (((ProtoLiteMessage)dxev0).s() * 0x1F + this.b.hashCode()) * 0x1F + 0x4D5;
        }
        int v = dxev0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)dxev0).s();
            dxev0.memoizedHashCode = v;
        }
        return (v * 0x1F + this.b.hashCode()) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "FopDetailsData(paymentMethodData=" + this.a + ", defaultClientTokenId=" + this.b + ", hasOtherCardFromSameSp=false)";
    }
}

