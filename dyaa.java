public final class dyaa implements gfsi {
    public final gvek a;

    public dyaa(gvek gvek0) {
        this.a = gvek0;
    }

    // This method was un-flattened
    @Override  // gfsi
    public final Object apply(Object object0) {
        dxec dxec0 = (dxec)object0;
        if(dxec0 == null) {
            dxec0 = dxec.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dxec0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dxec0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvek gvek0 = this.a;
        ((dxec)hftp0.b_message).b().clear();
        ggek ggek0 = new ggek();
        for(Object object1: gvek0.e) {
            gvee gvee0 = (gvee)object1;
            if(gvee0.b == 1) {
                String s = gvee0.c;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dxea.a).v_newBuilder();
                String s1 = gvee0.d;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s1.getClass();
                ((dxea)hftv0).c = s1;
                String s2 = gvee0.e;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s2.getClass();
                ((dxea)hftv1).d = s2;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((dxea)hftp1.b_message).e = 1;
                hfwn hfwn0 = gvek0.f == null ? hfwn.a : gvek0.f;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dxea dxea0 = (dxea)hftp1.b_message;
                hfwn0.getClass();
                dxea0.f = hfwn0;
                dxea0.b |= 1;
                ggek0.i(s, ((dxea)hftp1.N_build()));
            }
        }
        ggeo ggeo0 = ggek0.g();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dxec)hftp0.b_message).b().putAll(ggeo0);
        return (dxec)hftp0.N_build();
    }
}

