public final class gzpc extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzpc() {
        super(((ProtoLiteMessage)gzpf.a));
    }

    @Deprecated
    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzpf gzpf0 = (gzpf)this.b_message;
        hfuf hfuf0 = gzpf0.g;
        if(!hfuf0.c()) {
            gzpf0.g = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, gzpf0.g);
    }
}

