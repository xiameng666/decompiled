public final class ialm {
    public final iall a;
    public final iapk b;

    public ialm(iall iall0, iapk iapk0) {
        gftb.z(iall0, "state is null");
        this.a = iall0;
        gftb.z(iapk0, "status is null");
        this.b = iapk0;
    }

    public static ialm a(iall iall0) {
        gftb.b(iall0 != iall.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new ialm(iall0, iapk.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ialm) ? this.a.equals(((ialm)object0).a) && this.b.equals(((ialm)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return this.b.h() ? this.a.toString() : this.a.toString() + "(" + this.b.toString() + ")";
    }
}

