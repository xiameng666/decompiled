public final class igtm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public igtm() {
        super(((ProtoLiteMessage)igtn.a));
    }

    public final void a(igtl igtl0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        igtn igtn0 = (igtn)this.b_message;
        igtl0.getClass();
        hfuo hfuo0 = igtn0.d;
        if(!hfuo0.c()) {
            igtn0.d = ProtoLiteMessage.E(hfuo0);
        }
        igtn0.d.add(igtl0);
    }
}

