public final class dtyx {
    public final gtxg a;
    public final hjzq b;
    public final gtxx c;
    private final gtxa d;

    public dtyx(gtxg gtxg0, hjzq hjzq0, gtxa gtxa0, gtxx gtxx0) {
        ibuq.f(gtxg0, "mdocInfo");
        ibuq.f(hjzq0, "displayConfig");
        ibuq.f(gtxa0, "mdocData");
        ibuq.f(gtxx0, "mobileDocumentInfo");
        super();
        this.a = gtxg0;
        this.b = hjzq0;
        this.d = gtxa0;
        this.c = gtxx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dtyx)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dtyx)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dtyx)object0).b)) {
            return false;
        }
        return ibuq.m(this.d, ((dtyx)object0).d) ? ibuq.m(this.c, ((dtyx)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v4;
        int v2;
        int v;
        gtxg gtxg0 = this.a;
        if(((ProtoLiteMessage)gtxg0).isImmutable()) {
            v = ((ProtoLiteMessage)gtxg0).s();
        }
        else {
            int v1 = gtxg0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)gtxg0).s();
                gtxg0.memoizedHashCode = v1;
            }
            v = v1;
        }
        hjzq hjzq0 = this.b;
        if(((ProtoLiteMessage)hjzq0).isImmutable()) {
            v2 = ((ProtoLiteMessage)hjzq0).s();
        }
        else {
            int v3 = hjzq0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)hjzq0).s();
                hjzq0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        gtxa gtxa0 = this.d;
        if(((ProtoLiteMessage)gtxa0).isImmutable()) {
            v4 = ((ProtoLiteMessage)gtxa0).s();
        }
        else {
            int v5 = gtxa0.memoizedHashCode;
            if(v5 == 0) {
                v5 = ((ProtoLiteMessage)gtxa0).s();
                gtxa0.memoizedHashCode = v5;
            }
            v4 = v5;
        }
        gtxx gtxx0 = this.c;
        if(((ProtoLiteMessage)gtxx0).isImmutable()) {
            return ((v * 0x1F + v2) * 0x1F + v4) * 0x1F + ((ProtoLiteMessage)gtxx0).s();
        }
        int v6 = gtxx0.memoizedHashCode;
        if(v6 == 0) {
            v6 = ((ProtoLiteMessage)gtxx0).s();
            gtxx0.memoizedHashCode = v6;
        }
        return ((v * 0x1F + v2) * 0x1F + v4) * 0x1F + v6;
    }

    @Override
    public final String toString() {
        return "IdCard(mdocInfo=" + this.a + ", displayConfig=" + this.b + ", mdocData=" + this.d + ", mobileDocumentInfo=" + this.c + ")";
    }
}

