public final class fmeg {
    public final fmhm a;
    public final gged_interceptors b;

    public fmeg() {
        throw null;
    }

    public fmeg(fmhm fmhm0, gged_interceptors gged0) {
        this.a = fmhm0;
        this.b = gged0;
    }

    public static fmef a() {
        fmef fmef0 = new fmef();
        fmef0.b(ggna.a);
        return fmef0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmeg) && this.a.equals(((fmeg)object0).a) && ggia.i(this.b, ((fmeg)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ButtonPrompt{promptText=" + this.a + ", buttons=" + this.b + "}";
    }
}

