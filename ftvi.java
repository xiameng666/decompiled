public final class ftvi extends ftvk {
    public final frxs a;
    public final boolean b;
    private final fryv c;

    public ftvi(fryv fryv0, frxs frxs0, int v) {
        if((v & 2) != 0) {
            frxs0 = new frxq(hll.h);
        }
        ibuq.f(frxs0, "backgroundColor");
        super();
        this.c = fryv0;
        this.a = frxs0;
        this.b = false;
    }

    @Override  // ftvk
    public final fryv a() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftvi)) {
            return false;
        }
        return ibuq.m(this.c, ((ftvi)object0).c) ? ibuq.m(this.a, ((ftvi)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return (this.c.hashCode() * 0x1F + this.a.hashCode()) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Neutral(badgeLabel=" + this.c + ", backgroundColor=" + this.a + ", shouldDynamicallyA11yColorText=false)";
    }
}

