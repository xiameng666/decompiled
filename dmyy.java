import java.util.List;

public final class dmyy {
    public final hkhr a;
    public final List b;

    public dmyy() {
        this(null);
    }

    public dmyy(hkhr hkhr0, List list0) {
        this.a = hkhr0;
        this.b = list0;
    }

    public dmyy(byte[] arr_b) {
        this(null, ibps.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmyy)) {
            return false;
        }
        return ibuq.m(this.a, ((dmyy)object0).a) ? ibuq.m(this.b, ((dmyy)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        hkhr hkhr0 = this.a;
        if(hkhr0 == null) {
            return this.b.hashCode();
        }
        if(((ProtoLiteMessage)hkhr0).isImmutable()) {
            return ((ProtoLiteMessage)hkhr0).s() * 0x1F + this.b.hashCode();
        }
        int v = hkhr0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hkhr0).s();
            hkhr0.memoizedHashCode = v;
        }
        return v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "BankAccountScreenState(paymentMethod=" + this.a + ", transactions=" + this.b + ")";
    }
}

