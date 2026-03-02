public final class hdwv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdwv() {
        super(((ProtoLiteMessage)hdwy.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdwy hdwy0 = (hdwy)this.b_message;
        hfuf hfuf0 = hdwy0.e;
        if(!hfuf0.c()) {
            hdwy0.e = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, hdwy0.e);
    }
}

