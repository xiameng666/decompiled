public final class aaqx extends aaqy {
    public final grxw a;
    public final grxw b;
    public final aanx c;

    public aaqx(grxw grxw0, grxw grxw1, aanx aanx0) {
        ibuq.f(aanx0, "navStackHead");
        super();
        this.a = grxw0;
        this.b = grxw1;
        this.c = aanx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aaqx)) {
            return false;
        }
        if(!ibuq.m(this.a, ((aaqx)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((aaqx)object0).b) ? ibuq.m(this.c, ((aaqx)object0).c) : false;
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
        grxw grxw1 = this.b;
        if(((ProtoLiteMessage)grxw1).isImmutable()) {
            return (v * 0x1F + ((ProtoLiteMessage)grxw1).s()) * 0x1F + this.c.hashCode();
        }
        int v2 = grxw1.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)grxw1).s();
            grxw1.memoizedHashCode = v2;
        }
        return (v * 0x1F + v2) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PagerFrameContent(topNavKey=" + this.a + ", leftNavKey=" + this.b + ", navStackHead=" + this.c + ")";
    }
}

