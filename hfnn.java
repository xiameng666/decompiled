public final class hfnn extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfnn() {
        super(((ProtoLiteMessage)hfno.a));
    }

    public final void a(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfno hfno0 = (hfno)this.b_message;
        hfno0.b();
        hfno0.d.i(v);
    }
}

