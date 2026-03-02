public final class hlws extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlws() {
        super(((ProtoLiteMessage)hlwt.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlwt hlwt0 = (hlwt)this.b_message;
        hfuf hfuf0 = hlwt0.d;
        if(!hfuf0.c()) {
            hlwt0.d = ProtoLiteMessage.C(hfuf0);
        }
        hlwt0.d.i(v - 1);
    }
}

