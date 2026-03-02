import j..time.Duration;

public final class bpkp implements gfsi {
    public final bpkq a;
    public final hadx b;
    public final bpko c;
    public final hadw d;

    public bpkp(bpkq bpkq0, hadx hadx0, bpko bpko0, hadw hadw0) {
        this.a = bpkq0;
        this.b = hadx0;
        this.c = bpko0;
        this.d = hadw0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hady.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bpko bpko0 = this.c;
        hady hady0 = (hady)hftp0.b_message;
        hady0.c = this.b.a();
        hady0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady1 = (hady)hftp0.b_message;
        hady1.d = bpko0.h.a();
        hady1.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady2 = (hady)hftp0.b_message;
        hady2.e = this.d.a();
        hady2.b |= 4;
        int v = (int)Duration.ofMillis(this.a.a.a()).minusSeconds(bpko0.f).toSeconds();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hady)hftv0).b |= 8;
        ((hady)hftv0).f = v;
        float f = (float)bpko0.i;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady3 = (hady)hftp0.b_message;
        hady3.b |= 0x20;
        hady3.h = f;
        hady hady4 = (hady)hftp0.N_build();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hady4.getClass();
        hadp0.e = hady4;
        hadp0.b |= 4;
        return (ProtoLiteBuilder)object0;
    }
}

