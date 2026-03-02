public final class gsua extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsua() {
        super(((ProtoLiteMessage)gsub.b));
    }

    public final void a(gsuc gsuc0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsub gsub0 = (gsub)this.b_message;
        gsuc0.getClass();
        gsub0.b();
        gsub0.e.i(gsuc0.a());
    }

    public final void k() {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsub gsub0 = (gsub)this.b_message;
        hfuf hfuf0 = gsub0.f;
        if(!hfuf0.c()) {
            gsub0.f = ProtoLiteMessage.C(hfuf0);
        }
        gsub0.f.i(2);
    }
}

