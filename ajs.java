import j..util.Objects;

public final class ajs extends ajk {
    public final int a;
    public final int b;

    public ajs(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajs) ? this.a == ((ajs)object0).a && Objects.equals(Integer.valueOf(this.b), Integer.valueOf(((ajs)object0).b)) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "{indexingType: " + this.a + ", tokenizerType: " + this.b + "}";
    }
}

