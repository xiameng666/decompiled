public final class aiux implements gfsi {
    public final String a;

    public aiux(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ajaz ajaz0 = ((ajba)object0).c;
        if(ajaz0 == null) {
            ajaz0 = ajaz.a;
        }
        String s = this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajaz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ajaz0));
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajaz)hftp0.b_message).b().remove(s);
        ajaz ajaz1 = (ajaz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajba)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((ajba)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ajba ajba0 = (ajba)hftp1.b_message;
        ajaz1.getClass();
        ajba0.c = ajaz1;
        ajba0.b |= 1;
        return (ajba)hftp1.N_build();
    }
}

