public final class dpdw extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dpdw() {
        super(((ProtoLiteMessage)dpdy.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dpdy dpdy0 = (dpdy)this.b_message;
        dpdy0.b();
        dpdy0.d.remove(v);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dpdy dpdy0 = (dpdy)this.b_message;
        dpdx dpdx0 = (dpdx)hftp0.N_build();
        dpdx0.getClass();
        dpdy0.b();
        dpdy0.d.add(dpdx0);
    }
}

