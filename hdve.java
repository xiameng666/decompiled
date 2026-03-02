public final class hdve extends ProtoLiteBuilder implements hdvg {
    public hdve() {
        super(((ProtoLiteMessage)hdvf.a));
    }

    @Override  // hdvg
    public final hcim a() {
        hdvf hdvf0 = (hdvf)this.b_message;
        return hdvf0.b == 4 ? ((hcim)hdvf0.c) : hcim.a;
    }

    @Override  // hdvg
    public final hcst k() {
        hdvf hdvf0 = (hdvf)this.b_message;
        return hdvf0.b == 2 ? ((hcst)hdvf0.c) : hcst.a;
    }

    @Override  // hdvg
    public final boolean l() {
        return ((hdvf)this.b_message).b == 4;
    }
}

