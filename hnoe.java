public final class hnoe extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hnoe() {
        super(((ProtoLiteMessage)hnof.a));
    }

    public final void a(long v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hnof hnof0 = (hnof)this.b_message;
        hfui hfui0 = hnof0.b;
        if(!hfui0.c()) {
            hnof0.b = ProtoLiteMessage.D(hfui0);
        }
        hnof0.b.g(v);
    }

    public final void k(String s) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hnof hnof0 = (hnof)this.b_message;
        hfuo hfuo0 = hnof0.c;
        if(!hfuo0.c()) {
            hnof0.c = ProtoLiteMessage.E(hfuo0);
        }
        hnof0.c.add(s);
    }
}

