public final class cer {
    public static final cer a;
    public final cgw b;
    private static final cer c;

    static {
        cer.a = new cer(new cgw(null, null, null, null, false, null, 0x3F));
        cer.c = new cer(new cgw(null, null, null, null, true, null, 0x2F));
    }

    public cer() {
        throw null;
    }

    public cer(cgw cgw0) {
        this.b = cgw0;
    }

    public final cer a(cer cer0) {
        return new cer(new cgw((cer0.b.a == null ? this.b.a : cer0.b.a), (cer0.b.b == null ? this.b.b : cer0.b.b), (cer0.b.c == null ? this.b.c : cer0.b.c), (cer0.b.d == null ? this.b.d : cer0.b.d), cer0.b.e || this.b.e, ibpz.n(this.b.f, cer0.b.f)));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cer) && ibuq.m(((cer)object0).b, this.b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        if(ibuq.m(this, cer.a)) {
            return "ExitTransition.None";
        }
        if(ibuq.m(this, cer.c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        cgw cgw0 = this.b;
        StringBuilder stringBuilder0 = new StringBuilder("ExitTransition: \nFade - ");
        String s = null;
        stringBuilder0.append((cgw0.a == null ? null : cgw0.a.toString()));
        stringBuilder0.append(",\nSlide - ");
        stringBuilder0.append((cgw0.b == null ? null : cgw0.b.toString()));
        stringBuilder0.append(",\nShrink - ");
        stringBuilder0.append((cgw0.c == null ? null : cgw0.c.toString()));
        stringBuilder0.append(",\nScale - ");
        cez cez0 = cgw0.d;
        if(cez0 != null) {
            s = cez0.toString();
        }
        stringBuilder0.append(s);
        stringBuilder0.append(",\nKeepUntilTransitionsFinished - ");
        stringBuilder0.append(cgw0.e);
        return stringBuilder0.toString();
    }
}

