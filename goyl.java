public final class goyl implements goxo {
    private final String a;
    private final String b;
    private final String c;

    public goyl(String s, String s1, String s2) {
        batl.q(s);
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((gdhv)hftv0).b |= 1;
        ((gdhv)hftv0).c = this.a;
        String s = this.b;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhv gdhv0 = (gdhv)hftp0.b_message;
            gdhv0.b |= 2;
            gdhv0.d = s;
        }
        String s1 = this.c;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhv gdhv1 = (gdhv)hftp0.b_message;
            gdhv1.b |= 16;
            gdhv1.e = s1;
        }
        return (gdhv)hftp0.N_build();
    }
}

