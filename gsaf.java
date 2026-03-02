public final class gsaf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsaf() {
        super(((ProtoLiteMessage)gsag.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsag gsag0 = (gsag)this.b_message;
        gsah gsah0 = (gsah)hftp0.N_build();
        gsah0.getClass();
        hfuo hfuo0 = gsag0.b;
        if(!hfuo0.c()) {
            gsag0.b = ProtoLiteMessage.E(hfuo0);
        }
        gsag0.b.add(gsah0);
    }
}

