public final class gxsv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gxsv() {
        super(((ProtoLiteMessage)gxsw.a));
    }

    public final void a(gxti gxti0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gxsw gxsw0 = (gxsw)this.b_message;
        gxti0.getClass();
        gxsw0.b();
        gxsw0.e.add(gxti0);
    }

    public final void k(gxst gxst0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gxsw gxsw0 = (gxsw)this.b_message;
        gxst0.getClass();
        hfuo hfuo0 = gxsw0.d;
        if(!hfuo0.c()) {
            gxsw0.d = ProtoLiteMessage.E(hfuo0);
        }
        gxsw0.d.add(gxst0);
    }
}

