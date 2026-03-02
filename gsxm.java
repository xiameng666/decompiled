public final class gsxm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsxm() {
        super(((ProtoLiteMessage)gsxn.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsxn gsxn0 = (gsxn)this.b_message;
        gsxo gsxo0 = (gsxo)hftp0.N_build();
        gsxo0.getClass();
        hfuo hfuo0 = gsxn0.c;
        if(!hfuo0.c()) {
            gsxn0.c = ProtoLiteMessage.E(hfuo0);
        }
        gsxn0.c.add(gsxo0);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsxn gsxn0 = (gsxn)this.b_message;
        gsyf gsyf0 = (gsyf)hftp0.N_build();
        gsyf0.getClass();
        hfuo hfuo0 = gsxn0.d;
        if(!hfuo0.c()) {
            gsxn0.d = ProtoLiteMessage.E(hfuo0);
        }
        gsxn0.d.add(gsyf0);
    }
}

