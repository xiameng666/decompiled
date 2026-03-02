public final class aaqk extends aalp {
    public final grxw a;
    public final grxw b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public aaqk(grxw grxw0, grxw grxw1, boolean z, boolean z1, boolean z2) {
        this.a = grxw0;
        this.b = grxw1;
        this.c = z;
        this.d = z1;
        this.e = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aaqk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((aaqk)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((aaqk)object0).b)) {
            return false;
        }
        if(this.c != ((aaqk)object0).c) {
            return false;
        }
        return this.d == ((aaqk)object0).d ? this.e == ((aaqk)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v1;
        grxw grxw0 = this.a;
        int v = 0;
        if(grxw0 == null) {
            v1 = 0;
        }
        else if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v1 = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v2 = grxw0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        grxw grxw1 = this.b;
        if(grxw1 != null) {
            if(((ProtoLiteMessage)grxw1).isImmutable()) {
                return (((v1 * 0x1F + ((ProtoLiteMessage)grxw1).s()) * 0x1F + aaqj.a(this.c)) * 0x1F + aaqj.a(this.d)) * 0x1F + aaqj.a(this.e);
            }
            v = grxw1.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)grxw1).s();
                grxw1.memoizedHashCode = v;
            }
        }
        return (((v1 * 0x1F + v) * 0x1F + aaqj.a(this.c)) * 0x1F + aaqj.a(this.d)) * 0x1F + aaqj.a(this.e);
    }

    @Override
    public final String toString() {
        return "WelcomeHeaderBlueprint(welcomeHeaderKey=" + this.a + ", simpleHeaderKey=" + this.b + ", isPlaceholder=" + this.c + ", isTrampoline=" + this.d + ", hasNavKey=" + this.e + ")";
    }
}

