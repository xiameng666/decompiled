import j..util.Objects;

final class erax implements gmbg {
    final gjle a;
    final eray b;

    public erax(eray eray0, gjle gjle0) {
        this.a = gjle0;
        Objects.requireNonNull(eray0);
        this.b = eray0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eray.a.n("Failed to get sequence number from protoDataStore.", throwable0, new Object[0]);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjle0.b |= 0x2000000;
        gjle0.y = -100;
        gjle gjle1 = (gjle)hftp0.N_build();
        this.b.j(gjle1);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        int v = (int)(((Integer)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjle gjle0 = (gjle)hftp0.b_message;
        gjle0.b |= 0x2000000;
        gjle0.y = v;
        gjle gjle1 = (gjle)hftp0.N_build();
        this.b.j(gjle1);
    }
}

