public final class hobm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hobm() {
        super(((ProtoLiteMessage)hobn.a));
    }

    public final void a(hobl hobl0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hobn hobn0 = (hobn)this.b_message;
        hobl0.getClass();
        hfuf hfuf0 = hobn0.c;
        if(!hfuf0.c()) {
            hobn0.c = ProtoLiteMessage.C(hfuf0);
        }
        hobn0.c.i(hobl0.a());
    }
}

