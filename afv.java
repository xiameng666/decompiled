import j..util.Objects;

public final class afv extends ajk {
    public final int a;
    public final int b;

    public afv(int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException("Start point must be less than or equal to end point");
        }
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof afv) ? this.a == ((afv)object0).a && this.b == ((afv)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "MatchRange { start: " + this.a + " , end: " + this.b + "}";
    }
}

