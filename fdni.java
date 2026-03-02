public final class fdni {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public fdni() {
        throw null;
    }

    public fdni(String s, int v, int v1, int v2, String s1, int v3, int v4) {
        this.a = s;
        this.d = v;
        this.e = v1;
        this.b = v2;
        this.c = s1;
        this.f = v3;
        this.g = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fdni) && this.a.equals(((fdni)object0).a)) {
            int v = this.d;
            int v1 = ((fdni)object0).d;
            if(v == 0) {
                throw null;
            }
            if(v == v1) {
                int v2 = this.e;
                int v3 = ((fdni)object0).e;
                if(v2 == 0) {
                    throw null;
                }
                if(v2 == v3 && this.b == ((fdni)object0).b) {
                    String s = this.c;
                    if(s != null) {
                        if(s.equals(((fdni)object0).c)) {
                        label_16:
                            int v4 = this.f;
                            if(v4 != 0) {
                                if(v4 == ((fdni)object0).f) {
                                label_21:
                                    int v5 = this.g;
                                    int v6 = ((fdni)object0).g;
                                    if(v5 != 0) {
                                        return v5 == v6;
                                    }
                                    throw null;
                                }
                            }
                            else if(((fdni)object0).f == 0) {
                                goto label_21;
                            }
                        }
                    }
                    else if(((fdni)object0).c == null) {
                        goto label_16;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = this.d;
        fdot.b(v1);
        int v2 = this.e;
        if(v2 == 0) {
            throw null;
        }
        int v3 = 0;
        int v4 = ((((v * 1000003 ^ v1) * 1000003 ^ v2) * 1000003 ^ this.b) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003;
        int v5 = this.f;
        if(v5 != 0) {
            v3 = v5;
        }
        fdok.b(this.g);
        return this.g ^ (v4 ^ v3) * 1000003;
    }

    @Override
    public final String toString() {
        String s = "null";
        String s1 = this.d == 0 ? "null" : fdot.a(this.d);
        String s2 = this.e == 0 ? "null" : Integer.toString(this.e - 1);
        String s3 = this.f == 0 ? "null" : Integer.toString(this.f - 1);
        int v = this.g;
        if(v != 0) {
            s = fdok.a(v);
        }
        return "LoggableRpc{packageName=" + this.a + ", transport=" + s1 + ", type=" + s2 + ", numberOfBytes=" + this.b + ", path=" + this.c + ", rpcDroppedReason=" + s3 + ", messageDirection=" + s + "}";
    }
}

