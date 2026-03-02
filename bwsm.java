public final class bwsm implements glzn {
    public final String[] a;
    public final bwmx b;
    public final long c;
    public final String d;

    public bwsm(String[] arr_s, bwmx bwmx0, long v, String s) {
        this.a = arr_s;
        this.b = bwmx0;
        this.c = v;
        this.d = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gged_interceptors gged0 = gged_interceptors.k(this.a);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnj glnj0 = (glnj)hftp0.b_message;
        glnj0.b |= 1;
        glnj0.c = this.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((glnj)hftp0.b_message).d = 4;
        ((glnj)hftp0.b_message).b |= 2;
        afo afo0 = new afo("legacy_icing");
        afo0.b(gged0);
        gmcd gmcd0 = ((fkno)object0).c(afo0.a());
        gmbu.t(gmcd0, new bxbu(hftp0, this.b.r, this.c), gmap.a);
        return gmcd0;
    }
}

