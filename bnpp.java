public final class bnpp implements gfsi {
    public final gsyz a;
    public final long b;
    public final int c;

    public bnpp(gsyz gsyz0, int v, long v1) {
        this.a = gsyz0;
        this.c = v;
        this.b = v1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        for(int v = 0; v < ((fqyf)((fqyd)hftp0).b_message).b.size(); ++v) {
            gsyz gsyz0 = ((fqyd)hftp0).a(v).c;
            if(gsyz0 == null) {
                gsyz0 = gsyz.a;
            }
            if(((ProtoLiteMessage)this.a).equals(gsyz0)) {
                long v1 = this.b;
                int v2 = this.c;
                fqxl fqxl0 = ((fqyd)hftp0).a(v);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)fqxl0));
                switch(v2 - 1) {
                    case 0: 
                    case 1: {
                        ((ggtj)bnqg.a.j()).B("Unexpected battery level set: %s", fqen.a(v2));
                        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
                    }
                    case 2: {
                        if(!((fqxk)hftp1).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((fqxk)hftp1))).ensureMutable();
                        }
                        fqxl fqxl2 = (fqxl)((fqxk)hftp1).b_message;
                        fqxl2.b |= 0x80;
                        fqxl2.j = v1;
                        break;
                    }
                    default: {
                        if(!((fqxk)hftp1).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((fqxk)hftp1))).ensureMutable();
                        }
                        fqxl fqxl1 = (fqxl)((fqxk)hftp1).b_message;
                        fqxl1.b |= 0x100;
                        fqxl1.k = v1;
                    }
                }
                ((fqyd)hftp0).o(v, ((fqxl)((ProtoLiteBuilder)(((fqxk)hftp1))).N_build()));
                return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
            }
        }
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

