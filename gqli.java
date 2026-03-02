public final class gqli extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gqli() {
        super(((ProtoLiteMessage)gqlj.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gqlj gqlj0 = (gqlj)this.b_message;
        hfuf hfuf0 = gqlj0.e;
        if(!hfuf0.c()) {
            gqlj0.e = ProtoLiteMessage.C(hfuf0);
        }
        gqlj0.e.i(v - 2);
    }
}

