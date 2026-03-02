public final class bxmx implements bxmv {
    private final bxod a;
    private final String b;
    private final bbmv c;
    private long d;

    public bxmx(bxod bxod0, String s, bbmv bbmv0) {
        this.a = bxod0;
        this.b = s;
        this.c = bbmv0;
    }

    @Override  // bxmv
    public final void a() {
    }

    @Override  // bxmv
    public final void b(Throwable throwable0) {
    }

    @Override  // bxmv
    public final void c(Object object0, boolean z) {
        if(this.d == 0L) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giva.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giva giva0 = (giva)hftp0.b_message;
        giva0.b |= 0x8000;
        giva0.r = z;
        long v = System.currentTimeMillis() - this.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giva giva1 = (giva)hftp0.b_message;
        giva1.b |= 0x4000;
        giva1.q = v;
        this.c.a(hftp0, object0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixr)hftp1.b_message).d = 5;
        ((gixr)hftp1.b_message).b |= 1;
        giva giva2 = (giva)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        giva2.getClass();
        gixr0.i = giva2;
        gixr0.b |= 0x20;
        gixr gixr1 = (gixr)hftp1.N_build();
        this.a.a(gixr1);
        this.d = 0L;
    }

    @Override  // bxmv
    public final void d(Object object0) {
        this.d = System.currentTimeMillis();
    }
}

