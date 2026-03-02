public final class hdzr extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdzr() {
        super(((ProtoLiteMessage)hdzs.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdzs hdzs0 = (hdzs)this.b_message;
        hdzq hdzq0 = (hdzq)hftp0.N_build();
        hdzq0.getClass();
        hfuo hfuo0 = hdzs0.d;
        if(!hfuo0.c()) {
            hdzs0.d = ProtoLiteMessage.E(hfuo0);
        }
        hdzs0.d.add(hdzq0);
    }
}

