public final class ceq {
    public static final ceq a;
    public final cgw b;

    static {
        ceq.a = new ceq(new cgw(null, null, null, null, false, null, 0x3F));
    }

    public ceq() {
        throw null;
    }

    public ceq(cgw cgw0) {
        this.b = cgw0;
    }

    public final ceq a(ceq ceq0) {
        return new ceq(new cgw((ceq0.b.a == null ? this.b.a : ceq0.b.a), (ceq0.b.b == null ? this.b.b : ceq0.b.b), (ceq0.b.c == null ? this.b.c : ceq0.b.c), (ceq0.b.d == null ? this.b.d : ceq0.b.d), false, ibpz.n(this.b.f, ceq0.b.f), 16));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ceq) && ibuq.m(((ceq)object0).b, this.b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        if(ibuq.m(this, ceq.a)) {
            return "EnterTransition.None";
        }
        StringBuilder stringBuilder0 = new StringBuilder("EnterTransition: \nFade - ");
        String s = null;
        stringBuilder0.append((this.b.a == null ? null : this.b.a.toString()));
        stringBuilder0.append(",\nSlide - ");
        stringBuilder0.append((this.b.b == null ? null : this.b.b.toString()));
        stringBuilder0.append(",\nShrink - ");
        stringBuilder0.append((this.b.c == null ? null : this.b.c.toString()));
        stringBuilder0.append(",\nScale - ");
        cez cez0 = this.b.d;
        if(cez0 != null) {
            s = cez0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

