public final class qof extends qoj {
    private final Integer a;
    private final Integer b;
    private final boolean c;
    private final Integer d;

    public qof() {
        this(null, null, true);
    }

    public qof(Integer integer0, Integer integer1, boolean z) {
        this.a = integer0;
        this.b = integer1;
        this.c = z;
        if(integer1 == null) {
            integer1 = null;
        }
        else if(!z) {
            integer1 = (int)(((int)integer1) - 1);
        }
        this.d = integer1;
    }

    @Override  // qoj
    public final float a(qkb qkb0) {
        return this.d == null ? 1.0f : ibwt.f(((float)(((int)this.d))) / qkb0.l, 0.0f, 1.0f);
    }

    @Override  // qoj
    public final float b(qkb qkb0) {
        return this.a == null ? 0.0f : ibwt.f(((float)(((int)this.a))) / qkb0.l, 0.0f, 1.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof qof)) {
            return false;
        }
        if(!ibuq.m(this.a, ((qof)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((qof)object0).b) ? this.c == ((qof)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Integer integer0 = this.b;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return this.c ? (v1 * 0x1F + v) * 0x1F + 0x4CF : (v1 * 0x1F + v) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Frame(min=" + this.a + ", max=" + this.b + ", maxInclusive=" + this.c + ")";
    }
}

