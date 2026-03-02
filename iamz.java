import j..util.Objects;

public final class iamz {
    public static final iamz a;
    public final ianc b;
    public final iapk c;
    public final boolean d;
    private final ialb e;

    static {
        iamz.a = new iamz(null, iapk.b, false);
    }

    private iamz(ianc ianc0, iapk iapk0, boolean z) {
        this.b = ianc0;
        this.e = null;
        gftb.z(iapk0, "status");
        this.c = iapk0;
        this.d = z;
    }

    public static iamz a(iapk iapk0) {
        gftb.b(((boolean)(iapk0.h() ^ 1)), "drop status shouldn\'t be OK");
        return new iamz(null, iapk0, true);
    }

    public static iamz b(iapk iapk0) {
        gftb.b(((boolean)(iapk0.h() ^ 1)), "error status shouldn\'t be OK");
        return new iamz(null, iapk0, false);
    }

    public static iamz c(ianc ianc0) {
        return new iamz(ianc0, iapk.b, false);
    }

    public final boolean d() {
        return this.b != null || !this.c.h();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iamz) ? Objects.equals(this.b, ((iamz)object0).b) && Objects.equals(this.c, ((iamz)object0).c) && Objects.equals(null, null) && this.d == ((iamz)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c, 0, Boolean.valueOf(this.d)});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("subchannel", this.b);
        gfsv0.add("streamTracerFactory", null);
        gfsv0.add("status", this.c);
        gfsv0.addBool("drop", this.d);
        gfsv0.add("authority-override", null);
        return gfsv0.toString();
    }
}

