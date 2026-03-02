public final class fdby implements gful_cronetEngineProvider {
    public final fdch a;
    public final ffco b;

    public fdby(fdch fdch0, ffco ffco0) {
        this.a = fdch0;
        this.b = ffco0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = fdbf.i(this.a.i).g(this.b);
        ffnc.c("wearable.Consents", "updateOptInConsent", ((evql)object0));
        return object0;
    }
}

