public final class jpq {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;

    public jpq() {
        this(false, false, 0, false, false, 0x3F);
    }

    public jpq(boolean z, boolean z1, int v) {
        this(1 == (((int)z) | v & 1), ((boolean)(((v & 2) == 0 ? 1 : 0) ^ 1 | ((int)z1))), 1, (v & 4) != 0, true, 0x20);
    }

    public jpq(boolean z, boolean z1, int v, boolean z2, boolean z3, int v1) {
        int v2 = 0;
        this.a = 1 == (((int)z) | v1 & 1);
        this.b = ((v1 & 2) == 0 ? 1 : 0) ^ 1 | ((int)z1);
        this.f = ((v1 & 4) == 0 ? 1 : 0) ^ 1 | v;
        this.c = ((v1 & 8) == 0 ? 1 : 0) ^ 1 | ((int)z2);
        if((v1 & 16) == 0) {
            v2 = 1;
        }
        this.d = v2 ^ 1 | ((int)z3);
        this.e = "";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jpq)) {
            return false;
        }
        if(this.a != ((jpq)object0).a) {
            return false;
        }
        if(this.b != ((jpq)object0).b) {
            return false;
        }
        if(this.f != ((jpq)object0).f) {
            return false;
        }
        return this.c == ((jpq)object0).c ? this.d == ((jpq)object0).d : false;
    }

    @Override
    public final int hashCode() {
        jqh.a(this.f);
        return (((jpp.a(this.a) * 0x1F + jpp.a(this.b)) * 0x1F + 1) * 0x1F + jpp.a(this.c)) * 0x1F + jpp.a(this.d);
    }
}

