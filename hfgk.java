public final class hfgk extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfgk() {
        super(((ProtoLiteMessage)hfgm.a));
    }

    public final void a(hfgl hfgl0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfgm hfgm0 = (hfgm)this.b_message;
        hfgl0.getClass();
        hfuo hfuo0 = hfgm0.d;
        if(!hfuo0.c()) {
            hfgm0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfgm0.d.add(hfgl0);
    }
}

