public final class cixu implements gful_cronetEngineProvider {
    public final String a;

    public cixu(String s) {
        this.a = s;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        String s = this.a;
        return s.isEmpty() ? new ciyg(new hfke(84)) : new ciyi(s);
    }
}

