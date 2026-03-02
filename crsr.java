public final class crsr extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public crsr() {
        super(((ProtoLiteMessage)crss.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crss crss0 = (crss)this.b_message;
        crss0.b();
        hfrj.E(iterable0, crss0.c);
    }

    public final void k(crst crst0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crss crss0 = (crss)this.b_message;
        crsu crsu0 = (crsu)((ProtoLiteBuilder)crst0).N_build();
        crsu0.getClass();
        crss0.b();
        crss0.c.add(crsu0);
    }

    public final void l(int v, crst crst0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        crss crss0 = (crss)this.b_message;
        crsu crsu0 = (crsu)((ProtoLiteBuilder)crst0).N_build();
        crsu0.getClass();
        crss0.b();
        crss0.c.set(v, crsu0);
    }
}

