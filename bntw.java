public final class bntw {
    public final bnvk a;
    public final gfsx b;
    public final gfsx c;
    public final ggfp d;
    public final gfsx e;
    public final boolean f;
    public final gfsx g;

    public bntw() {
        throw null;
    }

    public bntw(bnvk bnvk0, gfsx gfsx0, gfsx gfsx1, ggfp ggfp0, gfsx gfsx2, boolean z, gfsx gfsx3) {
        this.a = bnvk0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = ggfp0;
        this.e = gfsx2;
        this.f = z;
        this.g = gfsx3;
    }

    public static bntv a() {
        bntv bntv0 = new bntv(null);
        bntv0.d(ggnj.a);
        bntv0.b(false);
        return bntv0;
    }

    // Detected as a lambda impl.
    public final bnxi b() {
        return this.a.a();
    }

    public final gfsx c() {
        bntu bntu0 = (bntw this) -> this.a.a();
        return this.g.b(bntu0);
    }

    public final String d() {
        return this.a.l();
    }

    public final boolean e() {
        if(!this.c.i()) {
            bnwe bnwe0 = (bnwe)this.b.d();
            return !bnwe0.a.isEmpty() || bnwe0.a();
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bntw) && this.a.equals(((bntw)object0).a) && this.b.equals(((bntw)object0).b) && this.c.equals(((bntw)object0).c) && this.d.equals(((bntw)object0).d) && this.e.equals(((bntw)object0).e) && this.f == ((bntw)object0).f && this.g.equals(((bntw)object0).g);
    }

    public final boolean f() {
        return this.c.i();
    }

    public final boolean g() {
        return this.b.i() && !((bnwe)this.b.d()).a.isEmpty();
    }

    public final boolean h() {
        return !this.d.isEmpty() && this.c.i();
    }

    @Override
    public final int hashCode() {
        int v = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
        return this.f ? this.g.hashCode() ^ (v * 1000003 ^ 0x4CF) * 1000003 : this.g.hashCode() ^ (v * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "InfoForExport{keychainClient=" + this.a + ", retrieverResult=" + this.b + ", keychainDomainKeysRetrievalStatus=" + this.c + ", requiredOwnerKeysWhoseImportRequiresRetrieval=" + this.d + ", beaconTypesUsingDomain=" + this.e + ", isDomainToBeReset=" + this.f + ", otherTypeDomainToBeReplaced=" + this.g + "}";
    }
}

