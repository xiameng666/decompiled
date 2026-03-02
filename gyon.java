public final class gyon extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gyon() {
        super(((ProtoLiteMessage)gyoo.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyoo gyoo0 = (gyoo)this.b_message;
        hfuo hfuo0 = gyoo0.j;
        if(!hfuo0.c()) {
            gyoo0.j = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gyoo0.j);
    }

    public final void k(gyod gyod0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyoo gyoo0 = (gyoo)this.b_message;
        gyoe gyoe0 = (gyoe)((ProtoLiteBuilder)gyod0).N_build();
        gyoe0.getClass();
        hfuo hfuo0 = gyoo0.g;
        if(!hfuo0.c()) {
            gyoo0.g = ProtoLiteMessage.E(hfuo0);
        }
        gyoo0.g.add(gyoe0);
    }

    public final void l(gyxw gyxw0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyoo gyoo0 = (gyoo)this.b_message;
        gyxw0.getClass();
        hfuf hfuf0 = gyoo0.f;
        if(!hfuf0.c()) {
            gyoo0.f = ProtoLiteMessage.C(hfuf0);
        }
        gyoo0.f.i(gyxw0.d);
    }

    public final void m(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyoo gyoo0 = (gyoo)this.b_message;
        gyns gyns0 = (gyns)hftp0.N_build();
        gyns0.getClass();
        hfuo hfuo0 = gyoo0.i;
        if(!hfuo0.c()) {
            gyoo0.i = ProtoLiteMessage.E(hfuo0);
        }
        gyoo0.i.add(gyns0);
    }
}

