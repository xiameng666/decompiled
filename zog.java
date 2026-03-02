public final class zog extends aaex {
    public final String a;
    public final String b;
    public final String c;
    public final zht d;
    public final gged_interceptors e;
    private final grxw f;

    public zog(grxw grxw0, String s, String s1, String s2, zht zht0, gged_interceptors gged0) {
        ibuq.f(s, "title");
        ibuq.f(s1, "description");
        ibuq.f(s2, "hyperlinkText");
        ibuq.f(gged0, "stacks");
        super(grxw0);
        this.f = grxw0;
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = zht0;
        this.e = gged0;
    }

    @Override  // aaem
    public final int a() {
        return 13;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zog)) {
            return false;
        }
        if(!ibuq.m(this.f, ((zog)object0).f)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zog)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zog)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zog)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((zog)object0).d) ? ibuq.m(this.e, ((zog)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.f;
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
        int v2 = ((v * 0x1F + this.a.hashCode()) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
        return this.d == null ? v2 * 0x1F * 0x1F + this.e.hashCode() : (v2 * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "CollectionCardListItem(resourceKey=" + this.f + ", title=" + this.a + ", description=" + this.b + ", hyperlinkText=" + this.c + ", hyperlink=" + this.d + ", stacks=" + this.e + ")";
    }
}

