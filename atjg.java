import j..util.Objects;

final class atjg implements Runnable {
    final atjh a;

    public atjg(atjh atjh0) {
        Objects.requireNonNull(atjh0);
        this.a = atjh0;
        super();
    }

    @Override
    public final void run() {
        atjh atjh0 = this.a;
        atji atji0 = atjh0.p;
        if(atji0 != null) {
            atji0.a(atjh0.k, atjh0.l);
            aqys aqys0 = atjh0.o;
            int v = atjh0.k;
            int v1 = atjh0.l;
            ProtoLiteBuilder hftp0 = aqra.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gifl)hftv0).c = 2;
            ((gifl)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gifl)hftv1).b |= 16;
            ((gifl)hftv1).g = (long)v;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gifl gifl0 = (gifl)hftp1.b_message;
            gifl0.b |= 0x20;
            gifl0.h = (long)v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            gifl gifl1 = (gifl)hftp1.N_build();
            gifl1.getClass();
            ghys0.af = gifl1;
            ghys0.d |= 0x40;
            aqys0.x(hftp0, ghyr.ar, aqys0.c);
        }
    }
}

