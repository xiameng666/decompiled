public final class bnpc implements gfsi {
    public final gsyz a;
    public final fqus b;

    public bnpc(gsyz gsyz0, fqus fqus0) {
        this.a = gsyz0;
        this.b = fqus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        for(int v1 = 0; v1 < ((fqyf)((fqyd)hftp0).b_message).b.size(); ++v1) {
            gsyz gsyz0 = ((fqyd)hftp0).a(v1).c;
            if(gsyz0 == null) {
                gsyz0 = gsyz.a;
            }
            if(((ProtoLiteMessage)this.a).equals(gsyz0)) {
                fqup fqup0 = new fqup();
                ggfp ggfp0 = (ggfp)this.b.g.b(fqup0).f(new ggoh(gszt.a));
                fqxl fqxl0 = ((fqyd)hftp0).a(v1);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)fqxl0));
                for(int v = 0; v < ((fqxl)((fqxk)hftp1).b_message).p.size(); ++v) {
                    gszt gszt0 = gszt.b(((fqxk)hftp1).a(v).b);
                    if(gszt0 == null) {
                        gszt0 = gszt.e;
                    }
                    if(ggfp0.contains(gszt0)) {
                        gtbo gtbo0 = ((fqxk)hftp1).a(v);
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gtbo0).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)gtbo0));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gtbo)hftp2.b_message).c = 2;
                        gtbo gtbo1 = (gtbo)hftp2.N_build();
                        if(!((fqxk)hftp1).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((fqxk)hftp1))).ensureMutable();
                        }
                        fqxl fqxl1 = (fqxl)((fqxk)hftp1).b_message;
                        gtbo1.getClass();
                        fqxl1.c();
                        fqxl1.p.set(v, gtbo1);
                    }
                }
                ((fqyd)hftp0).o(v1, ((fqxl)((ProtoLiteBuilder)(((fqxk)hftp1))).N_build()));
                break;
            }
        }
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

