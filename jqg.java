public final class jqg {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    public jqg(boolean z) {
        this(z, true, true, true);
    }

    public jqg(boolean z, boolean z1, boolean z2, boolean z3) {
        this(z, z1, z2, z3, null);
    }

    public jqg(boolean z, boolean z1, boolean z2, boolean z3, byte[] arr_b) {
        int v = z ? 0x40000 : 0x40008;
        if(!z3) {
            v |= 0x200;
        }
        super();
        this.a = v;
        this.b = true;
        this.c = z1;
        this.d = z2;
        this.e = true;
        this.f = false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jqg)) {
            return false;
        }
        if(this.a != ((jqg)object0).a) {
            return false;
        }
        return this.c == ((jqg)object0).c ? this.d == ((jqg)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a * 0x1F + 0x4CF) * 0x1F + jqf.a(this.c)) * 0x1F + jqf.a(this.d)) * 0x1F + 0x4CF) * 0x1F + 0x4D5;
    }
}

