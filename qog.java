public final class qog extends qoj {
    private final String a;

    public qog(String s) {
        ibuq.f(s, "marker");
        super();
        this.a = s;
    }

    @Override  // qoj
    public final float a(qkb qkb0) {
        qpt qpt0 = qkb0.c(this.a);
        return qpt0 == null ? 1.0f : ibwt.f((qpt0.b + qpt0.c) / qkb0.l, 0.0f, 1.0f);
    }

    @Override  // qoj
    public final float b(qkb qkb0) {
        qpt qpt0 = qkb0.c(this.a);
        return qpt0 == null ? ibwt.f(0.0f / qkb0.l, 0.0f, 1.0f) : ibwt.f(qpt0.b / qkb0.l, 0.0f, 1.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof qog) ? ibuq.m(this.a, ((qog)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Marker(marker=" + this.a + ")";
    }
}

