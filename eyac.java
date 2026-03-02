public final class eyac implements ibts {
    public final long a;
    public final int b;

    public eyac(int v, long v1) {
        this.b = v;
        this.a = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("\n    UPDATE EnrolledDevice\n    SET unenrolledByAssociated = TRUE, unenrolledByAssociatedReason = ?\n    WHERE id = ?\n    ")) {
            owg0.h(1, eyaf.r(this.b));
            owg0.f(2, this.a);
            owg0.k();
        }
        return ibom.a;
    }
}

