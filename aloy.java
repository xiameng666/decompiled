import j..util.Objects;

final class aloy implements gmbg {
    final aluw a;
    final aloz b;

    public aloy(aloz aloz0, aluw aluw0) {
        this.a = aluw0;
        Objects.requireNonNull(aloz0);
        this.b = aloz0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        aloz.a.n("Failed to create PhoneProperties and send PhoneStatusUpdate", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aluw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aloz aloz0 = this.b;
        aluw aluw0 = (aluw)hftp0.b_message;
        ((aluu)object0).getClass();
        aluw0.c = (aluu)object0;
        aluw0.b |= 1;
        hftp0.X(((ProtoLiteMessage)this.a));
        aloz0.l(((MessageLite)hftp0.N_build()));
        if(hpzm.D()) {
            aloz0.p(true);
        }
    }
}

