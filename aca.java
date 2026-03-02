public final class aca extends acp {
    private final abi a;

    public aca(abi abi0) {
        this.a = abi0;
    }

    @Override  // acp
    @ibni
    public final void a() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }

    @Override  // acp
    public final void b(Object object0) {
        acp acp0 = this.a.a;
        if(acp0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        acp0.b(object0);
    }
}

