public final class ggux {
    public final ggwr a;
    public final String b;

    public ggux(ggwr ggwr0, String s) {
        ggwv.d(ggwr0, "parser");
        this.a = ggwr0;
        ggwv.d(s, "message");
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggux) && this.a.equals(((ggux)object0).a) && this.b.equals(((ggux)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}

