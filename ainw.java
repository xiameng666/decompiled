import j..util.Objects;

final class ainw implements gmbg {
    public ainw(ainy ainy0) {
        Objects.requireNonNull(ainy0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(ainy.a.i(), "Failed to buffer addAppRestoreNotificationEvent.", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        ((ggtj)ainy.a.h()).x("Buffered an AppRestoreNotificationEvent. Flush task scheduled");
    }
}

