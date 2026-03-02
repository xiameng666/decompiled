public final class bnyz implements glzn {
    public final bnzd a;

    public bnyz(bnzd bnzd0) {
        this.a = bnzd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gftb.r((((fqzl)object0).b & 0x20) != 0, "Current device is not registered");
        fqxm fqxm0 = ((fqzl)object0).j;
        if(fqxm0 == null) {
            fqxm0 = fqxm.a;
        }
        bnzd bnzd0 = this.a;
        gsyz gsyz0 = bnzd0.d;
        gftb.b(((ProtoLiteMessage)(fqxm0.d == null ? gsyz.a : fqxm0.d)).equals(gsyz0), "Provided device ID does not match to current device");
        fqxm fqxm1 = ((fqzl)object0).j;
        if(fqxm1 == null) {
            fqxm1 = fqxm.a;
        }
        gftb.b(fqxm1.c.equals(bnzd0.e.a), "Wrong identity key was provided");
        bnzd0.f = (fqzl)object0;
        return bnzd0.b.b(gsyz0, bnzd0.e);
    }
}

