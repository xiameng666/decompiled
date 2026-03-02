final class jqw extends jqs {
    final jqx c;

    public jqw(jqx jqx0) {
        this.c = jqx0;
        super();
    }

    @Override  // jqs
    protected final String d() {
        jqt jqt0 = (jqt)this.c.a.get();
        return jqt0 == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + jqt0.a + "]";
    }
}

