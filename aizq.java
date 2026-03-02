public final class aizq {
    public final int a;
    public final ggfp b;
    public final int c;

    public aizq() {
        throw null;
    }

    public aizq(int v, int v1, ggfp ggfp0) {
        this.c = v;
        this.a = v1;
        this.b = ggfp0;
    }

    public static aizp a() {
        aizp aizp0 = new aizp();
        aizp0.b(0);
        return aizp0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aizq)) {
            int v = this.c;
            int v1 = ((aizq)object0).c;
            if(v != 0) {
                return v == v1 && this.a == ((aizq)object0).a && this.b.equals(((aizq)object0).b);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.c;
        if(v != 0) {
            return this.b.hashCode() ^ ((v ^ 1000003) * 1000003 ^ this.a) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.c) {
            case 1: {
                return "DataStoreUpdateAccessRequest{updateOption=UPGRADE, access=" + this.a + ", packageNames=" + this.b + "}";
            }
            case 2: {
                return "DataStoreUpdateAccessRequest{updateOption=OVERWRITE, access=" + this.a + ", packageNames=" + this.b + "}";
            }
            case 3: {
                return "DataStoreUpdateAccessRequest{updateOption=DELETE, access=" + this.a + ", packageNames=" + this.b + "}";
            }
            default: {
                return "DataStoreUpdateAccessRequest{updateOption=null, access=" + this.a + ", packageNames=" + this.b + "}";
            }
        }
    }
}

