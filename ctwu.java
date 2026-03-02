import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;

public final class ctwu extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;

    public ctwu(NotificationSyncChimeraService notificationSyncChimeraService0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctwu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctwu(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnj icnj0 = this.b.i().b();
            ctwt ctwt0 = new ctwt(this.b);
            this.a = 1;
            if(icnj0.oR(ctwt0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

