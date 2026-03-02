import j..util.Objects;

public final class fvgh {
    public final int a;
    public final long b;
    public final double c;
    public final long d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final int i;
    public final long j;

    public fvgh(fvgg fvgg0) {
        this.a = fvgg0.a;
        this.b = fvgg0.b;
        this.c = fvgg0.c;
        this.d = fvgg0.d;
        this.e = fvgg0.e;
        this.f = fvgg0.f;
        this.g = fvgg0.g;
        this.h = fvgg0.h;
        this.i = fvgg0.i;
        this.j = 0L;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fvgh) ? this.a == ((fvgh)object0).a && this.b == ((fvgh)object0).b && Double.compare(((fvgh)object0).c, this.c) == 0 && this.d == ((fvgh)object0).d && Double.compare(((fvgh)object0).e, this.e) == 0 && Double.compare(((fvgh)object0).f, this.f) == 0 && Double.compare(((fvgh)object0).g, this.g) == 0 && Double.compare(((fvgh)object0).h, this.h) == 0 && this.i == ((fvgh)object0).i : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((long)this.b), ((double)this.c), ((long)this.d), ((double)this.e), ((double)this.f), ((double)this.g), ((double)this.h), ((int)this.i), ((long)0L)});
    }
}

