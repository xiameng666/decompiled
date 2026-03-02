public final class gayh implements gcqg {
    private final gaym a;

    public gayh(gaym gaym0) {
        ibuq.f(gaym0, "eventLogger");
        super();
        this.a = gaym0;
    }

    @Override  // gcqg
    public final void a() {
        this.c(2);
    }

    @Override  // gcqg
    public final void b() {
        this.c(3);
    }

    private final void c(int v) {
        gkyx gkyx0 = gkyw.a(((ProtoLiteMessage)gkxt.a).v_newBuilder());
        gkyx0.b(gkwx.B);
        gkzj gkzj0 = (gkzj)((ProtoLiteMessage)gkzk.a).v_newBuilder();
        if(!gkzj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gkzj0).ensureMutable();
        }
        ((gkzk)gkzj0.b_message).c = v - 1;
        ((gkzk)gkzj0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)gkzj0).N_build();
        ibuq.e(hftv0, "build(...)");
        gkyx0.c(((gkzk)hftv0));
        gkxt gkxt0 = gkyx0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkxt0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkxt0));
        ibuq.e(hftp0, "toBuilder(...)");
        this.a.f(hftp0);
    }
}

