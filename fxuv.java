import j..util.Objects;

public final class fxuv {
    public final boolean a;
    public final int b;

    public fxuv(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fxuv) ? this.a == ((fxuv)object0).a && this.b == ((fxuv)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "Result{moved=" + this.a + ", reason=" + this.b + "}";
    }
}

