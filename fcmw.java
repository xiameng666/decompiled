import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;

public final class fcmw implements gfsi {
    public final fcnm a;
    public final gqtz b;

    public fcmw(fcnm fcnm0, gqtz gqtz0) {
        this.a = fcnm0;
        this.b = gqtz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Status status0 = (Status)object0;
        fcnm.a.h("Disabling backup", new Object[0]);
        fcnm fcnm0 = this.a;
        fcnm0.d.f(false);
        gico gico0 = fcnm.g(this.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gigr)hftv0).c = 2;
        ((gigr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gigr)hftp0.b_message).d = gico0.q;
        ((gigr)hftp0.b_message).b |= 2;
        gigr gigr0 = (gigr)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        gigr0.getClass();
        ((giaq)hftv1).o = gigr0;
        ((giaq)hftv1).b |= 0x8000;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giaq)hftp1.b_message).e = 18;
        ((giaq)hftp1.b_message).b |= 4;
        giaq giaq0 = (giaq)hftp1.N_build();
        fcnm0.i.a(giaq0);
        WearBackupOptInNotificationService.f(fcnm0.b).b(new fctw(), gmap.a);
        return null;
    }
}

