import j..util.Objects;

final class czzj implements ibkd {
    final gmcu a;
    final czzm b;
    final String c;
    final czzk d;
    final int e;

    public czzj(czzk czzk0, gmcu gmcu0, czzm czzm0, String s, int v) {
        this.a = gmcu0;
        this.b = czzm0;
        this.c = s;
        this.e = v;
        Objects.requireNonNull(czzk0);
        this.d = czzk0;
        super();
    }

    @Override  // ibkd
    public final void a() {
        czkq.a.b().p("Finished receiving messages from tachyon.", new Object[0]);
        RuntimeException runtimeException0 = new RuntimeException("ReceiveMessagesExpress stream has completed.");
        this.a.r(runtimeException0);
    }

    @Override  // ibkd
    public final void b(Throwable throwable0) {
        czkq.a.e().f(throwable0).p("Failed to receive messages from tachyon with an error.", new Object[0]);
        if(this.e == 3 && this.d.b()) {
            czke.s(this.c, 8, gymb.m, gymd.bk);
        }
        this.a.r(throwable0);
    }

    @Override  // ibkd
    public final void c(Object object0) {
        switch(((hnwl)object0).b) {
            case 2: {
                czkq.a.b().p("Received inbox message from tachyon.", new Object[0]);
                this.b.a((((hnwl)object0).b == 2 ? ((hnwb)((hnwl)object0).c) : hnwb.a).d.toByteArray());
                return;
            }
            case 7: {
                czkq.a.b().p("Received fast path ready message from tachyon.", new Object[0]);
                this.a.q(null);
            }
        }
    }
}

