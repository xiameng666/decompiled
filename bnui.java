public final class bnui implements gful_cronetEngineProvider {
    public final bntt a;
    public final bnvd b;

    public bnui(bntt bntt0, bnvd bnvd0) {
        this.a = bntt0;
        this.b = bnvd0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        return Boolean.valueOf(this.a.a(this.b));
    }
}

