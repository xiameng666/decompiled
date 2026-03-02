public final class dcir extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dcir() {
        super(((ProtoLiteMessage)dcis.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dcis dcis0 = (dcis)this.b_message;
        hfuo hfuo0 = dcis0.g;
        if(!hfuo0.c()) {
            dcis0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, dcis0.g);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dcis dcis0 = (dcis)this.b_message;
        hfui hfui0 = dcis0.h;
        if(!hfui0.c()) {
            dcis0.h = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, dcis0.h);
    }
}

