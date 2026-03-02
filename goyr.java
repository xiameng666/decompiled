public final class goyr implements goxo {
    private String a;
    private String b;
    private final String c;

    public goyr(String s) {
        this.c = s;
    }

    public goyr(String s, String s1, String s2) {
        batl.q(s);
        this.a = s;
        batl.q(s1);
        this.b = s1;
        this.c = s2;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdib.a).v_newBuilder();
        String s = this.a;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdib gdib0 = (gdib)hftp0.b_message;
            gdib0.b |= 1;
            gdib0.c = s;
        }
        String s1 = this.b;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdib gdib1 = (gdib)hftp0.b_message;
            gdib1.b |= 2;
            gdib1.d = s1;
        }
        String s2 = this.c;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdib gdib2 = (gdib)hftp0.b_message;
            gdib2.b |= 0x400;
            gdib2.e = s2;
        }
        return (gdib)hftp0.N_build();
    }
}

