import j..util.Objects;

public final class flrm implements kar {
    public final ProtoLiteBuilder a;

    public flrm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdj.a).v_newBuilder();
        Objects.requireNonNull(hftp0);
        flsc flsc0 = new flsc(hftp0);
        flbl.b(((fman)object0).b, flsc0);
        Objects.requireNonNull(hftp0);
        flsd flsd0 = new flsd(hftp0);
        flbl.b(((fman)object0).a, flsd0);
        Objects.requireNonNull(hftp0);
        flse flse0 = new flse(hftp0);
        flbl.b(((fman)object0).c, flse0);
        gmdj gmdj0 = (gmdj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp1.b_message;
        gmdj0.getClass();
        gmdi0.t = gmdj0;
        gmdi0.b |= 0x100;
    }
}

