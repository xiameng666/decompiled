public final class qoh extends qoj {
    private final String a;
    private final String b;
    private final boolean c;

    public qoh() {
        this(null, null, true);
    }

    public qoh(String s, String s1, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = z;
    }

    @Override  // qoj
    public final float a(qkb qkb0) {
        String s = this.b;
        if(s == null) {
            return 1.0f;
        }
        qpt qpt0 = qkb0.c(s);
        return qpt0 == null ? ibwt.f(0.0f / qkb0.l, 0.0f, 1.0f) : ibwt.f((qpt0.b + ((float)(this.c ? 0 : -1))) / qkb0.l, 0.0f, 1.0f);
    }

    @Override  // qoj
    public final float b(qkb qkb0) {
        String s = this.a;
        if(s == null) {
            return 0.0f;
        }
        qpt qpt0 = qkb0.c(s);
        return qpt0 == null ? ibwt.f(0.0f / qkb0.l, 0.0f, 1.0f) : ibwt.f(qpt0.b / qkb0.l, 0.0f, 1.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof qoh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((qoh)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((qoh)object0).b) ? this.c == ((qoh)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return this.c ? (v1 * 0x1F + v) * 0x1F + 0x4CF : (v1 * 0x1F + v) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Markers(min=" + this.a + ", max=" + this.b + ", maxInclusive=" + this.c + ")";
    }
}

