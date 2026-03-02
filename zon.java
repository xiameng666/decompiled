public final class zon extends aaex {
    public final gged_interceptors a;
    private final grxw b;

    public zon(grxw grxw0, gged_interceptors gged0) {
        ibuq.f(gged0, "items");
        super(grxw0);
        this.b = grxw0;
        this.a = gged0;
    }

    @Override  // aaem
    public final int a() {
        return 6;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zon)) {
            return false;
        }
        return ibuq.m(this.b, ((zon)object0).b) ? ibuq.m(this.a, ((zon)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        grxw grxw0 = this.b;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            return ((ProtoLiteMessage)grxw0).s() * 0x1F + this.a.hashCode();
        }
        int v = grxw0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v;
        }
        return v * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "FooterListItem(resourceKey=" + this.b + ", items=" + this.a + ")";
    }
}

