public final class gsom extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsom() {
        super(((ProtoLiteMessage)gson.a));
    }

    public final void a(gspt gspt0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gson gson0 = (gson)this.b_message;
        gspu gspu0 = (gspu)((ProtoLiteBuilder)gspt0).N_build();
        gspu0.getClass();
        hfuo hfuo0 = gson0.d;
        if(!hfuo0.c()) {
            gson0.d = ProtoLiteMessage.E(hfuo0);
        }
        gson0.d.add(gspu0);
    }
}

