import j..util.Objects;

final class alox implements gmbg {
    final boolean a;
    final aloz b;
    final ProtoLiteBuilder c;

    public alox(aloz aloz0, ProtoLiteBuilder hftp0, boolean z) {
        this.c = hftp0;
        this.a = z;
        Objects.requireNonNull(aloz0);
        this.b = aloz0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        aloz.a.m("Failed to create PhoneProperties and send PhoneStatusSnapshot", new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aluv aluv0 = (aluv)hftp0.b_message;
        ((aluu)object0).getClass();
        aluv0.c = (aluu)object0;
        aluv0.b |= 1;
        aloz aloz0 = this.b;
        aloz0.l(((MessageLite)hftp0.N_build()));
        if(hpzm.n() && !this.a && aloz0.s()) {
            aloz0.m(true);
        }
    }
}

