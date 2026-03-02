import j..util.Objects;

public final class flrg implements kar {
    public final ProtoLiteBuilder a;

    public flrg(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdk.a).v_newBuilder();
        Objects.requireNonNull(hftp0);
        flrz flrz0 = new flrz(hftp0);
        flbl.b(((fmap)object0).a, flrz0);
        Objects.requireNonNull(hftp0);
        flsa flsa0 = new flsa(hftp0);
        flbl.b(((fmap)object0).b, flsa0);
        Objects.requireNonNull(hftp0);
        flsb flsb0 = new flsb(hftp0);
        flbl.b(((fmap)object0).c, flsb0);
        gmdk gmdk0 = (gmdk)hftp0.N_build();
        ProtoLiteBuilder hftp1 = this.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp1.b_message;
        gmdk0.getClass();
        gmdi0.r = gmdk0;
        gmdi0.b |= 0x40;
    }
}

