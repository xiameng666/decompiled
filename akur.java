import com.google.android.gms.auth.proximity.BleBackgroundAdvertiser.WakeUpBroadcastReceiver;
import j..util.Objects;

public final class akur implements akup {
    final esaa a;
    final BleBackgroundAdvertiser.WakeUpBroadcastReceiver b;

    public akur(BleBackgroundAdvertiser.WakeUpBroadcastReceiver bleBackgroundAdvertiser$WakeUpBroadcastReceiver0, esaa esaa0) {
        this.a = esaa0;
        Objects.requireNonNull(bleBackgroundAdvertiser$WakeUpBroadcastReceiver0);
        this.b = bleBackgroundAdvertiser$WakeUpBroadcastReceiver0;
        super();
    }

    @Override  // akup
    public final void a(String s) {
        akus.a.m("Advertisement rotation failed: %s", new Object[]{String.valueOf(s)});
        this.b.a.f(4, 3);
        this.b.a.b();
        this.a.g();
    }

    @Override  // akup
    public final void b() {
        if(hpzm.g()) {
            akus akus0 = this.b.a;
            long v = akus0.k == 0L ? -1L : System.currentTimeMillis() - akus0.k;
            if(hpzm.B()) {
                aliv aliv0 = akus0.l;
                if(aliv0 != null && hpzm.B()) {
                    aliv0.b();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzzp.a).v_newBuilder();
                    aliv0.e(hftp0, "BleAdvertisementEvent");
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzzl.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((gzzl)hftv0).c = 3;
                    ((gzzl)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((gzzl)hftv1).d = 1;
                    ((gzzl)hftv1).b |= 2;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gzzl gzzl0 = (gzzl)hftp1.b_message;
                    gzzl0.b |= 4;
                    gzzl0.e = v;
                    gzzl gzzl1 = (gzzl)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gzzp gzzp0 = (gzzp)hftp0.b_message;
                    gzzl1.getClass();
                    gzzp0.d = gzzl1;
                    gzzp0.c = 2;
                    cdzd.v().j(((ProtoLiteMessage)(((gzzp)hftp0.N_build()))));
                }
            }
        }
        else {
            this.b.a.f(4, 2);
        }
        this.b.a.k = System.currentTimeMillis();
        this.a.g();
    }
}

