public final class arvs {
    private static final ghyr a;
    private final aqqk b;

    static {
        arvs.a = ghyr.aN;
    }

    public arvs(aqqk aqqk0) {
        this.b = aqqk0;
    }

    public final void a(gian gian0) {
        ibuq.f(gian0, "resultType");
        ghyp ghyp0 = ghyo.a(((ProtoLiteMessage)ghys.a).v_newBuilder());
        gijo gijo0 = gijn.a(((ProtoLiteMessage)giao.a).v_newBuilder());
        ibuq.f(gian0, "value");
        ProtoLiteBuilder hftp0 = gijo0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giao)hftp0.b_message).d = gian0.g;
        ((giao)hftp0.b_message).b |= 2;
        ghyp0.b(gijo0.a());
        ghys ghys0 = ghyp0.a();
        this.b.a(ghys0, arvs.a);
    }

    public final void b(gian gian0) {
        ibuq.f(gian0, "resultType");
        ghyp ghyp0 = ghyo.a(((ProtoLiteMessage)ghys.a).v_newBuilder());
        gijo gijo0 = gijn.a(((ProtoLiteMessage)giao.a).v_newBuilder());
        ibuq.f(gian0, "value");
        ProtoLiteBuilder hftp0 = gijo0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giao)hftp0.b_message).c = gian0.g;
        ((giao)hftp0.b_message).b |= 1;
        ghyp0.b(gijo0.a());
        ghys ghys0 = ghyp0.a();
        this.b.a(ghys0, arvs.a);
    }
}

