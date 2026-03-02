public final class dxyh implements gfsi {
    public final Iterable a;
    public final Iterable b;

    public dxyh(Iterable iterable0, Iterable iterable1) {
        this.a = iterable0;
        this.b = iterable1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ftaj)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ftaj)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfvv hfvv0 = hfvv.a;
        ((ftaj)hftp0.b_message).c = hfvv0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftaj ftaj0 = (ftaj)hftp0.b_message;
        hfuo hfuo0 = ftaj0.c;
        if(!hfuo0.c()) {
            ftaj0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, ftaj0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftaj)hftp0.b_message).b = hfvv0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftaj ftaj1 = (ftaj)hftp0.b_message;
        ftaj1.b();
        hfrj.E(this.b, ftaj1.b);
        return (ftaj)hftp0.N_build();
    }
}

