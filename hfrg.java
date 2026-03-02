public final class hfrg {
    public iapk a;
    public Object b;
    public iaof_metadata c;

    public final hfrh a() {
        gftb.z(this.a, "Status must be set.");
        gftb.r(!this.a.h() || this.b != null, "Payload is mandatory when the response status is OK.");
        return new hfrh(this);
    }

    public final void b(iapk iapk0) {
        gftb.z(iapk0, "Status must not be null.");
        this.a = iapk0;
    }

    public static final void c(iakk iakk0) {
        gftb.z(iakk0, "Attributes must not be null.");
    }
}

