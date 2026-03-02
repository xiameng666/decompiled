public final class eyaa implements ibts {
    public final boolean a;
    public final long b;

    public eyaa(boolean z, long v) {
        this.a = z;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("\n    UPDATE EnrolledDevice\n    SET consentedToDowngradeRangingMethod = ?\n    WHERE id =?\n    ")) {
            owg0.f(1, ((long)this.a));
            owg0.f(2, this.b);
            owg0.k();
        }
        return ibom.a;
    }
}

