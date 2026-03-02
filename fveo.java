import j..util.Objects;

public final class fveo implements Comparable {
    public final fveh a;
    public final int b;

    public fveo(int v, int v1, double f) {
        this.a = fveh.a(v, f);
        this.b = v1;
    }

    public final double a() {
        return this.a.E;
    }

    public final int b() {
        return this.a.D;
    }

    @Override
    public final int compareTo(Object object0) {
        fveo fveo0 = (fveo)object0;
        return ggbe.b.d(this.a, fveo0.a).b(this.b, fveo0.b).a();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fveo) ? this.a.equals(((fveo)object0).a) && this.b == ((fveo)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }
}

