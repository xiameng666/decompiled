public final class gird extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gird() {
        super(((ProtoLiteMessage)girf.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        girf girf0 = (girf)this.b_message;
        hfuo hfuo0 = girf0.i;
        if(!hfuo0.c()) {
            girf0.i = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, girf0.i);
    }
}

