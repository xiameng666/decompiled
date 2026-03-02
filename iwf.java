public final class iwf {
    public int a;
    private final Object b;
    private final int c;
    private final String d;

    public iwf(Object object0, int v, int v1, int v2) {
        if((v2 & 4) != 0) {
            v1 = 0x80000000;
        }
        this(object0, v, v1, "");
    }

    public iwf(Object object0, int v, int v1, String s) {
        this.b = object0;
        this.c = v;
        this.a = v1;
        this.d = s;
    }

    public final iwh a(int v) {
        int v1 = this.a;
        if(v1 != 0x80000000) {
            v = v1;
        }
        if(v == 0x80000000) {
            jie.b("Item.end should be set first");
        }
        return new iwh(this.b, this.c, v, this.d);
    }

    public static iwh b(iwf iwf0) {
        return iwf0.a(0x80000000);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iwf)) {
            return false;
        }
        if(!ibuq.m(this.b, ((iwf)object0).b)) {
            return false;
        }
        if(this.c != ((iwf)object0).c) {
            return false;
        }
        return this.a == ((iwf)object0).a ? ibuq.m(this.d, ((iwf)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? (this.c * 0x1F + this.a) * 0x1F + this.d.hashCode() : ((this.b.hashCode() * 0x1F + this.c) * 0x1F + this.a) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ')';
    }
}

