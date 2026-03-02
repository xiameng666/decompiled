public final class goza implements goxo {
    private final String a;
    private final String b;

    public goza(String s, String s1) {
        batl.q(s);
        this.a = s;
        this.b = s1;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdij.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((gdij)hftv0).b |= 1;
        ((gdij)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gdij)hftv1).b |= 4;
        ((gdij)hftv1).d = true;
        String s = this.b;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdij gdij0 = (gdij)hftp0.b_message;
            gdij0.b |= 16;
            gdij0.e = s;
        }
        return (gdij)hftp0.N_build();
    }
}

