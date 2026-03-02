public final class gyod extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gyod() {
        super(((ProtoLiteMessage)gyoe.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyoe gyoe0 = (gyoe)this.b_message;
        hfuo hfuo0 = gyoe0.j;
        if(!hfuo0.c()) {
            gyoe0.j = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gyoe0.j);
    }
}

