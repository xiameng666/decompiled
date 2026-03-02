public final class bpbe implements gfsi {
    public final bpjm a;
    public final fqzl b;

    public bpbe(bpjm bpjm0, fqzl fqzl0) {
        this.a = bpjm0;
        this.b = fqzl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hady.a).v_newBuilder();
        hadx hadx0 = hadx.r;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bpjm bpjm0 = this.a;
        hady hady0 = (hady)hftp0.b_message;
        hady0.c = hadx0.a();
        hady0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady1 = (hady)hftp0.b_message;
        hady1.d = bpjm0.g.a();
        hady1.b |= 2;
        hadw hadw0 = bpkq.a(bouv.e(this.b));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady2 = (hady)hftp0.b_message;
        hady2.e = hadw0.a();
        hady2.b |= 4;
        hady hady3 = (hady)hftp0.N_build();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hady3.getClass();
        hadp0.e = hady3;
        hadp0.b |= 4;
        return (ProtoLiteBuilder)object0;
    }
}

