public final class aamm {
    public final grxw a;
    public final gsam b;
    public final String c;

    public aamm() {
        throw null;
    }

    public aamm(grxw grxw0, gsam gsam0, String s) {
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.a = grxw0;
        if(gsam0 == null) {
            throw new NullPointerException("Null welcomeScreenIntro");
        }
        this.b = gsam0;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aamm) && ((ProtoLiteMessage)this.a).equals(((aamm)object0).a) && ((ProtoLiteMessage)this.b).equals(((aamm)object0).b)) {
            return this.c == null ? ((aamm)object0).c == null : this.c.equals(((aamm)object0).c);
        }
        return false;
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
        gsam gsam0 = this.b;
        if(((ProtoLiteMessage)gsam0).isImmutable()) {
            int v2 = ((ProtoLiteMessage)gsam0).s();
            return this.c == null ? ((v ^ 1000003) * 1000003 ^ v2) * 1000003 : this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ v2) * 1000003;
        }
        int v3 = gsam0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)gsam0).s();
            gsam0.memoizedHashCode = v3;
        }
        return this.c == null ? ((v ^ 1000003) * 1000003 ^ v3) * 1000003 : this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ v3) * 1000003;
    }

    @Override
    public final String toString() {
        return "WelcomeScreenIntroItem{resourceKey=" + this.a.toString() + ", welcomeScreenIntro=" + this.b.toString() + ", displayEmail=" + this.c + "}";
    }
}

