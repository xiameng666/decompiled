public final class gjna extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gjna() {
        super(((ProtoLiteMessage)gjnb.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gjnb gjnb0 = (gjnb)this.b_message;
        hfuf hfuf0 = gjnb0.e;
        if(!hfuf0.c()) {
            gjnb0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, gjnb0.e);
    }
}

