import j..util.Objects;

public final class iaoo {
    public final iapk a;
    public final Object b;

    public iaoo(iapk iapk0) {
        this.b = null;
        this.a = iapk0;
        gftb.f(((boolean)(iapk0.h() ^ 1)), "cannot use OK status: %s", iapk0);
    }

    public iaoo(Object object0) {
        this.b = object0;
        this.a = null;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.a, ((iaoo)object0).a) && Objects.equals(this.b, ((iaoo)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        Object object0 = this.b;
        if(object0 != null) {
            ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
            gfsv0.add("config", object0);
            return gfsv0.toString();
        }
        ToStringHelper gfsv1 = MoreObjects.toStringHelper(this);
        gfsv1.add("error", this.a);
        return gfsv1.toString();
    }
}

