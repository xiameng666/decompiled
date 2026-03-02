public final class hnsi extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hnsi() {
        super(((ProtoLiteMessage)hnsj.a));
    }

    public final void a(hnry hnry0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hnsj hnsj0 = (hnsj)this.b_message;
        hnry0.getClass();
        hfuo hfuo0 = hnsj0.b;
        if(!hfuo0.c()) {
            hnsj0.b = ProtoLiteMessage.E(hfuo0);
        }
        hnsj0.b.add(hnry0);
    }
}

