public final class gibh extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gibh() {
        super(((ProtoLiteMessage)gibj.a));
    }

    public final void a(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gibj gibj0 = (gibj)this.b_message;
        s.getClass();
        hfuo hfuo0 = gibj0.e;
        if(!hfuo0.c()) {
            gibj0.e = ProtoLiteMessage.E(hfuo0);
        }
        gibj0.e.add(s);
    }
}

