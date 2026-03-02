public final class fonq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public fonq() {
        super(((ProtoLiteMessage)font.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        font font0 = (font)this.b_message;
        iddc iddc0 = (iddc)hftp0.N_build();
        iddc0.getClass();
        hfuo hfuo0 = font0.c;
        if(!hfuo0.c()) {
            font0.c = ProtoLiteMessage.E(hfuo0);
        }
        font0.c.add(iddc0);
    }
}

