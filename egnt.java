import j..util.Objects;

public final class egnt {
    final int a;
    final int b;

    public egnt(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof egnt) ? this.a == ((egnt)object0).a && this.b == ((egnt)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }
}

