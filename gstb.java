public final class gstb extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gstb() {
        super(((ProtoLiteMessage)gstc.a));
    }

    public final void a() {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gstc gstc0 = (gstc)this.b_message;
        hfuf hfuf0 = gstc0.b;
        if(!hfuf0.c()) {
            gstc0.b = ProtoLiteMessage.C(hfuf0);
        }
        gstc0.b.i(1);
    }
}

