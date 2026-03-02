public final class cqqy implements gfsi {
    public final int a;

    public cqqy(int v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hgzp hgzp0 = hgzp.ds;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((hgzi)((ProtoLiteBuilder)object0).b_message).c = this.a - 1;
        ((hgzi)((ProtoLiteBuilder)object0).b_message).b |= 1;
        return cqrb.b(hgzp0, ((hgzi)((ProtoLiteBuilder)object0).N_build()));
    }
}

