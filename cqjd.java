public final class cqjd implements gfsi {
    public final elhs a;

    public cqjd(elhs elhs0) {
        this.a = elhs0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((elhq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((elhq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhq elhq0 = (elhq)hftp0.b_message;
        this.a.getClass();
        elhq0.d = this.a;
        elhq0.b |= 4;
        return (elhq)hftp0.N_build();
    }
}

