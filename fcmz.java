import j..util.Collection.-EL;

public final class fcmz implements gfsi {
    public final ProtoLiteBuilder a;

    public fcmz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Iterable iterable0 = (Iterable)Collection.-EL.stream(((gged_interceptors)object0)).map(new fcms()).collect(ggaf.a);
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fext fext0 = (fext)hftp0.b_message;
        hfuo hfuo0 = fext0.d;
        if(!hfuo0.c()) {
            fext0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, fext0.d);
        fcnm.a.j("fetchBackupStatus() finished", new Object[0]);
        return (fext)hftp0.N_build();
    }
}

