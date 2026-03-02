public final class zuu extends aaex {
    public final gsam a;
    public final aatc b;
    public final String c;
    private final grxw d;

    public zuu(grxw grxw0, gsam gsam0, aatc aatc0, String s) {
        super(grxw0);
        this.d = grxw0;
        this.a = gsam0;
        this.b = aatc0;
        this.c = s;
    }

    @Override  // aaem
    public final int a() {
        return 8;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zuu)) {
            return false;
        }
        if(!ibuq.m(this.d, ((zuu)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.a, ((zuu)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((zuu)object0).b) ? ibuq.m(this.c, ((zuu)object0).c) : false;
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
        gsam gsam0 = this.a;
        if(((ProtoLiteMessage)gsam0).isImmutable()) {
            v2 = ((ProtoLiteMessage)gsam0).s();
        }
        else {
            int v3 = gsam0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)gsam0).s();
                gsam0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        aatc aatc0 = this.b;
        if(((ProtoLiteMessage)aatc0).isImmutable()) {
            int v4 = ((ProtoLiteMessage)aatc0).s();
            return this.c == null ? ((v * 0x1F + v2) * 0x1F + v4) * 0x1F : ((v * 0x1F + v2) * 0x1F + v4) * 0x1F + this.c.hashCode();
        }
        int v5 = aatc0.memoizedHashCode;
        if(v5 == 0) {
            v5 = ((ProtoLiteMessage)aatc0).s();
            aatc0.memoizedHashCode = v5;
        }
        return this.c == null ? ((v * 0x1F + v2) * 0x1F + v5) * 0x1F : ((v * 0x1F + v2) * 0x1F + v5) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "WelcomeScreenIntroListItem1(itemResourceKey=" + this.d + ", welcomeScreenIntro=" + this.a + ", particleDiscData=" + this.b + ", displayEmail=" + this.c + ")";
    }
}

