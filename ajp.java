import j..util.Objects;

public final class ajp extends ajk {
    public final int a;
    public final int b;

    public ajp(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajp) ? this.a == ((ajp)object0).a && this.b == ((ajp)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "{indexingType: " + this.a + ", quantizationType: " + this.b + "}";
    }
}

