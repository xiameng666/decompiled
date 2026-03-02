public final class bvrg implements bvrf {
    @Override  // bvrf
    public final void a(int v) {
        bvrg.e(null, v, gqyr.a);
    }

    @Override  // bvrf
    public final void b(String s, int v, ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqyr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqyb gqyb0 = (gqyb)hftp0.b_message;
        gqyb0.b |= 1;
        gqyb0.c = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqyr gqyr0 = (gqyr)hftp1.b_message;
        gqyb gqyb1 = (gqyb)hftp0.N_build();
        gqyb1.getClass();
        gqyr0.d = gqyb1;
        gqyr0.b |= 0x100;
        bvrg.e(s, 104, ((gqyr)hftp1.N_build()));
    }

    @Override  // bvrf
    public final void c(String s, ProtoLiteBuilder hftp0) {
        gqyn gqyn0 = (gqyn)hftp0.b_message;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqyr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqyr gqyr0 = (gqyr)hftp1.b_message;
        gqyn gqyn1 = (gqyn)hftp0.N_build();
        gqyn1.getClass();
        gqyr0.k = gqyn1;
        gqyr0.b |= 0x10000;
        bvrg.e(s, 0x70, ((gqyr)hftp1.N_build()));
    }

    @Override  // bvrf
    public final void d(String s, ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqyr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqyr gqyr0 = (gqyr)hftp1.b_message;
        gqyy gqyy0 = (gqyy)hftp0.N_build();
        gqyy0.getClass();
        gqyr0.q = gqyy0;
        gqyr0.b |= 0x1000000;
        bvrg.e(s, 110, ((gqyr)hftp1.N_build()));
    }

    private static final void e(String s, int v, gqyr gqyr0) {
        cczb cczb0;
        if(s == null) {
            cczb0 = cfrt.v().c(((ProtoLiteMessage)gqyr0));
        }
        else {
            cczb cczb1 = cfrq.v().c(((ProtoLiteMessage)gqyr0));
            cczb1.b = s;
            cczb0 = cczb1;
        }
        cczb0.c = (int)(v - 1);
        cczb0.a();
    }
}

