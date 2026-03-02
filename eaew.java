public final class eaew extends eafe {
    public final eagy a;
    public final hkjm b;
    public final dzzl c;

    public eaew(eagy eagy0, hkjm hkjm0, dzzl dzzl0) {
        ibuq.f(hkjm0, "card");
        super();
        this.a = eagy0;
        this.b = hkjm0;
        this.c = dzzl0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eaew)) {
            return false;
        }
        if(!ibuq.m(this.a, ((eaew)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((eaew)object0).b) ? ibuq.m(this.c, ((eaew)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        hkjm hkjm0 = this.b;
        if(((ProtoLiteMessage)hkjm0).isImmutable()) {
            return (v + ((ProtoLiteMessage)hkjm0).s()) * 0x1F + this.c.hashCode();
        }
        int v1 = hkjm0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hkjm0).s();
            hkjm0.memoizedHashCode = v1;
        }
        return (v + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DownloadOneCard(viewHeaderInfo=" + this.a + ", card=" + this.b + ", buttonInfo=" + this.c + ")";
    }
}

