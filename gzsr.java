public final class gzsr extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzsr() {
        super(((ProtoLiteMessage)gzss.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzss gzss0 = (gzss)this.b_message;
        hfuo hfuo0 = gzss0.e;
        if(!hfuo0.c()) {
            gzss0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gzss0.e);
    }
}

