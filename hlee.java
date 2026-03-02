public final class hlee extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlee() {
        super(((ProtoLiteMessage)hleg.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hleg hleg0 = (hleg)this.b_message;
        hfue hfue0 = hleg0.h;
        if(!hfue0.c()) {
            hleg0.h = ProtoLiteMessage.B(hfue0);
        }
        hfrj.E(iterable0, hleg0.h);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hleg hleg0 = (hleg)this.b_message;
        hfuf hfuf0 = hleg0.g;
        if(!hfuf0.c()) {
            hleg0.g = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, hleg0.g);
    }

    public final void l(String s, hleb hleb0) {
        s.getClass();
        hleb0.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((hleg)this.b_message).b().put(s, hleb0);
    }
}

