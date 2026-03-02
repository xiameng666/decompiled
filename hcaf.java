public final class hcaf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hcaf() {
        super(((ProtoLiteMessage)hcam.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hcam hcam0 = (hcam)this.b_message;
        hfuo hfuo0 = hcam0.c;
        if(!hfuo0.c()) {
            hcam0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hcam0.c);
    }
}

