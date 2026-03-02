public final class gzgz extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzgz() {
        super(((ProtoLiteMessage)gzhd.c));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzhd gzhd0 = (gzhd)this.b_message;
        hfui hfui0 = gzhd0.m;
        if(!hfui0.c()) {
            gzhd0.m = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, gzhd0.m);
    }
}

