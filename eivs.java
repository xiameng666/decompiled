public final class eivs implements gfsi {
    public final gfsi a;

    public eivs(gfsi gfsi0) {
        this.a = gfsi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggek ggek0 = new ggek();
        for(Object object1: ((eiwe)object0).b) {
            ggek0.i(((eiwd)object1).c, ((eiwd)object1));
        }
        ggeo ggeo0 = ggek0.g();
        ggeo ggeo1 = (ggeo)this.a.apply(ggeo0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eiwe.a).v_newBuilder();
        ggds ggds0 = ggeo1.g();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eiwe eiwe0 = (eiwe)hftp0.b_message;
        hfuo hfuo0 = eiwe0.b;
        if(!hfuo0.c()) {
            eiwe0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(ggds0, eiwe0.b);
        return (eiwe)hftp0.N_build();
    }
}

