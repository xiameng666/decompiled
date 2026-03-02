import j..util.Objects;

final class croh extends crdj {
    final croz b;

    public croh(croz croz0, crlw crlw0) {
        Objects.requireNonNull(croz0);
        this.b = croz0;
        super(crlw0);
    }

    @Override  // crdj
    public final void b() {
        croz croz0 = this.b;
        croz0.n();
        if(!croz0.C()) {
            return;
        }
        croz0.aJ().k.a("Inactivity, disconnecting from the service");
        croz0.s();
    }
}

