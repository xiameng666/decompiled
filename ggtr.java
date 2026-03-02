public final class ggtr {
    public static final ggtr a;
    public final int b;
    public final int c;
    public final int d;
    private static final long e;

    static {
        long v = 0L;
        for(int v1 = 0; v1 < 7; ++v1) {
            v |= ((long)v1) + 1L << ((int)(((long)(" #(+,-0".charAt(v1) - 0x20)) * 3L));
        }
        ggtr.e = v;
        ggtr.a = new ggtr(0, -1, -1);
    }

    public ggtr(int v, int v1, int v2) {
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public static int a(char c) {
        return ((int)(ggtr.e >>> (c - 0x20) * 3 & 7L)) - 1;
    }

    public static int b(String s, int v, int v1) {
        if(v == v1) {
            throw ggws.a("missing precision", s, v - 1);
        }
        int v2 = v;
        int v3 = 0;
        while(v2 < v1) {
            int v4 = (char)(s.charAt(v2) - 0x30);
            if(v4 >= 10) {
                throw ggws.a("invalid precision character", s, v2);
            }
            v3 = v3 * 10 + v4;
            if(v3 > 0xF423F) {
                throw ggws.b("precision too large", s, v, v1);
            }
            ++v2;
            continue;
        }
        if(v3 == 0) {
            if(v1 == v + 1) {
                return 0;
            }
            throw ggws.b("invalid precision", s, v, v1);
        }
        return v3;
    }

    /*
    String Decryptor: 1 succeeded, 2 failed
    - Failure: c(v4<ggtr>)<boolean> @ Lggtr;->f(Ljava/lang/StringBuilder;)V+0h
    - Failure: c(v4<ggtr>)<boolean> @ Lggtr;->e(IZ)Z+0h
    */
    public final boolean c() {
        return this == ggtr.a;
    }

    public final boolean d() {
        return (this.b & 0x80) != 0;
    }

    public final boolean e(int v, boolean z) {
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ggtr) && ((ggtr)object0).b == this.b && ((ggtr)object0).c == this.c && ((ggtr)object0).d == this.d;
    }

    public final void f(StringBuilder stringBuilder0) {
        if(!this.c()) {
            int v = this.b;
            for(int v1 = 0; 1 << v1 <= (v & 0xFFFFFF7F); ++v1) {
                if((v & 0xFFFFFF7F & 1 << v1) != 0) {
                    stringBuilder0.append(" #(+,-0".charAt(v1));
                }
            }
            int v2 = this.c;
            if(v2 != -1) {
                stringBuilder0.append(v2);
            }
            int v3 = this.d;
            if(v3 != -1) {
                stringBuilder0.append('.');
                stringBuilder0.append(v3);
            }
        }
    }

    @Override
    public final int hashCode() {
        return (this.b * 0x1F + this.c) * 0x1F + this.d;
    }
}

