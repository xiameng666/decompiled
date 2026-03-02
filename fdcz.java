public final class fdcz implements gful_cronetEngineProvider {
    public final fddd a;
    public final String b;

    public fdcz(fddd fddd0, String s) {
        this.a = fddd0;
        this.b = s;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = fdes.a(this.a.e, this.b);
        ffnc.c("wearable.Privacy", "getGaiaIdFromWatch", ((evql)object0));
        return object0;
    }
}

