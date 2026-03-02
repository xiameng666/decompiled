public final class bnpt implements gfsi {
    public final gsyz a;
    public final String b;

    public bnpt(gsyz gsyz0, String s) {
        this.a = gsyz0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0;
        String s;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        for(int v = 0; true; ++v) {
            s = this.b;
            gsyz0 = this.a;
            if(v >= ((fqyf)((fqyd)hftp0).b_message).b.size()) {
                break;
            }
            gsyz gsyz1 = ((fqyd)hftp0).a(v).c;
            if(gsyz1 == null) {
                gsyz1 = gsyz.a;
            }
            if(((ProtoLiteMessage)gsyz0).equals(gsyz1)) {
                fqxl fqxl0 = ((fqyd)hftp0).a(v);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)fqxl0));
                if(!((fqxk)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((fqxk)hftp1))).ensureMutable();
                }
                fqxl fqxl1 = (fqxl)((fqxk)hftp1).b_message;
                fqxl1.b |= 4;
                fqxl1.e = s;
                ((fqyd)hftp0).o(v, ((fqxl)((ProtoLiteBuilder)(((fqxk)hftp1))).N_build()));
                return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
            }
        }
        fqxk fqxk0 = (fqxk)((ProtoLiteMessage)fqxl.a).v_newBuilder();
        if(!fqxk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqxk0).ensureMutable();
        }
        fqxl fqxl2 = (fqxl)fqxk0.b_message;
        gsyz0.getClass();
        fqxl2.c = gsyz0;
        fqxl2.b |= 1;
        if(!fqxk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqxk0).ensureMutable();
        }
        fqxl fqxl3 = (fqxl)fqxk0.b_message;
        fqxl3.b |= 4;
        fqxl3.e = s;
        ((fqyd)hftp0).l(((fqxl)((ProtoLiteBuilder)fqxk0).N_build()));
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

