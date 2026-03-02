public final class gxpr extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gxpr() {
        super(((ProtoLiteMessage)gxps.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gxps gxps0 = (gxps)this.b_message;
        hfuf hfuf0 = gxps0.c;
        if(!hfuf0.c()) {
            gxps0.c = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            gxps0.c.i(((gxrc)object0).h);
        }
    }
}

