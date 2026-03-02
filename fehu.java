import j..time.Duration;

public final class fehu {
    public final ccyz a;

    public fehu() {
        fdob fdob0 = fdob.b();
        this.a = fdob0.b.i(fdnm.o.p, fdob0.g);
    }

    public static final void a(ccyy ccyy0) {
        ccyz ccyz0 = ccyy0.b;
        ccyv ccyv0 = ccyz0.f.f;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccwq.a).v_newBuilder();
        String s = ccyz0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((ccwq)hftv0).b |= 1;
        ((ccwq)hftv0).c = s;
        ccwp ccwp0 = ccwp.f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ccwq)hftp0.b_message).d = ccwp0.g;
        ((ccwq)hftp0.b_message).b |= 2;
        long v = ccyy0.a();
        long v1 = ccyz0.b.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ccwq)hftv1).b |= 16;
        ((ccwq)hftv1).g = v1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ccwq ccwq0 = (ccwq)hftp0.b_message;
        ccwq0.b |= 0x20;
        ccwq0.h = 1L;
        ccyy0.a.a(hftp0, ccyv0);
        ffmn.a("BleOffloadStats", "Logged connection duration: %d seconds", new Object[]{Duration.ofMillis(ccyy0.a()).toSeconds()});
    }
}

