import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;

public final class ctww extends ibsl implements ibtw {
    int a;
    final NotificationSyncChimeraService b;

    public ctww(NotificationSyncChimeraService notificationSyncChimeraService0, ibrl ibrl0) {
        this.b = notificationSyncChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctww)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctww(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctye ctye0 = this.b.n();
            this.a = 1;
            if(ctye.c(this.b.f)) {
                icmn icmn0 = ctye0.b;
                cuaz cuaz0 = cuay.a(((ProtoLiteMessage)cuaq.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuax.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((cuax)hftv0), "value");
                ProtoLiteBuilder hftp1 = cuaz0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                cuaq cuaq0 = (cuaq)hftp1.b_message;
                ((cuax)hftv0).getClass();
                cuaq0.c = (cuax)hftv0;
                cuaq0.b = 2;
                object2 = icmn0.a(cuaz0.a(), this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
            }
            else {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

