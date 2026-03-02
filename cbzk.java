public final class cbzk implements cbzh {
    private final cbyw a;
    private final cbzh b;
    private final long c;

    public cbzk(cbyw cbyw0, cbzh cbzh0, long v) {
        this.a = cbyw0;
        this.b = cbzh0;
        this.c = v;
    }

    @Override  // cbzh
    public final void a(gkdb gkdb0) {
        this.b.a(gkdb0);
    }

    @Override  // cbzh
    public final void b(int v) {
        this.d(v, null);
    }

    @Override  // cbzh
    public final void c(int v) {
        this.e(v, null);
    }

    @Override  // cbzh
    public final void d(int v, String s) {
        if(this.a.L() && this.a.K()) {
            this.f(v - 2, s);
        }
    }

    @Override  // cbzh
    public final void e(int v, String s) {
        if(!this.a.L()) {
            return;
        }
        this.f(v - 2, s);
    }

    private final void f(int v, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkdd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkdd)hftv0).b |= 1;
        ((gkdd)hftv0).c = (long)v;
        long v1 = this.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkdd gkdd0 = (gkdd)hftp0.b_message;
        gkdd0.b |= 4;
        gkdd0.d = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkdb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkdb gkdb0 = (gkdb)hftp1.b_message;
        gkdd gkdd1 = (gkdd)hftp0.N_build();
        gkdd1.getClass();
        gkdb0.d = gkdd1;
        gkdb0.b |= 0x40;
        if(s != null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkdc.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gkdc gkdc0 = (gkdc)hftp2.b_message;
            gkdc0.b |= 1;
            gkdc0.c = s;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkdb gkdb1 = (gkdb)hftp1.b_message;
            gkdc gkdc1 = (gkdc)hftp2.N_build();
            gkdc1.getClass();
            gkdb1.c = gkdc1;
            gkdb1.b |= 1;
        }
        gkdb gkdb2 = (gkdb)hftp1.N_build();
        this.b.a(gkdb2);
    }
}

