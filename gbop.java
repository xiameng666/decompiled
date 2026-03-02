import java.util.List;

public final class gbop {
    public final hdrl a;
    public final List b;

    public gbop(hdrl hdrl0, List list0) {
        ibuq.f(hdrl0, "rootNode");
        ibuq.f(list0, "additionalDataList");
        super();
        this.a = hdrl0;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbop)) {
            return false;
        }
        return ibuq.m(this.a, ((gbop)object0).a) ? ibuq.m(this.b, ((gbop)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        hdrl hdrl0 = this.a;
        if(((ProtoLiteMessage)hdrl0).isImmutable()) {
            return ((ProtoLiteMessage)hdrl0).s() * 0x1F + this.b.hashCode();
        }
        int v = hdrl0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)hdrl0).s();
            hdrl0.memoizedHashCode = v;
        }
        return v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "UiResources(rootNode=" + this.a + ", additionalDataList=" + this.b + ")";
    }
}

