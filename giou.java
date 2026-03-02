public final class giou extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public giou() {
        super(((ProtoLiteMessage)gioy.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gioy gioy0 = (gioy)this.b_message;
        hfuo hfuo0 = gioy0.i;
        if(!hfuo0.c()) {
            gioy0.i = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gioy0.i);
    }
}

