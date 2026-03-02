import j..util.Optional;

public final class fcna implements glzm {
    public final fcnm a;

    public fcna(fcnm fcnm0) {
        this.a = fcnm0;
    }

    @Override  // glzm
    public final gmcd a() {
        fcnm.a.j("fetchBackupStatus() start", new Object[0]);
        fcnm fcnm0 = this.a;
        Optional optional0 = fcnm0.d.i() ? Optional.ofNullable(fcnm0.e.a()) : Optional.empty();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fext.a).v_newBuilder();
        boolean z = optional0.isPresent();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fext fext0 = (fext)hftp0.b_message;
        fext0.b |= 1;
        fext0.c = z;
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fext fext1 = (fext)hftp0.b_message;
        hfwn0.getClass();
        fext1.f = hfwn0;
        fext1.b |= 8;
        optional0.ifPresent(new fcmy(hftp0));
        return glzd.f(fcnm0.h(), new fcmz(hftp0), gmap.a);
    }
}

