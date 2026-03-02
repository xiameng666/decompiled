import j..time.Duration;

class ghmi extends ghml {
    final int a;

    public ghmi(int v) {
        ghml.j(v);
        this.a = v;
    }

    @Override  // ghml
    public final Duration a(int v) {
        return this.b(v) ? Duration.ZERO : ghml.d;
    }

    @Override  // ghml
    public final boolean b(int v) {
        ghml.h(v);
        return v < this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghmi) && this.a == ((ghmi)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }
}

