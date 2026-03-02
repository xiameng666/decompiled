public final class goxz implements goxo {
    private final String a;
    private final String b;

    public goxz(String s) {
        this.a = goxy.a.c;
        batl.q(s);
        this.b = s;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgiz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((hgiz)hftv0).b = this.a;
        String s = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgiz hgiz0 = (hgiz)hftp0.b_message;
        s.getClass();
        hgiz0.c = s;
        return (hgiz)hftp0.N_build();
    }
}

