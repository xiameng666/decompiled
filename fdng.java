public final class fdng {
    public final fduq a;
    public final int b;
    public final int c;
    public final int d;

    public fdng() {
        throw null;
    }

    public fdng(int v, int v1, fduq fduq0, int v2) {
        this.b = v;
        this.c = v1;
        this.a = fduq0;
        this.d = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fdng)) {
            int v = this.b;
            int v1 = ((fdng)object0).b;
            if(v == 0) {
                throw null;
            }
            if(v == v1) {
                int v2 = this.c;
                int v3 = ((fdng)object0).c;
                if(v2 == 0) {
                    throw null;
                }
                if(v2 == v3 && this.a.equals(((fdng)object0).a)) {
                    int v4 = this.d;
                    int v5 = ((fdng)object0).d;
                    if(v4 != 0) {
                        return v4 == v5;
                    }
                    throw null;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        fdot.b(v);
        int v1 = this.c;
        if(v1 == 0) {
            throw null;
        }
        fdok.b(this.d);
        return this.d ^ (((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ this.a.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        String s = "null";
        String s1 = this.b == 0 ? "null" : fdot.a(this.b);
        String s2 = this.c == 0 ? "null" : Integer.toString(this.c - 1);
        int v = this.d;
        String s3 = String.valueOf(this.a);
        if(v != 0) {
            s = fdok.a(v);
        }
        return "LoggableDataItem{transport=" + s1 + ", eventType=" + s2 + ", dataItemRecord=" + s3 + ", messageDirection=" + s + "}";
    }
}

