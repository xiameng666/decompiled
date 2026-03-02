import j..util.Objects;

public final class ajr extends ajk {
    public final int a;
    private final int b;

    public ajr(int v) {
        this.a = v;
        this.b = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajr) ? Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((ajr)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)0)});
    }

    @Override
    public final String toString() {
        return "{joinableValueType: " + this.a + ", deletePropagationType: 0}";
    }
}

