public final class abm implements gqa {
    final abi a;

    public abm(abi abi0) {
        this.a = abi0;
        super();
    }

    @Override  // gqa
    public final void a() {
        acp acp0 = this.a.a;
        if(acp0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        acp0.a();
    }
}

