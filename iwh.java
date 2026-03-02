public final class iwh {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public iwh(Object object0, int v, int v1) {
        this(object0, v, v1, "");
    }

    public iwh(Object object0, int v, int v1, String s) {
        this.a = object0;
        this.b = v;
        this.c = v1;
        this.d = s;
        if(v <= v1) {
            return;
        }
        jie.a("Reversed range is not supported");
    }

    public static iwh a(iwh iwh0, Object object0, int v, int v1) {
        if((v1 & 1) != 0) {
            object0 = iwh0.a;
        }
        int v2 = (v1 & 2) == 0 ? 0 : iwh0.b;
        if((v1 & 4) != 0) {
            v = iwh0.c;
        }
        return new iwh(object0, v2, v, iwh0.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iwh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((iwh)object0).a)) {
            return false;
        }
        if(this.b != ((iwh)object0).b) {
            return false;
        }
        return this.c == ((iwh)object0).c ? ibuq.m(this.d, ((iwh)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? (this.b * 0x1F + this.c) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}

