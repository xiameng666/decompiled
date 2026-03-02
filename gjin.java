public final class gjin {
    private final ProtoLiteBuilder a;

    public gjin(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjdx a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjdx)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdx gjdx0 = (gjdx)hftp0.b_message;
        gjdx0.b |= 1;
        gjdx0.c = s;
    }
}

