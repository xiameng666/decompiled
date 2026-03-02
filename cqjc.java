import j..util.Optional;

public final class cqjc implements gfsi {
    public final Optional a;

    public cqjc(Optional optional0) {
        this.a = optional0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        cqiz cqiz0 = new cqiz(((elhq)object0));
        Optional optional0 = this.a.map(cqiz0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((elhq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((elhq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((elhq)hftp0.b_message).d = null;
        ((elhq)hftp0.b_message).b &= -5;
        elhs elhs0 = elhs.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhq elhq0 = (elhq)hftp0.b_message;
        elhs0.getClass();
        elhq0.c = elhs0;
        elhq0.b |= 2;
        return (elhq)optional0.orElse(((elhq)hftp0.N_build()));
    }
}

