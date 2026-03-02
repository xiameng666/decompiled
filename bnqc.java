public final class bnqc implements gfsi {
    public final ggeo a;

    public bnqc(ggeo ggeo0) {
        this.a = ggeo0;
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
            fquw fquw0 = (fquw)this.a.get(gsyz0);
            if(fquw0 != null) {
                fqxl fqxl0 = ((fqyd)hftp0).a(v);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)fqxl0));
                fqxk fqxk0 = (fqxk)hftp1;
                gfsx gfsx0 = fquw0.b;
                if(gfsx0.i()) {
                    fqzw fqzw0 = ((fqwq)gfsx0.d()).b();
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl1 = (fqxl)fqxk0.b_message;
                    fqzw0.getClass();
                    fqxl1.d = fqzw0;
                    fqxl1.b |= 2;
                }
                gfsx gfsx1 = fquw0.c;
                if(gfsx1.i()) {
                    fqex fqex0 = (fqex)gfsx1.d();
                    int v1 = fqex0.a;
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl2 = (fqxl)fqxk0.b_message;
                    fqxl2.b |= 8;
                    fqxl2.f = v1;
                    long v2 = fqex0.b;
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl3 = (fqxl)fqxk0.b_message;
                    fqxl3.b |= 16;
                    fqxl3.g = v2;
                    int v3 = fqex0.e;
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl4 = (fqxl)fqxk0.b_message;
                    fqxl4.h = gtac.a(v3);
                    fqxl4.b |= 0x20;
                    gfsx gfsx2 = fqex0.d;
                    if(gfsx2.i()) {
                        Object object1 = gfsx2.d();
                        if(!fqxk0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)fqxk0).ensureMutable();
                        }
                        fqxl fqxl5 = (fqxl)fqxk0.b_message;
                        fqxl5.m = (gtai)object1;
                        fqxl5.b |= 0x200;
                    }
                }
                gfsx gfsx3 = fquw0.d;
                if(gfsx3.i()) {
                    String s = (String)gfsx3.d();
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl6 = (fqxl)fqxk0.b_message;
                    fqxl6.b |= 0x400;
                    fqxl6.n = s;
                }
                gfsx gfsx4 = fquw0.e;
                if(gfsx4.i()) {
                    Object object2 = gfsx4.d();
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    fqxl fqxl7 = (fqxl)fqxk0.b_message;
                    fqxl7.o = ((gszv)object2).a();
                    fqxl7.b |= 0x800;
                }
                gfsx gfsx5 = fquw0.f;
                if(gfsx5.i()) {
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    ((fqxl)fqxk0.b_message).p = hfvv.a;
                    fqxk0.m(((Iterable)gfsx5.d()));
                }
                ((fqyd)hftp0).o(v, ((fqxl)((ProtoLiteBuilder)fqxk0).N_build()));
            }
        }
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

