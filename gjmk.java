public final class gjmk {
    private final ProtoLiteBuilder a;

    public gjmk(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjml a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjml)hftv0;
    }

    public final void b(hhzc hhzc0) {
        ibuq.f(hhzc0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjml gjml0 = (gjml)hftp0.b_message;
        hhzc0.getClass();
        gjml0.c = hhzc0;
        gjml0.b |= 1;
    }
}

