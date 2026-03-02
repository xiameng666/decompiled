public final class gjql {
    private final ProtoLiteBuilder a;

    public gjql(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjwr a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjwr)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjwr gjwr0 = (gjwr)hftp0.b_message;
        gjwr0.b |= 1;
        gjwr0.c = s;
    }
}

