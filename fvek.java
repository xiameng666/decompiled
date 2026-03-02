import j..util.Objects;

public final class fvek implements Comparable {
    public final int a;
    public final int b;

    public fvek(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final int compareTo(Object object0) {
        fvek fvek0 = (fvek)object0;
        return ggbe.b.b(this.a, fvek0.a).b(this.b, fvek0.b).a();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvek) ? ((fvek)object0).a == this.a && ((fvek)object0).b == this.b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }
}

