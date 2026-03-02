public final class iftg {
    public int a;
    public int b;

    public iftg(byte[] arr_b) {
        int v = 0;
        this.a = 0;
        if(arr_b.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int v1 = 2;
        int v2 = (arr_b[3] & 0xFF) << 24 | (arr_b[0] & 0xFF | (arr_b[1] & 0xFF) << 8 | (arr_b[2] & 0xFF) << 16);
        this.b = v2;
        if(v2 == 0) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int v3 = iftn.a(v2) >>> 1;
        while(v < v3) {
            v1 = iftn.b(v1, v1, v2);
            int v4 = v1 ^ 2;
            for(int v5 = v2; v5 != 0; v5 = v6) {
                int v6 = iftn.c(v4, v5);
                v4 = v5;
            }
            if(v4 != 1) {
                throw new IllegalArgumentException("byte array is not an encoded finite field");
            }
            ++v;
            continue;
        }
        this.a = iftn.a(this.b);
    }

    public final int a(int v) {
        int v1 = (1 << this.a) - 2;
        if(v1 == 0) {
            return 1;
        }
        if(v == 0) {
            return 0;
        }
        if(v == 1) {
            return 1;
        }
        if(v1 < 0) {
            v = this.a(v);
            v1 = -v1;
        }
        int v2 = 1;
        while(v1 != 0) {
            if((v1 & 1) == 1) {
                v2 = this.b(v2, v);
            }
            v = this.b(v, v);
            v1 >>>= 1;
        }
        return v2;
    }

    public final int b(int v, int v1) {
        return iftn.b(v, v1, this.b);
    }

    public final boolean c(int v) {
        return this.a == 0x1F ? v >= 0 : v >= 0 && v < 1 << this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && (object0 instanceof iftg) && this.a == ((iftg)object0).a && this.b == ((iftg)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        int v = this.a;
        int v1 = this.b;
        if(v1 == 0) {
            return a.P("0", v, "Finite Field GF(2^", ") = GF(2)[X]/<", "> ");
        }
        int v2 = v1 >>> 1;
        String s = 1 == (v1 & 1) ? "1" : "";
        for(int v3 = 1; v2 != 0; ++v3) {
            if((v2 & 1) == 1) {
                s = a.g(v3, s, "+x^");
            }
            v2 >>>= 1;
        }
        return a.P(s, v, "Finite Field GF(2^", ") = GF(2)[X]/<", "> ");
    }
}

