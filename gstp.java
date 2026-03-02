public final class gstp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gstp() {
        super(((ProtoLiteMessage)gstq.a));
    }

    public final void a() {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gstq gstq0 = (gstq)this.b_message;
        hfuf hfuf0 = gstq0.e;
        if(!hfuf0.c()) {
            gstq0.e = ProtoLiteMessage.C(hfuf0);
        }
        gstq0.e.i(3);
    }
}

