public final class zoq extends aaem {
    public final grxw a;
    public final String b;
    public final String c;
    public final String d;
    public final zht e;

    public zoq(grxw grxw0, String s, String s1, String s2, zht zht0) {
        ibuq.f(s, "titleText");
        ibuq.f(s1, "descriptionText");
        ibuq.f(s2, "hyperlinkText");
        super();
        this.a = grxw0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = zht0;
    }

    @Override  // aaem
    public final int a() {
        return 7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zoq)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zoq)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((zoq)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((zoq)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((zoq)object0).d) ? ibuq.m(this.e, ((zoq)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.a;
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
        int v2 = ((v * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        return this.e == null ? v2 * 0x1F : v2 * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "SegmentHeaderListItem(resourceKey=" + this.a + ", titleText=" + this.b + ", descriptionText=" + this.c + ", hyperlinkText=" + this.d + ", hyperlink=" + this.e + ")";
    }
}

