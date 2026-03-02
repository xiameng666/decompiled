public final class gsar extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsar() {
        super(((ProtoLiteMessage)gsax.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsax gsax0 = (gsax)this.b_message;
        hfuf hfuf0 = gsax0.c;
        if(!hfuf0.c()) {
            gsax0.c = ProtoLiteMessage.C(hfuf0);
        }
        gsax0.c.i(v - 1);
    }
}

