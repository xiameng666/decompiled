public final class ehzg {
    public final qkb a;
    public final String b;
    public final int c;
    public final boolean d;
    public final qoe e;
    private final boolean f;

    public ehzg(qkb qkb0, String s, int v, qoe qoe0, int v1) {
        if((v1 & 0x20) != 0) {
            qoe0 = qoe.a;
        }
        if((v1 & 4) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        ibuq.f(qoe0, "cancellationBehavior");
        super();
        this.a = qkb0;
        this.b = s;
        this.c = v;
        this.f = false;
        this.d = (v1 & 16) != 0;
        this.e = qoe0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ehzg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ehzg)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ehzg)object0).b)) {
            return false;
        }
        if(this.c != ((ehzg)object0).c) {
            return false;
        }
        return this.d == ((ehzg)object0).d ? this.e == ((ehzg)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        return this.b == null ? (((v * 0x1F * 0x1F + this.c) * 0x1F + 0x4D5) * 0x1F + ehzf.a(this.d)) * 0x1F + this.e.hashCode() : ((((v * 0x1F + this.b.hashCode()) * 0x1F + this.c) * 0x1F + 0x4D5) * 0x1F + ehzf.a(this.d)) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "LottieData(composition=" + this.a + ", minMarker=" + this.b + ", iterations=" + this.c + ", reverse=false, isPlaying=" + this.d + ", cancellationBehavior=" + this.e + ")";
    }
}

