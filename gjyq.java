public final class gjyq extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gjyq() {
        super(((ProtoLiteMessage)gjyu.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gjyu gjyu0 = (gjyu)this.b_message;
        hfuo hfuo0 = gjyu0.c;
        if(!hfuo0.c()) {
            gjyu0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gjyu0.c);
    }
}

