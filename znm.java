public final class znm extends aaex {
    public final grxo a;
    public final zoh b;
    public final boolean c;
    private final grxw d;

    public znm(grxw grxw0, grxo grxo0, zoh zoh0, boolean z) {
        ibuq.f(grxw0, "resourceKey");
        ibuq.f(grxo0, "promptItem");
        ibuq.f(zoh0, "stackPosition");
        super(grxw0);
        this.d = grxw0;
        this.a = grxo0;
        this.b = zoh0;
        this.c = z;
    }

    @Override  // aaem
    public final int a() {
        return 9;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znm)) {
            return false;
        }
        if(!ibuq.m(this.d, ((znm)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.a, ((znm)object0).a)) {
            return false;
        }
        return this.b == ((znm)object0).b ? this.c == ((znm)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v;
        grxw grxw0 = this.d;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v1 = grxw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        grxo grxo0 = this.a;
        if(((ProtoLiteMessage)grxo0).isImmutable()) {
            v2 = ((ProtoLiteMessage)grxo0).s();
        }
        else {
            int v3 = grxo0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)grxo0).s();
                grxo0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        int v4 = ((v * 0x1F + v2) * 0x1F + this.b.hashCode()) * 0x1F;
        return this.c ? v4 + 0x4CF : v4 + 0x4D5;
    }

    @Override
    public final String toString() {
        return "AdviceCardListItem1(resourceKey=" + this.d + ", promptItem=" + this.a + ", stackPosition=" + this.b + ", isExpanded=" + this.c + ")";
    }
}

