public final class aifr implements glzn {
    public final aifv a;
    public final boolean b;

    public aifr(aifv aifv0, boolean z) {
        this.a = aifv0;
        this.b = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(this.b) {
            batl.m(((aztw)object0).l(bsba.c), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
            bsfx bsfx0 = ((aztw)object0).m(bsba.c) ? ((bsfx)((aztw)object0).b(bsba.f)) : null;
            if(bsfx0 == null) {
                return glzd.g(bxky.a(this.a.b(false)), new aift(this.a, false), gmap.a);
            }
            boolean z = bsfx0.a;
            return glzd.g(bxky.a(this.a.b(false)), new aift(this.a, z), gmap.a);
        }
        return aifv.c(((aztw)object0));
    }
}

