public final class ebil implements dtre {
    final ebim a;

    public ebil(ebim ebim0) {
        this.a = ebim0;
        super();
    }

    @Override  // dtre
    public final void a(dtqu dtqu0) {
        a.ae(ebim.b.j(), "SyncCredmanRegistryOperation: failed to clear registry, will not attempt to register new credentials.", dtqu0);
    }

    @Override  // dtre
    public final void b() {
        ((ggtj)ebim.b.h()).x("SyncCredmanRegistryOperation: cleared registry, registering new credentials.");
        this.a.e();
    }
}

