public final class hfgf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfgf() {
        super(((ProtoLiteMessage)hfgi.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfgi hfgi0 = (hfgi)this.b_message;
        hfgh hfgh0 = (hfgh)hftp0.N_build();
        hfgh0.getClass();
        hfuo hfuo0 = hfgi0.d;
        if(!hfuo0.c()) {
            hfgi0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfgi0.d.add(hfgh0);
    }
}

