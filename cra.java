final class cra {
    public hli a;
    public hoz b;
    public hkn c;
    private hks d;

    public cra() {
        this(null);
    }

    public cra(byte[] arr_b) {
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public final hks a() {
        hks hks0 = this.d;
        if(hks0 == null) {
            hks0 = new hks(null);
            this.d = hks0;
        }
        return hks0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cra)) {
            return false;
        }
        if(!ibuq.m(this.c, ((cra)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.a, ((cra)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((cra)object0).b) ? ibuq.m(this.d, ((cra)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        int v2 = this.a == null ? 0 : this.a.hashCode();
        int v3 = this.b == null ? 0 : this.b.hashCode();
        hks hks0 = this.d;
        if(hks0 != null) {
            v = hks0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.c + ", canvas=" + this.a + ", canvasDrawScope=" + this.b + ", borderPath=" + this.d + ')';
    }
}

