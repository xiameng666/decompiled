public final class azkp {
    public final int a;
    public final int b;

    public azkp() {
        throw null;
    }

    public azkp(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azkp) && this.a == ((azkp)object0).a && this.b == ((azkp)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ProjectKey{customerId=" + this.a + ", projectId=" + this.b + "}";
    }
}

