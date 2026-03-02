public final class flxj implements kar {
    public final fmgx a;
    public final ProtoLiteBuilder b;

    public flxj(ProtoLiteBuilder hftp0, fmgx fmgx0) {
        this.b = hftp0;
        this.a = fmgx0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        boolean z = ((Boolean)this.a.d().d()).booleanValue();
        ProtoLiteBuilder hftp0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnva)hftp0.b_message).g = z;
    }
}

