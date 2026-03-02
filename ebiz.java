public final class ebiz implements ibts {
    public final ibvc a;

    public ebiz(ibvc ibvc0) {
        this.a = ibvc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dymo dymo0 = (dymo)object0;
        ibuq.f(dymo0, "it");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dymo0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dymo0));
        dyms dyms0 = dymr.a(((dymj)hftp0));
        hfwn hfwn0 = hfyn.h(this.a.a);
        ibuq.e(hfwn0, "fromMillis(...)");
        dyms0.b(hfwn0);
        dyms0.f();
        dyms0.c();
        return dyms0.a();
    }
}

