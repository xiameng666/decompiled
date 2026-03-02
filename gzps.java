public final class gzps extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzps() {
        super(((ProtoLiteMessage)gzpt.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzpt gzpt0 = (gzpt)this.b_message;
        hfuf hfuf0 = gzpt0.b;
        if(!hfuf0.c()) {
            gzpt0.b = ProtoLiteMessage.C(hfuf0);
        }
        gzpt0.b.i(v - 1);
    }
}

