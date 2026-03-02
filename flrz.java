public final class flrz implements kar {
    public final ProtoLiteBuilder a;

    public flrz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        int v = (int)(((Integer)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmdk)hftp0.b_message).c = v;
    }
}

