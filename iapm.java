import j..util.Objects;

public final class iapm {
    private final iapk a;
    private final Object b;

    public iapm(iapk iapk0, Object object0) {
        this.a = iapk0;
        this.b = object0;
    }

    public final iapk a() {
        return this.a == null ? iapk.b : this.a;
    }

    public static iapm b(iapk iapk0) {
        gftb.z(iapk0, "status");
        iapm iapm0 = new iapm(iapk0, null);
        gftb.f(((boolean)(iapk0.h() ^ 1)), "cannot use OK status: %s", iapk0);
        return iapm0;
    }

    public final Object c() {
        if(this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof iapm) && this.d() == ((iapm)object0).d()) {
            return this.d() ? Objects.equals(this.b, ((iapm)object0).b) : Objects.equals(this.a, ((iapm)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        iapk iapk0 = this.a;
        if(iapk0 == null) {
            gfsv0.add("value", this.b);
            return gfsv0.toString();
        }
        gfsv0.add("error", iapk0);
        return gfsv0.toString();
    }
}

