import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;

final class ctwz extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;

    public ctwz(NotificationSyncChimeraService notificationSyncChimeraService0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwz(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ykm ykm0 = this.b.f();
            ctye ctye0 = this.b.n();
            this.a = 1;
            if(ykm0.b(ctye0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

